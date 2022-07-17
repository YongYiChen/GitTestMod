package net.modding.tutorialMod.titaniumBlock;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.modding.tutorialMod.TutorialMod;
import net.modding.tutorialMod.item.ModItems;
import net.modding.tutorialMod.tutoriaModCreativeTab.TutorialModCreativeTab;

import javax.swing.*;
import java.util.function.Supplier;

public class TitaniumBlock {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, TutorialMod.MOD_ID);

    public static final RegistryObject<Block> Titanium_block = registerBlock("titaniumblock",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(0.5f).requiresCorrectToolForDrops()), TutorialModCreativeTab.Tutorial_Tab);

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab){
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab){
        RegistryObject<T> Return = BLOCKS.register(name, block);
        registerBlockItem(name, Return, tab);
        return Return;
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}

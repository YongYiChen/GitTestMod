package net.modding.tutorialMod.fast_sword;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.modding.tutorialMod.TutorialMod;
import net.modding.tutorialMod.tutoriaModCreativeTab.TutorialModCreativeTab;

public class fastSword {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);
    public static final RegistryObject<Item> fastSword =
            ITEMS.register("fastsword", () -> new Item(new Item.Properties().tab(TutorialModCreativeTab.Tutorial_Tab)));
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}

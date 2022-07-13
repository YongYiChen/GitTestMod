package net.modding.tutorialMod.tutoriaModCreativeTab;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.modding.tutorialMod.item.ModItems;

public class TutorialModCreativeTab {
    public static final CreativeModeTab Tutorial_Tab = new CreativeModeTab("tutorialtab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.ObsidianIngot.get());
        }
    };
}

package org.tmon.tricraft.items;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {
    public static final ForgeTier GIGERIUM = new ForgeTier(
            4,
            1700,
            9.0F,
            3.0F,
            15,
            BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(ModItems.GIGERIUM_INGOT.get())
    );
    public static final ForgeTier INES = new ForgeTier(
            4,
            3000,
            13.0F,
            5.0F,
            15,
            BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ModItems.INES_INGOT.get())
    );
}
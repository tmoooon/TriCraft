package org.tmon.tricraft.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import org.tmon.tricraft.TriCraft;
import org.tmon.tricraft.block.ModBlocks;

public class ModItemsGroup {
    public static final ItemGroup NEW_GROUP = FabricItemGroup.builder(new Identifier(TriCraft.MOD_ID, "new_group")).icon(() -> new ItemStack(ModItems.INES_SWORD)).build();
}

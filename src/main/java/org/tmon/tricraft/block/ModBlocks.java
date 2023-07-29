package org.tmon.tricraft.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import org.tmon.tricraft.TriCraft;
import org.tmon.tricraft.item.ModItemsGroup;

public class ModBlocks {
    public static final Block GIGERIUM_BLOCK = registerBlock("gigerium_block", new Block(FabricBlockSettings.of(Material.METAL).strength(3.0f).requiresTool()), ModItemsGroup.NEW_GROUP);
    public static final Block INES_BLOCK = registerBlock("ines_block", new Block(FabricBlockSettings.of(Material.METAL).strength(3.0f).requiresTool()), ModItemsGroup.NEW_GROUP);
    public static final Block GIGERIUM_ORE = registerBlock("gigerium_ore", new Block(FabricBlockSettings.of(Material.STONE).strength(3.0f).requiresTool()), ModItemsGroup.NEW_GROUP);
    public static final Block DEEPSLATE_GIGERIUM_ORE = registerBlock("deepslate_gigerium_ore", new Block(FabricBlockSettings.of(Material.STONE).strength(3.0f).requiresTool()), ModItemsGroup.NEW_GROUP);
    public static final Block NETHER_INES_ORE = registerBlock("nether_ines_ore", new Block(FabricBlockSettings.of(Material.STONE).strength(3.0f).requiresTool()), ModItemsGroup.NEW_GROUP);
    public static final Block END_INES_ORE = registerBlock("end_ines_ore", new Block(FabricBlockSettings.of(Material.STONE).strength(3.0f).requiresTool()), ModItemsGroup.NEW_GROUP);
    private static Block registerBlock(String id, Block block, ItemGroup itemGroup){
        registerBlockItem(id, block, itemGroup);
        return Registry.register(Registries.BLOCK, new Identifier(TriCraft.MOD_ID, id), block);
    }
    private static Item registerBlockItem(String id, Block block, ItemGroup itemGroup){
        Item item = Registry.register(Registries.ITEM, new Identifier(TriCraft.MOD_ID, id),
                new BlockItem(block, new FabricItemSettings()));
        ItemGroupEvents.modifyEntriesEvent(itemGroup).register(entries -> entries.add(item));
        return item;
    }

    public static void register(){
        TriCraft.LOGGER.debug("Registering items for: " + TriCraft.MOD_ID);
    }
}

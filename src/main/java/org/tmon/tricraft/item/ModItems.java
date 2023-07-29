package org.tmon.tricraft.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.tmon.tricraft.TriCraft;
import org.tmon.tricraft.item.custom.GigeriumToolMaterial;
import org.tmon.tricraft.item.custom.InesToolMaterial;
import org.tmon.tricraft.item.custom.axe.customAxeItem;
import org.tmon.tricraft.item.custom.hoe.customHoeItem;
import org.tmon.tricraft.item.custom.pickaxe.customPickaxeItem;
import org.tmon.tricraft.item.custom.shovel.customShovelItem;
import org.tmon.tricraft.item.custom.sword.customSwordItem;
import org.tmon.tricraft.item.custom.axe.customAxeItem2;
import org.tmon.tricraft.item.custom.hoe.customHoeItem2;
import org.tmon.tricraft.item.custom.pickaxe.customPickaxeItem2;
import org.tmon.tricraft.item.custom.shovel.customShovelItem2;
import org.tmon.tricraft.item.custom.sword.customSwordItem2;
import org.tmon.tricraft.item.material.armor.GigeriumArmorMaterial;
import org.tmon.tricraft.item.material.armor.InesArmorMaterial;

public class ModItems {
    public static final Item GIGERIUM_INGOT = registerItem("gigerium_ingot", new Item(new FabricItemSettings()));
    public static final Item INES_INGOT = registerItem("ines_ingot", new Item(new FabricItemSettings()));
    public static final Item GIGERIUM_SWORD = registerItem("gigerium_sword", new customSwordItem(new GigeriumToolMaterial(),5,-3.0f, new Item.Settings()));
    public static final Item GIGERIUM_SHOVEL = registerItem("gigerium_shovel", new customShovelItem(new GigeriumToolMaterial(),2,-3.0f, new Item.Settings()));
    public static final Item GIGERIUM_PICKAXE = registerItem("gigerium_pickaxe", new customPickaxeItem(new GigeriumToolMaterial(),1,-2.8f, new Item.Settings()));
    public static final Item GIGERIUM_AXE = registerItem("gigerium_axe", new customAxeItem(new GigeriumToolMaterial(),6,-3.2f, new Item.Settings()));
    public static final Item GIGERIUM_HOE = registerItem("gigerium_hoe", new customHoeItem(new GigeriumToolMaterial(),-3,0.0f, new Item.Settings()));
    public static final Item RAW_GIGERIUM = registerItem("raw_gigerium", new Item(new FabricItemSettings()));
    public static final Item RAW_INES = registerItem("raw_ines", new Item(new FabricItemSettings()));
    public static final Item INES_SWORD = registerItem("ines_sword", new customSwordItem2(new InesToolMaterial(),5,-2.4f, new Item.Settings()));
    public static final Item INES_SHOVEL = registerItem("ines_shovel", new customShovelItem2(new InesToolMaterial(),1,-3.0f, new Item.Settings()));
    public static final Item INES_PICKAXE = registerItem("ines_pickaxe", new customPickaxeItem2(new InesToolMaterial(),0,-2.8f, new Item.Settings()));
    public static final Item INES_AXE = registerItem("ines_axe", new customAxeItem2(new InesToolMaterial(),6,-3.2f, new Item.Settings()));
    public static final Item INES_HOE = registerItem("ines_hoe", new customHoeItem2(new InesToolMaterial(),-5,0.0f, new Item.Settings()));
    public static final Item GIGERIUM_NUGGET = registerItem("gigerium_nugget", new Item(new FabricItemSettings()));
    public static final Item INES_NUGGET = registerItem("ines_nugget", new Item(new FabricItemSettings()));
    public static final Item GIGERIUM_HELMET = registerItem("gigerium_helmet", new ArmorItem(new GigeriumArmorMaterial(), ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item GIGERIUM_CHESTPLATE = registerItem("gigerium_chestplate", new ArmorItem(new GigeriumArmorMaterial(),ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item GIGERIUM_LEGGINGS = registerItem("gigerium_leggings", new ArmorItem(new GigeriumArmorMaterial(),ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item GIGERIUM_BOOTS = registerItem("gigerium_boots", new ArmorItem(new GigeriumArmorMaterial(),ArmorItem.Type.BOOTS, new FabricItemSettings()));
    public static final Item INES_HELMET = registerItem("ines_helmet", new ArmorItem(new InesArmorMaterial(), ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item INES_CHESTPLATE = registerItem("ines_chestplate", new ArmorItem(new InesArmorMaterial(),ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item INES_LEGGINGS = registerItem("ines_leggings", new ArmorItem(new InesArmorMaterial(),ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item INES_BOOTS = registerItem("ines_boots", new ArmorItem(new InesArmorMaterial(),ArmorItem.Type.BOOTS, new FabricItemSettings()));
    public static Item registerItem(String id, Item item){
        return Registry.register(Registries.ITEM, new Identifier(TriCraft.MOD_ID, id), item);
    }

    public static void addItemsToItemGroup(){
        addToItemGroup(ModItemsGroup.NEW_GROUP, GIGERIUM_SWORD);
        addToItemGroup(ModItemsGroup.NEW_GROUP, GIGERIUM_PICKAXE);
        addToItemGroup(ModItemsGroup.NEW_GROUP, GIGERIUM_AXE);
        addToItemGroup(ModItemsGroup.NEW_GROUP, GIGERIUM_SHOVEL);
        addToItemGroup(ModItemsGroup.NEW_GROUP, GIGERIUM_HOE);
        addToItemGroup(ModItemsGroup.NEW_GROUP, GIGERIUM_HELMET);
        addToItemGroup(ModItemsGroup.NEW_GROUP, GIGERIUM_CHESTPLATE);
        addToItemGroup(ModItemsGroup.NEW_GROUP, GIGERIUM_LEGGINGS);
        addToItemGroup(ModItemsGroup.NEW_GROUP, GIGERIUM_BOOTS);
        addToItemGroup(ModItemsGroup.NEW_GROUP, INES_SWORD);
        addToItemGroup(ModItemsGroup.NEW_GROUP, INES_PICKAXE);
        addToItemGroup(ModItemsGroup.NEW_GROUP, INES_AXE);
        addToItemGroup(ModItemsGroup.NEW_GROUP, INES_SHOVEL);
        addToItemGroup(ModItemsGroup.NEW_GROUP, INES_HOE);
        addToItemGroup(ModItemsGroup.NEW_GROUP, INES_HELMET);
        addToItemGroup(ModItemsGroup.NEW_GROUP, INES_CHESTPLATE);
        addToItemGroup(ModItemsGroup.NEW_GROUP, INES_LEGGINGS);
        addToItemGroup(ModItemsGroup.NEW_GROUP, INES_BOOTS);
        addToItemGroup(ModItemsGroup.NEW_GROUP, GIGERIUM_INGOT);
        addToItemGroup(ModItemsGroup.NEW_GROUP, RAW_GIGERIUM);
        addToItemGroup(ModItemsGroup.NEW_GROUP, GIGERIUM_NUGGET);
        addToItemGroup(ModItemsGroup.NEW_GROUP, INES_INGOT);
        addToItemGroup(ModItemsGroup.NEW_GROUP, RAW_INES);
        addToItemGroup(ModItemsGroup.NEW_GROUP, INES_NUGGET);
    }

    private static void addToItemGroup(ItemGroup itemGroup, Item item){
        ItemGroupEvents.modifyEntriesEvent(itemGroup).register(entries -> entries.add(item));
    }

    public static void register(){
        TriCraft.LOGGER.debug("Registering items for: " + TriCraft.MOD_ID);

        addItemsToItemGroup();
    }
}
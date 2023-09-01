package org.tmon.tricraft.items;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.tmon.tricraft.TriCraft;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TriCraft.MOD_ID);

    public static final RegistryObject<Item> GIGERIUM_SWORD = ITEMS.register("gigerium_sword", () -> new SwordItem(ModTiers.GIGERIUM,5,-3, new Item.Properties()));
    public static final RegistryObject<Item> GIGERIUM_PICKAXE = ITEMS.register("gigerium_pickaxe", () -> new PickaxeItem(ModTiers.GIGERIUM,1,-2.8f, new Item.Properties()));
    public static final RegistryObject<Item> GIGERIUM_AXE = ITEMS.register("gigerium_axe", () -> new AxeItem(ModTiers.GIGERIUM,6,-3.2f, new Item.Properties()));
    public static final RegistryObject<Item> GIGERIUM_SHOVEL = ITEMS.register("gigerium_shovel", () -> new ShovelItem(ModTiers.GIGERIUM,2,-3, new Item.Properties()));
    public static final RegistryObject<Item> GIGERIUM_HOE = ITEMS.register("gigerium_hoe", () -> new HoeItem(ModTiers.GIGERIUM,-3,0, new Item.Properties()));
    public static final RegistryObject<Item> INES_SWORD = ITEMS.register("ines_sword", () -> new SwordItem(ModTiers.INES,5,-2.4f, new Item.Properties()));
    public static final RegistryObject<Item> INES_PICKAXE = ITEMS.register("ines_pickaxe", () -> new PickaxeItem(ModTiers.INES,0,-2.8f, new Item.Properties()));
    public static final RegistryObject<Item> INES_AXE = ITEMS.register("ines_axe", () -> new AxeItem(ModTiers.INES,6,-3.2f, new Item.Properties()));
    public static final RegistryObject<Item> INES_SHOVEL = ITEMS.register("ines_shovel", () -> new ShovelItem(ModTiers.INES,1,-3, new Item.Properties()));
    public static final RegistryObject<Item> INES_HOE = ITEMS.register("ines_hoe", () -> new HoeItem(ModTiers.INES,-5,0, new Item.Properties()));
    public static final RegistryObject<Item> GIGERIUM_INGOT = ITEMS.register("gigerium_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INES_INGOT = ITEMS.register("ines_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_GIGERIUM = ITEMS.register("raw_gigerium", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_INES = ITEMS.register("raw_ines", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GIGERIUM_NUGGET = ITEMS.register("gigerium_nugget", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INES_NUGGET = ITEMS.register("ines_nugget", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GIGERIUM_HELMET = ITEMS.register("gigerium_helmet", () -> new ArmorItem(ModArmorMaterial.ArmorTiers.GIGERIUM, EquipmentSlot.HEAD, new Item.Properties()));
    public static final RegistryObject<Item> GIGERIUM_CHESTPLATE = ITEMS.register("gigerium_chestplate", () -> new ArmorItem(ModArmorMaterial.ArmorTiers.GIGERIUM, EquipmentSlot.CHEST, new Item.Properties()));
    public static final RegistryObject<Item> GIGERIUM_LEGGINGS = ITEMS.register("gigerium_leggings", () -> new ArmorItem(ModArmorMaterial.ArmorTiers.GIGERIUM, EquipmentSlot.LEGS, new Item.Properties()));
    public static final RegistryObject<Item> GIGERIUM_BOOTS = ITEMS.register("gigerium_boots", () -> new ArmorItem(ModArmorMaterial.ArmorTiers.GIGERIUM, EquipmentSlot.FEET, new Item.Properties()));
    public static final RegistryObject<Item> INES_HELMET = ITEMS.register("ines_helmet", () -> new ArmorItem(ModArmorMaterial.ArmorTiers.INES, EquipmentSlot.HEAD, new Item.Properties()));
    public static final RegistryObject<Item> INES_CHESTPLATE = ITEMS.register("ines_chestplate", () -> new ArmorItem(ModArmorMaterial.ArmorTiers.INES, EquipmentSlot.CHEST, new Item.Properties()));
    public static final RegistryObject<Item> INES_LEGGINGS = ITEMS.register("ines_leggings", () -> new ArmorItem(ModArmorMaterial.ArmorTiers.INES, EquipmentSlot.LEGS, new Item.Properties()));
    public static final RegistryObject<Item> INES_BOOTS = ITEMS.register("ines_boots", () -> new ArmorItem(ModArmorMaterial.ArmorTiers.INES, EquipmentSlot.FEET, new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}

package org.tmon.tricraft.items;

import net.minecraft.sounds.SoundEvents;
import org.tmon.tricraft.TriCraft;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;
import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;

public record ModArmorMaterial(String name, int durability, int[] protection, int enchantability, SoundEvent equipSound, float toughness, float knockbackResistance, Supplier<Ingredient> repairMaterial) implements ArmorMaterial {
    public static class ArmorTiers {
        public static final ArmorMaterial GIGERIUM = new ModArmorMaterial(
                "gigerium",
                300,
                new int[] { 4, 4, 4, 4 },
                15,
                SoundEvents.ARMOR_EQUIP_NETHERITE,
                3.0f,
                0.0f,
                () -> Ingredient.of(ModItems.GIGERIUM_INGOT.get()));
        public static final ArmorMaterial INES = new ModArmorMaterial(
                "ines",
                500,
                new int[] { 10, 10, 10, 10 },
                15,
                SoundEvents.ARMOR_EQUIP_NETHERITE,
                5.0f,
                1.0f,
                () -> Ingredient.of(ModItems.INES_INGOT.get()));
    }
    private static final int[] DURABILITY_PER_SLOT = new int[] { 13, 15, 16, 11 };

    @Override
    public int getDurabilityForSlot(EquipmentSlot slot) {
        return DURABILITY_PER_SLOT[slot.getIndex()] * this.durability;
    }

    @Override
    public int getDefenseForSlot(EquipmentSlot slot) {
        return this.protection[slot.getIndex()];
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantability;
    }

    @Override
    public @NotNull SoundEvent getEquipSound() {
        return this.equipSound;
    }

    @Override
    public @NotNull Ingredient getRepairIngredient() {
        return this.repairMaterial.get();
    }

    @Override
    public @NotNull String getName() {
        return TriCraft.MOD_ID + ":" + this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}
package org.tmon.tricraft.item.custom.pickaxe;

import net.minecraft.item.PickaxeItem;
import org.tmon.tricraft.item.custom.GigeriumToolMaterial;

public class customPickaxeItem extends PickaxeItem {
    public customPickaxeItem(GigeriumToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }
}
package org.tmon.tricraft.item.custom.hoe;

import net.minecraft.item.HoeItem;
import org.tmon.tricraft.item.custom.GigeriumToolMaterial;

public class customHoeItem extends HoeItem {
    public customHoeItem(GigeriumToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }
}
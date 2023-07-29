package org.tmon.tricraft.item.custom.axe;

import net.minecraft.item.AxeItem;
import org.tmon.tricraft.item.custom.GigeriumToolMaterial;

public class customAxeItem extends AxeItem {
    public customAxeItem(GigeriumToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }
}
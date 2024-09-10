package org.nk.healthyfoods;

import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterials;

public class GreenSword extends SwordItem{
    public GreenSword() {
        super(ToolMaterials.DIAMOND, createSettings());
    }

    private static Item.Settings createSettings() {

        return new Item.Settings();

    }


    public float getAttackDamage() {
        return 30F;
    }
}

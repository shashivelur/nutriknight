package org.nk.frozenworld;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterials;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;


import java.util.List;

public class FrostSword extends SwordItem {
    public FrostSword() {
        super(ToolMaterials.DIAMOND, createSettings());
    }

    private static Item.Settings createSettings() {
        return new Item.Settings();

    }


    public float getAttackDamage() {
        return 30F;
    }
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        tooltip.add(Text.translatable("itemTooltip.nutriknight.frostsword").formatted(Formatting.AQUA));
    }
}






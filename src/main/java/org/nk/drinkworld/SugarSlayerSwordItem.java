package org.nk.drinkworld;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterials;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

import java.util.List;

public class SugarSlayerSwordItem extends SwordItem {
    public SugarSlayerSwordItem() {
        super(ToolMaterials.DIAMOND, createSettings());
    }
    private static Item.Settings createSettings() {
        return new Item.Settings();

    }

    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        tooltip.add(Text.translatable("itemTooltip.nutriknight.sugarslayer").formatted(Formatting.DARK_GREEN));
    }
}

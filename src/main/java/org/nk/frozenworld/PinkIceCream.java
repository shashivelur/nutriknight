package org.nk.frozenworld;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

import java.util.List;

public class PinkIceCream extends Block {
    public PinkIceCream(Settings settings) {
        super(settings);
    }
    public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType type) {
        tooltip.add(Text.translatable("itemTooltip.nutriknight.pinkice_cream").formatted(Formatting.GREEN));
    }
}

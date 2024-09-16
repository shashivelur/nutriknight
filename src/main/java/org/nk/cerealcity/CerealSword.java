package org.nk.cerealcity;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;

import java.util.List;

import static net.minecraft.item.Items.register;

public class CerealSword extends SwordItem {
    public CerealSword() {
        super(new CerealSwordMaterial(), createSettings());
    }
    private static Item.Settings createSettings() {
        return new Item.Settings();
    }
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        tooltip.add(Text.translatable("itemTooltip.nutriknight.cereal_sword").formatted(Formatting.DARK_GREEN));

    }
}

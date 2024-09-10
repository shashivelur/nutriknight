package org.nk.healthyfoods;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

import java.util.List;

public class Banana extends Item {
    public Banana() {
        super(createSettings());
    }
    private static Item.Settings createSettings() {
        FoodComponent Banana = new FoodComponent.Builder()
                .alwaysEdible()
                // The duration is in ticks, 20 ticks = 1 second
                .statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 160, 1), 1.0f)
                .build();
        return new Item.Settings().food(Banana);
    }
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        tooltip.add(Text.translatable("itemTooltip.nutriknight.corn").formatted(Formatting.YELLOW));
    }
}


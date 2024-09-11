package org.nk.frozenworld;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

import java.util.List;

public class Icee extends Item {
    public Icee() {
        super(createSettings());
    }
    private static Item.Settings createSettings() {
        FoodComponent icee = new FoodComponent.Builder()
                .alwaysEdible()
                // The duration is in ticks, 20 ticks = 1 second
                .statusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 300, 1), 1.0f)
                .statusEffect(new StatusEffectInstance(StatusEffects.SLOW_FALLING,600,1),1.0f)
                .build();
        return new Item.Settings().food(icee);
    }
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        tooltip.add(Text.translatable("itemTooltip.nutriknight.icee").formatted(Formatting.GREEN));
    }
}


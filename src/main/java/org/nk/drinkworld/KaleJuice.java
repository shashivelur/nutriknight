package org.nk.drinkworld;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

import java.util.List;

public class KaleJuice extends Item {

    public KaleJuice() {
        super(createSettings());
    }

    private static Item.Settings createSettings() {

        FoodComponent kalejuice = new FoodComponent.Builder()
                .alwaysEdible()
                .snack()
                // The duration is in ticks, 20 ticks = 1 second
                .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 50, 1), 1.0f)
                .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 100, 1), 1.0f)
                .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 100, 1), 1.0f)
                .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 200, 1), 1.0f)

                .nutrition(2)
                .build();
        return new Item.Settings().food(kalejuice);
    }

    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        tooltip.add(Text.translatable("itemTooltip.nutriknight.kjuice").formatted(Formatting.GREEN));
    }
}

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

public class Espresso extends Item {

    public Espresso() {
        super(createSettings());
    }

    private static Item.Settings createSettings() {

        FoodComponent espresso = new FoodComponent.Builder()
                .alwaysEdible()
                .snack()
                // The duration is in ticks, 20 ticks = 1 second
                .statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 6, 1), 1.0f)
                .statusEffect(new StatusEffectInstance(StatusEffects.CONDUIT_POWER, 3 * 60, 1), 1.0f)
                .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 3 * 20, 1), 1.0f)
                .statusEffect(new StatusEffectInstance(StatusEffects.DARKNESS, 3 * 20, 1), 1.0f)

                .nutrition(2)
                .build();
        return new Item.Settings().food(espresso);
    }

    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        tooltip.add(Text.translatable("itemTooltip.nutriknight.espresso").formatted(Formatting.GOLD));
    }
}

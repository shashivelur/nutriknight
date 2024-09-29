package org.nk.chemworld;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

import java.util.List;

public class proteinpowder extends Item {
    public proteinpowder() {
        super(createSettings());
    }

    private static Item.Settings createSettings() {
        FoodComponent proteinpowder = new FoodComponent.Builder()
                .alwaysEdible()
                .snack()
                // The duration is in ticks, 20 ticks = 1 second
                .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 52, 1), 1.0f)
                .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 150, 1), 1.0f)
                .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 160, 1), 1.0f)
                .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 300, 1), 1.0f)

                .nutrition(2)
                .build();
        return new Item.Settings().food(proteinpowder);
    }

    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        tooltip.add(Text.translatable("itemTooltip.nutriknight.proteinpowder").formatted(Formatting.GREEN));
    }
}


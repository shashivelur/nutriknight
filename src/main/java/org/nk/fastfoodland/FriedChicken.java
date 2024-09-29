package org.nk.fastfoodland;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Item;

public class FriedChicken extends Item{
    public FriedChicken() {
        super(createSettings());
    }

    private static Item.Settings createSettings() {

        FoodComponent FriedChicken = new FoodComponent.Builder()
                .alwaysEdible()
                .snack()
                // The duration is in ticks, 20 ticks = 1 second
                .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 600, 2), 1.0f)
                .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 200, 4), 1.0f)
                .statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 600, 2), 1.0f)
                .statusEffect(new StatusEffectInstance(StatusEffects.SATURATION, 100, 10), 1.0f)

                .nutrition(2)
                .build();
        return new Item.Settings().food(FriedChicken);
    }
}

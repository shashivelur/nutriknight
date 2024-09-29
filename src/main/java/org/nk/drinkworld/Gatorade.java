package org.nk.drinkworld;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Item;

public class Gatorade extends Item{
    public Gatorade() {
        super(createSettings());
    }

    private static Item.Settings createSettings() {

        FoodComponent Gatorade = new FoodComponent.Builder()
                .alwaysEdible()
                .snack()
                // The duration is in ticks, 20 ticks = 1 second
                .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 200, 3), 1.0f)
                .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 600, 2), 1.0f)
                .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 200, 4), 1.0f)
                .statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 600, 2), 1.0f)

                .nutrition(2)
                .build();
        return new Item.Settings().food(Gatorade);
    }
}

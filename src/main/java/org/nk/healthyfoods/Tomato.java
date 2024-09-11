package org.nk.healthyfoods;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Item;

public class Tomato extends Item {

    public Tomato() {
        super(createSettings());
    }

    private static Item.Settings createSettings() {

        FoodComponent titem = new FoodComponent.Builder()
                .alwaysEdible()
                .snack()
                // The duration is in ticks, 20 ticks = 1 second
                .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 100, 1), 1.0f)
                .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 3 * 60, 1), 1.0f)
                .statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 100004, 1), 1.0f)
                .statusEffect(new StatusEffectInstance(StatusEffects.POISON, 3 * 20, 1), 1.0f)


                .nutrition(2)
                .build();
        return new Item.Settings().food(titem);
    }

}

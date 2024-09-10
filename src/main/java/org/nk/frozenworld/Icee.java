package org.nk.frozenworld;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Item;

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
}


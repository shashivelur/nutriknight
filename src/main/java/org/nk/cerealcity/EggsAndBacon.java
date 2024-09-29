package org.nk.cerealcity;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Item;

public class EggsAndBacon extends Item{
    public EggsAndBacon() {
        super(createSettings());
    }

    private static Item.Settings createSettings() {

        FoodComponent EggsAndBacon = new FoodComponent.Builder()
                .alwaysEdible()
                .snack()
                // The duration is in ticks, 20 ticks = 1 second
                .statusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 200, 3), 1.0f)
                .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 3 * 60, 2), 1.0f)
                .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 600, 4), 1.0f)

                .nutrition(2)
                .build();
        return new Item.Settings().food(EggsAndBacon);
    }
}
package org.nk.fastfoodland;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

import java.util.List;

public class ChickenNugget extends Item {

    public ChickenNugget() {
        super(createSettings());
    }

    private static Item.Settings createSettings() {

        FoodComponent cnitem = new FoodComponent.Builder()
                .alwaysEdible()
                .snack()
                // The duration is in ticks, 20 ticks = 1 second
                .statusEffect(new StatusEffectInstance(StatusEffects.POISON, 10, 1), 1.0f)
                .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 3 * 60, 1), 1.0f)
                .statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_DAMAGE, 10, 1), 1.0f)
                .statusEffect(new StatusEffectInstance(StatusEffects.BLINDNESS, 100, 1), 1.0f)

                .nutrition(2)
                .build();
        return new Item.Settings().food(cnitem);
    }

}

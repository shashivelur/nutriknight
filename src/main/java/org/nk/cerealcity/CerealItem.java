
package org.nk.cerealcity;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.util.Formatting;
import java.util.List;

public class CerealItem extends Item {

    public CerealItem() {
        super(createSettings());
    }

    private static Item.Settings createSettings() {
        FoodComponent cereal = new FoodComponent.Builder()
                .alwaysEdible()
                .snack()
                // The duration is in ticks, 20 ticks = 1 second
                .statusEffect(new StatusEffectInstance(StatusEffects.BLINDNESS, 3 * 60, 1), 0.5f)
                .statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_DAMAGE, 3 * 20, 1), 1.0f)
                .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 3 * 30, 1), 1.0f)
                .statusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 3 * 20, 4), 1.0f)


                .nutrition(2)
                .build();
        return new Item.Settings().food(cereal);
    }
}
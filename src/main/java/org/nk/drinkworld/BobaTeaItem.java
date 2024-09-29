
package org.nk.drinkworld;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.util.Formatting;
import java.util.List;

public class BobaTeaItem extends Item {

    public BobaTeaItem() {
        super(createSettings());
    }

    public static Item.Settings createSettings() {
        // Create all boba tea settings here
        FoodComponent bobatea = new FoodComponent.Builder()
                .alwaysEdible()
                .snack()
                // The duration is in ticks, 20 ticks = 1 second
                .statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_DAMAGE, 6, 1), 1.0f)
                .statusEffect(new StatusEffectInstance(StatusEffects.BLINDNESS, 3 * 60, 1), 1.0f)
                .statusEffect(new StatusEffectInstance(StatusEffects.POISON, 3 * 20, 1), 1.0f)
                .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 3 * 20, 1), 1.0f)

                .nutrition(2)
                .build();
        return new Item.Settings().food(bobatea);
    }

    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        tooltip.add(Text.translatable("itemTooltip.nutriknight.bobatea").formatted(Formatting.GOLD));
    }
}

package org.nk.greensworld;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

import java.util.List;

public class Strawberry extends Item {

    public Strawberry() {
        super(createSettings());
    }

    private static Item.Settings createSettings() {

        FoodComponent strawberry = new FoodComponent.Builder()
                .alwaysEdible()
                .snack()
                // The duration is in ticks, 20 ticks = 1 second
                .statusEffect(new StatusEffectInstance(StatusEffects.INVISIBILITY, 100, 1), 1.0f)


                .nutrition(2)
                .build();
        return new Item.Settings().food(strawberry);
    }
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        tooltip.add(Text.translatable("itemTooltip.nutriknight.strawberrya").formatted(Formatting.GREEN));
    }
}

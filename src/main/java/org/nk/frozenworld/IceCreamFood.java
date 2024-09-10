package org.nk.frozenworld;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

import java.util.List;

public class IceCreamFood extends Item {
    public IceCreamFood() {
        super(createSettings());
    }
    private static Item.Settings createSettings() {
        FoodComponent icecreamfood = new FoodComponent.Builder()
                .alwaysEdible()
                .snack()
                // The duration is in ticks, 20 ticks = 1 second
                .statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_DAMAGE, 10, 1), 1.0f)
                .statusEffect(new StatusEffectInstance(StatusEffects.WEAKNESS,600,1),1.0f)
                .build();
        return new Item.Settings().food(icecreamfood);
    }
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        tooltip.add(Text.translatable("itemTooltip.nutriknight.icecreamfood").formatted(Formatting.WHITE));
    }
}

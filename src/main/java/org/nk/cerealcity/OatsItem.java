package org.nk.cerealcity;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;

import java.util.List;

public class OatsItem extends Item {
    public OatsItem() {
        super(createSettings());
    }

    private static Item.Settings createSettings() {
        FoodComponent oats = new FoodComponent.Builder()
                .alwaysEdible()
                .snack()
                .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 3 * 60, 1), 0.25f)
                .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 3 * 2400, 1), 0.25f)
                .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 3 * 2400, 1), 0.25f)
                .statusEffect(new StatusEffectInstance(StatusEffects.HERO_OF_THE_VILLAGE, 3 * 20000, 1), 1.0f)
                .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 3 * 2400, 1), 1.0f)
                .statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 3 * 20, 1), 1.0f)
                .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 3 * 2400, 3), 0.40f)
                .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 3 * 2400, 3), 0.40f)


                .nutrition(2)
                .build();
        return new Item.Settings().food(oats);
    }


    @Override
    public boolean allowComponentsUpdateAnimation(PlayerEntity player, Hand hand, ItemStack oldStack, ItemStack newStack) {
        return super.allowComponentsUpdateAnimation(player, hand, oldStack, newStack);
    }
}

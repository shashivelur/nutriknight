package org.nk.chemworld;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.util.Formatting;
import java.util.List;

public class chemmedicine extends Item {
      public chemmedicine() {
        super(createSettings());
    }
    public static Item.Settings createSettings(){


          FoodComponent ChemMedicine = new FoodComponent.Builder()
                  .alwaysEdible()
                  .snack()
                  .statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH,7,1),1.0f)
                  .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 3 * 20, 1), 1.0f)
                  .nutrition(4)
                  .build();
          return new Item.Settings().food(ChemMedicine);
    }

    public void appendTooltip (ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType type){
        tooltip.add(Text.translatable("itemTooltip.nutriknight.chemmedicine").formatted(Formatting.GOLD));
}}


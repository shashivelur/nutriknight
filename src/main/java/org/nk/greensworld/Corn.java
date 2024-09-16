package org.nk.greensworld;

import net.minecraft.item.BowItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

import java.util.List;


public class Corn extends BowItem {

    public Corn(Settings settings) {
        super(settings);
    }
//    @Override
//    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
//        ItemStack stack = user.getStackInHand(hand);
//        if (!world.isClient) {
//            CornProjectile projectile = new CornProjectile(Nutriknight.CORN_PROJECTILE, world);
//            projectile.setPosition(user.getX(), user.getY() + user.getEyeHeight(user.getPose()), user.getZ());
//            projectile.setVelocity(user, user.getPitch(), user.getYaw(), 0.0F, 3.0F, 1.0F);
//            world.spawnEntity(projectile);
//        }
//        return super.use(world, user, hand);
//    }
public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
    tooltip.add(Text.translatable("itemTooltip.nutriknight.corn").formatted(Formatting.GREEN));
}


}


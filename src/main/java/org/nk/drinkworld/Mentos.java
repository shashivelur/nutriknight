package org.nk.drinkworld;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.ArrowEntity;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.entity.projectile.WindChargeEntity;
import net.minecraft.item.ArrowItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.stat.Stats;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class Mentos extends ArrowItem {

    public Mentos() {
        super(createSettings());
    }

    private static Item.Settings createSettings() {
        return new Item.Settings();
    }

    public PersistentProjectileEntity createArrow(World world, ItemStack stack, LivingEntity shooter, @Nullable ItemStack shotFrom) {
        return new ArrowEntity(world, shooter, stack.copyWithCount(1), shotFrom);
    }

//    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
//        if (!world.isClient()) {
//            WindChargeEntity windChargeEntity = new WindChargeEntity(user, world, user.getPos().getX(), user.getEyePos().getY(), user.getPos().getZ());
//            windChargeEntity.setVelocity(user, user.getPitch(), user.getYaw(), 0.0F, 1.5F, 1.0F);
//            world.spawnEntity(windChargeEntity);
//        }
//
//        world.playSound((PlayerEntity)null, user.getX(), user.getY(), user.getZ(), SoundEvents.ENTITY_WIND_CHARGE_THROW, SoundCategory.NEUTRAL, 0.5F, 0.4F / (world.getRandom().nextFloat() * 0.4F + 0.8F));
//        ItemStack itemStack = user.getStackInHand(hand);
//        user.getItemCooldownManager().set(this, 10);
//        user.incrementStat(Stats.USED.getOrCreateStat(this));
//        itemStack.decrementUnlessCreative(1, user);
//        return TypedActionResult.success(itemStack, world.isClient());
//    }
}
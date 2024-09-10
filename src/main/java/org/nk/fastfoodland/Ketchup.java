package org.nk.fastfoodland;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.ArrowEntity;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.item.ArrowItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class Ketchup extends ArrowItem {

    public Ketchup() {
        super(createSettings());
    }

    private static Item.Settings createSettings() {
        return new Item.Settings();
    }

    public PersistentProjectileEntity createArrow(World world, ItemStack stack, LivingEntity shooter, @Nullable ItemStack shotFrom) {
        return new ArrowEntity(world, shooter, stack.copyWithCount(1), shotFrom);
    }
}

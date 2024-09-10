package org.nk.drinkworld;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.MagmaBlock;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.stat.Stats;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class Spikes extends MagmaBlock {
    public Spikes(Settings settings) {
        super(settings);
    }

    public void afterBreak(World world, PlayerEntity player, BlockPos pos, BlockState state, @Nullable BlockEntity blockEntity, ItemStack tool) {
        player.incrementStat(Stats.MINED.getOrCreateStat(this));
        player.addExhaustion(0.005F);
        dropStacks(state, world, pos, blockEntity, player, tool);
    }

}

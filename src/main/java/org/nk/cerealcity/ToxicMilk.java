package org.nk.cerealcity;

import net.minecraft.block.BlockState;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.item.Item;
import net.minecraft.state.StateManager;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;
import org.nk.NKBlocksAndItems;

import static org.nk.NKBlocksAndItems.*;

public class ToxicMilk extends ParentLiquid {
    @Override
    public Fluid getStill() {
        return STILL_MILK;
    }

    @Override
    protected boolean isInfinite(World world) {
        return false;
    }

    @Override
    protected int getMaxFlowDistance(WorldView world) {
        return 0;
    }

    @Override
    public int getLevel(FluidState state) {
        return 0;
    }

    @Override
    public Fluid getFlowing() {
        return FLOWING_MILK;
    }

    @Override
    public Item getBucketItem() {
        return TOXIC_MILK_BUCKET;
    }

    @Override
    protected BlockState toBlockState(FluidState state) {
        return null;
    }

    @Override
    public boolean isStill(FluidState state) {
        return false;
    }

    public static class Flowing extends ToxicMilk {
        @Override
        protected void appendProperties(StateManager.Builder<Fluid, FluidState> builder) {
            super.appendProperties(builder);
            builder.add(LEVEL);
        }

        @Override
        public int getLevel(FluidState fluidState) {
            return fluidState.get(LEVEL);
        }

        @Override
        public boolean isStill(FluidState fluidState) {
            return false;
        }
    }

    public static class Still extends ToxicMilk {
        @Override
        public int getLevel(FluidState fluidState) {
            return 8;
        }

        @Override
        public boolean isStill(FluidState fluidState) {
            return true;
        }
    }

}

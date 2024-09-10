package org.nk.fastfoodland;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.decoration.AbstractDecorationEntity;
import net.minecraft.item.ItemFrameItem;

public class Puzzle extends ItemFrameItem {
    public Puzzle(EntityType<? extends AbstractDecorationEntity> entityType, Settings settings) {
        super(entityType, settings);
    }
}

package org.nk;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.NotNull;

public class Nutriknight implements ModInitializer {

    @Override
    public void onInitialize() {
        NKBlocksAndItems.createAndRegisterBobaTeaBlock();
        NKBlocksAndItems.createAndRegisterBobaTeaItem();
    }


}

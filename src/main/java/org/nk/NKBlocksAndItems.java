package org.nk;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.NotNull;

import org.nk.drinkworld.BobaTeaItem;

/**
 * Add methods for creation of Blocks and Items here
 */
public class NKBlocksAndItems {

    // For trying this in Minecraft, use this command:
    //              /give @s nutriknight:bobatea
    public static @NotNull Item createAndRegisterBobaTeaItem() {
        Item.Settings itemSettings = new Item.Settings();
        Item bobaTeaItem = new BobaTeaItem(itemSettings);
        Registry.register(Registries.ITEM, Identifier.of("nutriknight", "bobatea"), bobaTeaItem);
        // Add it to the group / toolbox
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register((itemGroup) -> itemGroup.add(bobaTeaItem));
        return bobaTeaItem;
    }

    // For trying this in Minecraft, use this command:
    //              /setblock 26 116 -54 nutriknight:virajblock
    public static @NotNull Block createAndRegisterBobaTeaBlock() {
        Block.Settings bobaTeaSettings = Block.Settings.create().strength(16.0f);//.dropsLike(Block.getBlockFromItem(new MilkBucketItem(new Item.Settings())));
        Block bobaTea = new Block(bobaTeaSettings);
        Registry.register(Registries.BLOCK, Identifier.of("nutriknight", "virajblock"), bobaTea);
        return bobaTea;
    }
}

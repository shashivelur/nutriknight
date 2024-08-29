package org.nk;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.NotNull;

import org.nk.chemworld.Chembomb;
import org.nk.drinkworld.BobaTeaItem;
import org.nk.drinkworld.Spikes;
import org.nk.drinkworld.SpikesBlockItem;
import org.nk.drinkworld.SugarSlayerSwordItem;
import org.nk.drinkworld.Cornsyrup;
import org.nk.drinkworld.BigRed;
import org.nk.drinkworld.Coke;
import org.nk.drinkworld.Mentos;

/**
 * Add methods for creation of Blocks and Items here
 */
public class NKBlocksAndItems {

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // VIRAJ
    // For trying this in Minecraft, use this command:
    //              /give @s nutriknight:bobatea
    public static @NotNull Item createAndRegisterBobaTeaItem() {
        Item bobaTeaItem = new BobaTeaItem();
        Registry.register(Registries.ITEM, Identifier.of("nutriknight", "bobatea"), bobaTeaItem);
        // Add it to the group / toolbox
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register((itemGroup) -> itemGroup.add(bobaTeaItem));
        return bobaTeaItem;
    }

    // For trying this in Minecraft, use this command:
    //              /setblock 26 116 -54 nutriknight:virajblock
    public static @NotNull Spikes createAndRegisterSpikes() {
        Block.Settings spikesSettings = Block.Settings.create().strength(16.0f);//.dropsLike(Block.getBlockFromItem(new MilkBucketItem(new Item.Settings())));
        Spikes spikes = new Spikes(spikesSettings);
        Registry.register(Registries.BLOCK, Identifier.of("nutriknight", "spikes"), spikes);
        return spikes;
    }

    public static @NotNull BlockItem createAndRegisterSpikesBlockItem(Spikes spikesBlock){
        SpikesBlockItem spikesBlockItem = new SpikesBlockItem(spikesBlock, new Item.Settings());
        Registry.register(Registries.ITEM, Identifier.of("nutriknight", "spikesblockitem"), spikesBlockItem);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.REDSTONE).register((itemGroup) -> {
            itemGroup.add(spikesBlockItem.asItem());
        });
        return spikesBlockItem;
    }

    public static Item createAndRegisterSugarSlayerSwordItem() {
        SugarSlayerSwordItem sssItem = new SugarSlayerSwordItem();
        Registry.register(Registries.ITEM, Identifier.of("nutriknight", "sugarslayer"), sssItem);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register((itemGroup) -> itemGroup.add(sssItem));
        return sssItem;
    }

        public static @NotNull Cornsyrup createAndRegisterCornsyrup() {

        Cornsyrup csItem = new Cornsyrup();
        Registry.register(Registries.ITEM, Identifier.of("nutriknight", "cornsyrup"), csItem);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register((itemGroup) -> itemGroup.add(csItem));
        return csItem;
    }

        public static @NotNull BigRed createAndRegisterBigRed() {

        BigRed brItem = new BigRed();
        Registry.register(Registries.ITEM, Identifier.of("nutriknight", "bigred"), brItem);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register((itemGroup) -> itemGroup.add(brItem));
        return brItem;
    }

        public static @NotNull Coke createAndRegisterCoke() {

        Coke cItem = new Coke();
        Registry.register(Registries.ITEM, Identifier.of("nutriknight", "coke"), cItem);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register((itemGroup) -> itemGroup.add(cItem));
        return cItem;

    }
    public static @NotNull Mentos createAndRegisterMentos() {
        Mentos mItem = new Mentos();
        Registry.register(Registries.ITEM, Identifier.of("nutriknight", "mentos"), mItem);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register((itemGroup) -> itemGroup.add(mItem));
        return mItem;
    }


    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // PRANAV
    public static @NotNull Item createAndRegisterChembombItem() {
        Item.Settings itemSettings = new Item.Settings();
        Item chembombItem = new Chembomb (itemSettings);
        Registry.register(Registries.ITEM, Identifier.of("nutriknight", "chembomb"), chembombItem);
        // Add it to the group / toolbox
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register((itemGroup) -> itemGroup.add(chembombItem));
        return chembombItem;
    }


    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // SHIVANK


    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // VIHAAN

    
}

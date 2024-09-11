package org.nk;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FluidBlock;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.NotNull;
import org.nk.chemworld.Chemblock;
import org.nk.cerealcity.*;
import org.nk.chemworld.Chembomb;
import org.nk.drinkworld.BobaTeaItem;
import org.nk.drinkworld.Spikes;
import org.nk.drinkworld.SpikesBlockItem;
import org.nk.drinkworld.SugarSlayerSwordItem;
import org.nk.drinkworld.Cornsyrup;
import org.nk.drinkworld.Coke;
import org.nk.drinkworld.Mentos;
import org.nk.frozenworld.*;
import org.nk.healthyfoods.Banana;
import org.nk.healthyfoods.Broccoli;
import org.nk.healthyfoods.GreenSword;
import org.nk.drinkworld.*;
import org.nk.fastfoodland.*;

import org.nk.frozenworld.FrostSword;
import org.nk.cerealcity.CerealBlock;
import org.nk.frozenworld.VolcanoCrust;

import org.nk.healthyfoods.Lettuce;
import org.nk.healthyfoods.Spinach;
import org.nk.healthyfoods.Tomato;


/**
 * Add methods for creation of Blocks and Items here
 */
public class NKBlocksAndItems {

    private static AbstractBlock.Settings MazeWallSettings;

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

    public static @NotNull RedBull createAndRegisterRedBull() {
        RedBull rbItem = new RedBull();
        Registry.register(Registries.ITEM, Identifier.of("nutriknight", "rbull"), rbItem);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register((itemGroup) -> itemGroup.add(rbItem));
        return rbItem;
    }
    public static @NotNull KaleJuice createAndRegisterKaleJuice() {
        KaleJuice kItem = new KaleJuice();
        Registry.register(Registries.ITEM, Identifier.of("nutriknight", "kjuice"), kItem);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register((itemGroup) -> itemGroup.add(kItem));
        return kItem;
    }

    public static @NotNull Espresso createAndRegisterEspresso() {
        Espresso eItem = new Espresso();
        Registry.register(Registries.ITEM, Identifier.of("nutriknight", "espresso"), eItem);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register((itemGroup) -> itemGroup.add(eItem));
        return eItem;
    }
    //FASTFOODLAND




    public static @NotNull Burger createAndRegisterBurger() {
        Burger britem=new Burger();
        Registry.register(Registries.ITEM, Identifier.of("nutriknight", "britem"), britem);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register((itemGroup) -> itemGroup.add(britem));
        return britem;
    }

    public static @NotNull BurgerBlaster createAndRegisterBurgerBlaster() {
        BurgerBlaster brbitem=new BurgerBlaster();
        Registry.register(Registries.ITEM, Identifier.of("nutriknight", "brbitem"), brbitem);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register((itemGroup) -> itemGroup.add(brbitem));
        return brbitem;
    }

    public static @NotNull Ketchup createAndRegisterFrenchFryArrow() {
        Ketchup fraitem=new Ketchup();
        Registry.register(Registries.ITEM, Identifier.of("nutriknight", "fraitem"), fraitem);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register((itemGroup) -> itemGroup.add(fraitem));
        return fraitem;
    }

    public static @NotNull FrenchFry createAndRegisterFrenchFry() {
        FrenchFry fritem=new FrenchFry();
        Registry.register(Registries.ITEM, Identifier.of("nutriknight", "fritem"), fritem);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register((itemGroup) -> itemGroup.add(fritem));
        return fritem;
    }

    public static @NotNull ChickenSword createAndRegisterChickenSword() {
        ChickenSword csword=new ChickenSword();
        Registry.register(Registries.ITEM, Identifier.of("nutriknight", "csword"), csword);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register((itemGroup) -> itemGroup.add(csword));
        return csword;
    }

    public static @NotNull ChickenNugget createAndRegisterChickenNugget() {
        ChickenNugget cnitem=new ChickenNugget();
        Registry.register(Registries.ITEM, Identifier.of("nutriknight", "cnitem"), cnitem);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register((itemGroup) -> itemGroup.add(cnitem));
        return cnitem;
    }

//    public static @NotNull Puzzle createAndRegisterPuzzle() {
///        Puzzle pitem;
  //      pitem = new Puzzle();
 //       Registry.register(Registries.ITEM, Identifier.of("nutriknight", "pitem"), pitem);
  //      ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register((itemGroup) -> itemGroup.add(pitem));
  //      return pitem;
  //  }









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
    public static Chemblock createAndRegisterChemblock() {
        Block.Settings chemblockSettings = Block.Settings.create().strength(16.0f);//.dropsLike(Block.getBlockFromItem(new MilkBucketItem(new Item.Settings())));
        Chemblock chemblock = new Chemblock(chemblockSettings);
        Registry.register(Registries.BLOCK, Identifier.of("nutriknight", "chemblock"), chemblock);
        return chemblock;
    }
    public static @NotNull BlockItem createAndRegisterChemBlockItem(Chemblock chemblock){
        SpikesBlockItem chemBlockItem = new SpikesBlockItem(chemblock, new Item.Settings());
        Registry.register(Registries.ITEM, Identifier.of("nutriknight", "chemblock"), chemBlockItem);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.REDSTONE).register((itemGroup) -> {
            itemGroup.add(chemBlockItem.asItem());
        });
        return chemBlockItem;
    }



    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // SHIVANK
//    public static final RegistryKey<ItemGroup> CUSTOM_ITEM_GROUP_KEY = RegistryKey.of(Registries.ITEM_GROUP.getKey(), Identifier.of(nutriknight, "item_group"));
//    public static final ItemGroup FROZEN_WORLD = FabricItemGroup.builder();
   public static @NotNull CerealBlock createAndRegisterIceCream() {
        Block.Settings IceCreamSettings = Block.Settings.create().strength(16.0f);
        CerealBlock IceCream = new CerealBlock(IceCreamSettings);
        Registry.register(Registries.BLOCK, Identifier.of("nutriknight", "ice_cream"), IceCream);
        Registry.register(Registries.ITEM, Identifier.of("nutriknight", "ice_cream"), new BlockItem(IceCream, new Item.Settings()));
        return IceCream;
    }
    public static @NotNull VolcanoCrust createAndRegisterVolcanoCrust(){
        Block.Settings VolcanoCrustSettings = Block.Settings.create().strength(20.0f);
        VolcanoCrust VolcanoCrust = new VolcanoCrust(VolcanoCrustSettings);
        Registry.register(Registries.BLOCK, Identifier.of("nutriknight", "volcanocrust"), VolcanoCrust);
        Registry.register(Registries.ITEM, Identifier.of("nutriknight", "volcanocrust"), new BlockItem(VolcanoCrust, new Item.Settings()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register((itemGroup) -> itemGroup.add(VolcanoCrust));
        return VolcanoCrust;
    }
    public static Item createAndRegisterFrostSword() {
        FrostSword frostSword = new FrostSword();
        Registry.register(Registries.ITEM, Identifier.of("nutriknight", "frostsword"), frostSword);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register((itemGroup) -> itemGroup.add(frostSword));
        return frostSword;
    }
    public static WaffleCone createAndRegisterWaffleCone() {
        Block.Settings WaffleConeSettings = Block.Settings.create().strength(16.0f);
        WaffleCone WaffleCone = new WaffleCone(WaffleConeSettings);
        Registry.register(Registries.BLOCK, Identifier.of("nutriknight", "wafflecone"), WaffleCone);
        Registry.register(Registries.ITEM, Identifier.of("nutriknight", "wafflecone"), new BlockItem(WaffleCone, new Item.Settings()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register((itemGroup) -> itemGroup.add(WaffleCone));

        return WaffleCone;
    }
    public static IceCreamFood createAndRegisterIceCreamFood() {
        IceCreamFood icecreamfood = new IceCreamFood();
        Registry.register(Registries.ITEM, Identifier.of("nutriknight", "icecreamfood"), icecreamfood);
        // Add it to the group / toolbox
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register((itemGroup) -> itemGroup.add(icecreamfood));
        return icecreamfood;
    }
    public static Icee createAndRegisterIcee(){
        Icee Icee = new Icee();
        Registry.register(Registries.ITEM, Identifier.of("nutriknight", "icee"), Icee);
        // Add it to the group / toolbox
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register((itemGroup) -> itemGroup.add(Icee));
        return Icee;
    }
    public static CustardBlock createAndRegisterCustardBlock() {
        Block.Settings CustardBlockSettings = Block.Settings.create().strength(16.0f);
        CustardBlock CustardBlock = new CustardBlock(CustardBlockSettings);
        Registry.register(Registries.BLOCK, Identifier.of("nutriknight", "custardblock"), CustardBlock);
        Registry.register(Registries.ITEM, Identifier.of("nutriknight", "custardblock"), new BlockItem(CustardBlock, new Item.Settings()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register((itemGroup) -> itemGroup.add(CustardBlock));

        return CustardBlock;
    }
    public static @NotNull PinkIceCream createAndRegisterPinkIceCream() {
        Block.Settings PinkIceCreamSettings = Block.Settings.create().strength(16.0f);
        PinkIceCream PinkIceCream = new PinkIceCream(PinkIceCreamSettings);
        Registry.register(Registries.BLOCK, Identifier.of("nutriknight", "pinkice_cream"), PinkIceCream);
        Registry.register(Registries.ITEM, Identifier.of("nutriknight", "pinkice_cream"), new BlockItem(PinkIceCream, new Item.Settings()));
        return PinkIceCream;
    }



    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // Greens world
    public static Broccoli createAndRegisterBroccoli(){
        Broccoli Broccoli = new Broccoli();
        Registry.register(Registries.ITEM, Identifier.of("nutriknight", "broccoli"), Broccoli);
        // Add it to the group / toolbox
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register((itemGroup) -> itemGroup.add(Broccoli));
        return Broccoli;
    }
    public static Banana createAndRegisterBanana(){
        Banana Banana = new Banana();
        Registry.register(Registries.ITEM, Identifier.of("nutriknight", "banana"), Banana);
        // Add it to the group / toolbox
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register((itemGroup) -> itemGroup.add(Banana));
        return Banana;
    }
    public static @NotNull GreenSword createAndRegisterGreenSword() {
        GreenSword GreenSword = new GreenSword();
        Registry.register(Registries.ITEM, Identifier.of("nutriknight", "greensword"), GreenSword);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register((itemGroup) -> itemGroup.add(GreenSword));
        return GreenSword;
    }
    public static @NotNull Spinach createAndRegisterSpinach() {
        Spinach spinach =new Spinach();
        Registry.register(Registries.ITEM, Identifier.of("nutriknight", "spinach"), spinach);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register((itemGroup) -> itemGroup.add(spinach));
        return spinach;
    }

    public static @NotNull Lettuce createAndRegisterLettuce() {
        Lettuce lettuce=new Lettuce();
        Registry.register(Registries.ITEM, Identifier.of("nutriknight", "lettuce"), lettuce);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register((itemGroup) -> itemGroup.add(lettuce));
        return lettuce;
    }

    public static @NotNull Tomato createAndRegisterTomato() {
        Tomato tomato=new Tomato();
        Registry.register(Registries.ITEM, Identifier.of("nutriknight", "tomato"), tomato);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register((itemGroup) -> itemGroup.add(tomato));
        return tomato;
    }







    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
 //    VIHAAN
    public static Item cerealSword() {
        CerealSword sssItem = new CerealSword();
        final CerealSwordMaterial INSTANCE= new CerealSwordMaterial();
        Registry.register(Registries.ITEM, Identifier.of("nutriknight", "cereal_sword"), sssItem);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register((itemGroup) -> itemGroup.add(sssItem));
        return sssItem;
    }
    public static @NotNull Item cerealItem() {
        Item cereal = new CerealItem();
        Registry.register(Registries.ITEM, Identifier.of("nutriknight", "cereal"), cereal);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register((itemGroup) -> itemGroup.add(cereal));
        return cereal;
    }
    public static FlowableFluid Still_milk;
    public static FlowableFluid Flowing_milk;
    public static Item Toxic_Milk_Bucket;
    public static @NotNull Item oatsItem() {
        Item oats = new OatsItem();
        Registry.register(Registries.ITEM, Identifier.of("nutriknight", "oats"), oats);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register((itemGroup) -> itemGroup.add(oats));
        return oats;
    }
    public static @NotNull void  ToxicBucket() {
        BucketItem bucketItem = new BucketItem(Still_milk, new Item.Settings().recipeRemainder(Items.BUCKET).maxCount(16));

        Still_milk = Registry.register(Registries.FLUID, Identifier.of("nutriknight", "toxic_milk"), new ToxicMilk());
        Flowing_milk = Registry.register(Registries.FLUID, Identifier.of("nutriknight", "flowing_toxic_milk"), new ToxicMilk());
        Toxic_Milk_Bucket = Registry.register(Registries.ITEM, Identifier.of("nutriknight", "toxic_milk_bucket"), bucketItem);
        Registry.register(
                Registries.BLOCK,
                Identifier.of("nutriknight", "toxic"),
                new FluidBlock(Still_milk, AbstractBlock.Settings.create().liquid()) {
                });
        }
        public static @NotNull CerealBlock CerealBlock() {
            Block.Settings IceCreamSettings = Block.Settings.create().strength(16.0f);
            CerealBlock cerealBlock = new CerealBlock(IceCreamSettings);
            Registry.register(Registries.BLOCK, Identifier.of("nutriknight", "cereal_block"), cerealBlock);
            Registry.register(Registries.ITEM, Identifier.of("nutriknight", "cereal_block"), new BlockItem(cerealBlock, new Item.Settings()));
            return cerealBlock;
        }
}

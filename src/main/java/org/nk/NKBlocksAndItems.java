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
import org.nk.chemworld.*;
import org.nk.cerealcity.*;
import org.nk.drinkworld.BobaTeaItem;
import org.nk.drinkworld.Spikes;
import org.nk.drinkworld.SpikesBlockItem;
import org.nk.drinkworld.SugarSlayerSwordItem;
import org.nk.drinkworld.Cornsyrup;
import org.nk.drinkworld.Coke;
import org.nk.drinkworld.Mentos;
import org.nk.frozenworld.*;
import org.nk.greensworld.Banana;
import org.nk.greensworld.Broccoli;
import org.nk.greensworld.GreenSword;
import org.nk.drinkworld.*;
import org.nk.fastfoodland.*;

import org.nk.frozenworld.FrostSword;
import org.nk.cerealcity.CerealBlock;
import org.nk.frozenworld.VolcanoCrust;

import org.nk.greensworld.Lettuce;
import org.nk.greensworld.Spinach;
import org.nk.greensworld.Tomato;
import org.nk.snacksociety.Cheetos;
import org.nk.snacksociety.Chips;
import org.nk.snacksociety.Gum;
import org.nk.greensworld.*;

/**
 * Add methods for creation of Blocks and Items here
 */
public class NKBlocksAndItems {
    public static FlowableFluid STILL_MILK;
    public static FlowableFluid FLOWING_MILK;
    public static Item TOXIC_MILK_BUCKET;
    public static Block MILK;

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

    public static SugarBlock createAndRegisterSugarBlock() {
        Block.Settings SugarBlockSettings = Block.Settings.create().strength(16.0f);
        SugarBlock sblock = new SugarBlock(SugarBlockSettings);
        Registry.register(Registries.BLOCK, Identifier.of("nutriknight", "sblock"), sblock);
        Registry.register(Registries.ITEM, Identifier.of("nutriknight", "sblock"), new BlockItem(sblock, new Item.Settings()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register((itemGroup) -> itemGroup.add(sblock));

        return sblock;
    }

    public static GreaseBlock createAndRegisterGreaseBlock() {
        Block.Settings GreaseBlockSettings = Block.Settings.create().strength(16.0f);
        GreaseBlock gblock = new GreaseBlock(GreaseBlockSettings);
        Registry.register(Registries.BLOCK, Identifier.of("nutriknight", "gblock"), gblock);
        Registry.register(Registries.ITEM, Identifier.of("nutriknight", "gblock"), new BlockItem(gblock, new Item.Settings()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register((itemGroup) -> itemGroup.add(gblock));

        return gblock;
    }

//    public static @NotNull Puzzle createAndRegisterPuzzle() {
///        Puzzle pitem;
    //      pitem = new Puzzle();
    //       Registry.register(Registries.ITEM, Identifier.of("nutriknight", "pitem"), pitem);
    //      ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register((itemGroup) -> itemGroup.add(pitem));
    //      return pitem;
    //  }

    //snacksociety
    public static @NotNull Chips createAndRegisterChips() {
        Chips chips=new Chips();
        Registry.register(Registries.ITEM, Identifier.of("nutriknight", "chips"), chips);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register((itemGroup) -> itemGroup.add(chips));
        return chips;
    }

    public static @NotNull Gum createAndRegisterGum() {
        Gum gum=new Gum();
        Registry.register(Registries.ITEM, Identifier.of("nutriknight", "gum"), gum);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register((itemGroup) -> itemGroup.add(gum));
        return gum;
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
    public static Chemblock createAndRegisterChemblock() {
        Block.Settings ChemblockSettings = Block.Settings.create().strength(16.0f);
        Chemblock Chemblock = new Chemblock(ChemblockSettings);
        Registry.register(Registries.BLOCK, Identifier.of("nutriknight", "chemblock"),Chemblock);
        Registry.register(Registries.ITEM, Identifier.of("nutriknight", "chemblock"), new BlockItem(Chemblock, new Item.Settings()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register((itemGroup) -> itemGroup.add(Chemblock));

        return Chemblock;
    }


    public static @NotNull Item createAndRegisterchemmedicineItem() {
        ChemMedicine chemmedicine = new ChemMedicine();
        Registry.register(Registries.ITEM, Identifier.of("nutriknight", "chemmedicine"),chemmedicine);
        // Add it to the group / toolbox
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register((itemGroup) -> itemGroup.add(chemmedicine));
        return chemmedicine;
    }
    public static proteinpowder createAndRegisterproteinpowder() {
        proteinpowder kItem= new proteinpowder();
        Registry.register(Registries.ITEM, Identifier.of("nutriknight", "proteinpowder"),kItem);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register((itemGroup) -> itemGroup.add(kItem));
        return kItem;
    }






    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // SHIVANK
    //    public static final RegistryKey<ItemGroup> CUSTOM_ITEM_GROUP_KEY = RegistryKey.of(Registries.ITEM_GROUP.getKey(), Identifier.of(nutriknight, "item_group"));
    //    public static final ItemGroup FROZEN_WORLD = FabricItemGroup.builder();
    public static @NotNull IceCream createAndRegisterIceCream() {
        Block.Settings IceCreamSettings = Block.Settings.create().strength(16.0f);
        IceCream IceCream = new IceCream(IceCreamSettings);
        Registry.register(Registries.BLOCK, Identifier.of("nutriknight", "ice_cream"), IceCream);
        Registry.register(Registries.ITEM, Identifier.of("nutriknight", "ice_cream"), new BlockItem(IceCream, new Item.Settings()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register((itemGroup) -> itemGroup.add(IceCream));
        return IceCream;
    }
    public static @NotNull VolcanoCrust createAndRegisterVolcanoCrust(){
        Block.Settings VolcanoCrustSettings = Block.Settings.create().strength(20.0f);
        VolcanoCrust VolcanoCrust = new VolcanoCrust(VolcanoCrustSettings);
        Registry.register(Registries.BLOCK, Identifier.of("nutriknight", "volcanocrust"), VolcanoCrust);
        Registry.register(Registries.ITEM, Identifier.of("nutriknight", "volcanocrust"), new BlockItem(VolcanoCrust, new Item.Settings()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register((itemGroup) -> itemGroup.add(VolcanoCrust));
        return VolcanoCrust;
    }
    public static Item createAndRegisterFrostSword() {
        FrostSword frostSword = new FrostSword();
        Registry.register(Registries.ITEM, Identifier.of("nutriknight", "frostsword"), frostSword);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register((itemGroup) -> itemGroup.add(frostSword));
        return frostSword;
    }
    public static WaffleCone createAndRegisterWaffleCone() {
        Block.Settings WaffleConeSettings = Block.Settings.create().strength(16.0f);
        WaffleCone WaffleCone = new WaffleCone(WaffleConeSettings);
        Registry.register(Registries.BLOCK, Identifier.of("nutriknight", "wafflecone"), WaffleCone);
        Registry.register(Registries.ITEM, Identifier.of("nutriknight", "wafflecone"), new BlockItem(WaffleCone, new Item.Settings()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register((itemGroup) -> itemGroup.add(WaffleCone));

        return WaffleCone;
    }
    public static IceCreamFood createAndRegisterIceCreamFood() {
        IceCreamFood icecreamfood = new IceCreamFood();
        Registry.register(Registries.ITEM, Identifier.of("nutriknight", "icecreamfood"), icecreamfood);
        // Add it to the group / toolbox
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register((itemGroup) -> itemGroup.add(icecreamfood));
        return icecreamfood;
    }
    public static Icee createAndRegisterIcee(){
        Icee Icee = new Icee();
        Registry.register(Registries.ITEM, Identifier.of("nutriknight", "icee"), Icee);
        // Add it to the group / toolbox
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register((itemGroup) -> itemGroup.add(Icee));
        return Icee;
    }
    public static CustardBlock createAndRegisterCustardBlock() {
        Block.Settings CustardBlockSettings = Block.Settings.create().strength(16.0f);
        CustardBlock CustardBlock = new CustardBlock(CustardBlockSettings);
        Registry.register(Registries.BLOCK, Identifier.of("nutriknight", "custardblock"), CustardBlock);
        Registry.register(Registries.ITEM, Identifier.of("nutriknight", "custardblock"), new BlockItem(CustardBlock, new Item.Settings()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register((itemGroup) -> itemGroup.add(CustardBlock));

        return CustardBlock;
    }
    public static @NotNull PinkIceCream createAndRegisterPinkIceCream() {
        Block.Settings PinkIceCreamSettings = Block.Settings.create().strength(16.0f);
        PinkIceCream PinkIceCream = new PinkIceCream(PinkIceCreamSettings);
        Registry.register(Registries.BLOCK, Identifier.of("nutriknight", "pinkice_cream"), PinkIceCream);
        Registry.register(Registries.ITEM, Identifier.of("nutriknight", "pinkice_cream"), new BlockItem(PinkIceCream, new Item.Settings()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register((itemGroup) -> itemGroup.add(PinkIceCream));
        return PinkIceCream;
    }



    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // Greens world
    public static Broccoli createAndRegisterBroccoli(){
        Broccoli Broccoli = new Broccoli();
        Registry.register(Registries.ITEM, Identifier.of("nutriknight", "broccoli"), Broccoli);
        // Add it to the group / toolbox
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register((itemGroup) -> itemGroup.add(Broccoli));
        return Broccoli;
    }
    public static Banana createAndRegisterBanana(){
        Banana Banana = new Banana();
        Registry.register(Registries.ITEM, Identifier.of("nutriknight", "banana"), Banana);
        // Add it to the group / toolbox
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register((itemGroup) -> itemGroup.add(Banana));
        return Banana;
    }
    public static @NotNull GreenSword createAndRegisterGreenSword() {
        GreenSword GreenSword = new GreenSword();
        Registry.register(Registries.ITEM, Identifier.of("nutriknight", "greensword"), GreenSword);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register((itemGroup) -> itemGroup.add(GreenSword));
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
    public static @NotNull Pear createAndRegisterPear() {
        Pear Pear=new Pear();
        Registry.register(Registries.ITEM, Identifier.of("nutriknight", "pear"), Pear);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register((itemGroup) -> itemGroup.add(Pear));
        return Pear;
    }
    public static @NotNull Strawberry createAndRegisterStrawberry() {
        Strawberry Strawberry=new Strawberry();
        Registry.register(Registries.ITEM, Identifier.of("nutriknight", "strawberry"), Strawberry);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register((itemGroup) -> itemGroup.add(Strawberry));
        return Strawberry;
    }
    public static @NotNull CheeseBlock createAndRegisterCheese() {
        Block.Settings CheeseBlockSettings = Block.Settings.create().strength(16.0f);
        CheeseBlock CheeseBlock = new CheeseBlock(CheeseBlockSettings);
        Registry.register(Registries.BLOCK, Identifier.of("nutriknight", "cheeseblock"), CheeseBlock);
        Registry.register(Registries.ITEM, Identifier.of("nutriknight", "cheeseblock"), new BlockItem(CheeseBlock, new Item.Settings()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register((itemGroup) -> itemGroup.add(CheeseBlock));
        return CheeseBlock;
    }
    public static @NotNull Yogurt createAndRegisterYogurt() {
        Yogurt Yogurt=new Yogurt();
        Registry.register(Registries.ITEM, Identifier.of("nutriknight", "yogurt"), Yogurt);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register((itemGroup) -> itemGroup.add(Yogurt));
        return Yogurt;
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
    public static @NotNull Item oatsItem() {
        Item oats = new OatsItem();
        Registry.register(Registries.ITEM, Identifier.of("nutriknight", "oats"), oats);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register((itemGroup) -> itemGroup.add(oats));
        return oats;
    }
    public static @NotNull Item Pizza() {
        Item pizza = new Pizza();
        Registry.register(Registries.ITEM, Identifier.of("nutriknight", "pizza"), pizza);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register((itemGroup) -> itemGroup.add(pizza));
        return pizza;
    }
    public static @NotNull Item EggsAndBacon() {
        Item eggsandbacon = new EggsAndBacon();
        Registry.register(Registries.ITEM, Identifier.of("nutriknight", "eggs_and_bacon"), eggsandbacon);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register((itemGroup) -> itemGroup.add(eggsandbacon));
        return eggsandbacon;
    }
    public static @NotNull Item AirheadExtreme() {
        Item airheadExtreme = new AirheadExtreme();
        Registry.register(Registries.ITEM, Identifier.of("nutriknight", "airhead_extreme"), airheadExtreme);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register((itemGroup) -> itemGroup.add(airheadExtreme));
        return airheadExtreme;
    }
    public static @NotNull Item Gatorade() {
        Item gatorade = new Gatorade();
        Registry.register(Registries.ITEM, Identifier.of("nutriknight", "gatorade"), gatorade);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register((itemGroup) -> itemGroup.add(gatorade));
        return gatorade;
    }
    public static @NotNull Item Cheetos() {
        Item cheetos = new Cheetos();
        Registry.register(Registries.ITEM, Identifier.of("nutriknight", "cheetos"), cheetos);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register((itemGroup) -> itemGroup.add(cheetos));
        return cheetos;
    }
    public static @NotNull Item FriedChicken() {
        Item friedChicken = new FriedChicken();
        Registry.register(Registries.ITEM, Identifier.of("nutriknight", "fried_chicken"), friedChicken);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register((itemGroup) -> itemGroup.add(friedChicken));
        return friedChicken;
    }
    public static @NotNull Item HotDog() {
        Item hotDog = new HotDog();
        Registry.register(Registries.ITEM, Identifier.of("nutriknight", "hot_dog"), hotDog);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register((itemGroup) -> itemGroup.add(hotDog));
        return hotDog;
    }
    public static @NotNull Item Roti() {
        Item roti = new Roti();
        Registry.register(Registries.ITEM, Identifier.of("nutriknight", "roti"), roti);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register((itemGroup) -> itemGroup.add(roti));
        return roti;
    }

    public static void  ToxicBucket() {
        STILL_MILK = Registry.register(Registries.FLUID, Identifier.of("nutriknight", "toxic_milk"), new ToxicMilk.Still());
        FLOWING_MILK = Registry.register(Registries.FLUID, Identifier.of("nutriknight", "flowing_toxic_milk"), new ToxicMilk.Flowing());
        TOXIC_MILK_BUCKET = Registry.register(Registries.ITEM, Identifier.of("nutriknight", "toxic_milk_bucket"),
                new BucketItem(STILL_MILK, new Item.Settings().recipeRemainder(Items.BUCKET).maxCount(1)));
        MILK = Registry.register(Registries.BLOCK, Identifier.of("nutriknight", "milk"), new FluidBlock(STILL_MILK, Blocks.WATER.getSettings()){});
    }

    public static @NotNull CerealBlock CerealBlock() {
        Block.Settings IceCreamSettings = Block.Settings.create().strength(16.0f);
        CerealBlock cerealBlock = new CerealBlock(IceCreamSettings);
        Registry.register(Registries.BLOCK, Identifier.of("nutriknight", "cereal_block"), cerealBlock);
        Registry.register(Registries.ITEM, Identifier.of("nutriknight", "cereal_block"), new BlockItem(cerealBlock, new Item.Settings()));
        return cerealBlock;
    }
}


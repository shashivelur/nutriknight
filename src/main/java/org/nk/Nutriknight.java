package org.nk;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.nk.chemworld.Chemblock;
import org.nk.drinkworld.Cornsyrup;
import org.nk.drinkworld.Spikes;
import org.nk.greensworld.Corn;


public class Nutriknight implements ModInitializer {
    public static final String MOD_ID = "nutriknight";
    public static final Item CORN_BOW = new Corn(new Item.Settings());

    @Override
    public void onInitialize() {
//        FrozenWorldItemGroup.register();
        NKBlocksAndItems.createAndRegisterBobaTeaItem();
        NKBlocksAndItems.createAndRegisterSugarSlayerSwordItem();
        Spikes spikes = NKBlocksAndItems.createAndRegisterSpikes();
        NKBlocksAndItems.createAndRegisterSpikesBlockItem(spikes);
        NKBlocksAndItems.createAndRegisterChembombItem();
        //Chemblock chemblock = NKBlocksAndItems.createAndRegisterChemblock();
        NKBlocksAndItems.createAndRegisterChemblock();
        NKBlocksAndItems.createAndRegisterchemmedicineItem();
        NKBlocksAndItems.createAndRegisterCornsyrup();
        NKBlocksAndItems.createAndRegisterCoke();
        NKBlocksAndItems.createAndRegisterMentos();
        NKBlocksAndItems.createAndRegisterIceCream();
        NKBlocksAndItems.createAndRegisterVolcanoCrust();
        NKBlocksAndItems.createAndRegisterFrostSword();
        NKBlocksAndItems.createAndRegisterWaffleCone();
        NKBlocksAndItems.createAndRegisterIceCreamFood();
        NKBlocksAndItems.createAndRegisterIcee();
        NKBlocksAndItems.createAndRegisterCustardBlock();
        NKBlocksAndItems.createAndRegisterPinkIceCream();
        NKBlocksAndItems.createAndRegisterBroccoli();
        NKBlocksAndItems.createAndRegisterBanana();
        NKBlocksAndItems.createAndRegisterGreenSword();
        Registry.register(Registries.ITEM, Identifier.of(MOD_ID, "corn"), CORN_BOW);
        NKBlocksAndItems.createAndRegisterRedBull();
        NKBlocksAndItems.createAndRegisterKaleJuice();
        NKBlocksAndItems.createAndRegisterEspresso();
        NKBlocksAndItems.createAndRegisterBroccoli();
        NKBlocksAndItems.createAndRegisterSpinach();
        NKBlocksAndItems.createAndRegisterLettuce();
        NKBlocksAndItems.createAndRegisterTomato();
        NKBlocksAndItems.createAndRegisterBurger();
        NKBlocksAndItems.createAndRegisterBurgerBlaster();
        NKBlocksAndItems.createAndRegisterFrenchFryArrow();
        NKBlocksAndItems.createAndRegisterFrenchFry();
        NKBlocksAndItems.createAndRegisterChickenSword();
        NKBlocksAndItems.createAndRegisterChickenNugget();
        NKBlocksAndItems.cerealSword();
        NKBlocksAndItems.cerealItem();
        NKBlocksAndItems.oatsItem();
        NKBlocksAndItems.ToxicBucket();
        NKBlocksAndItems.CerealBlock();
        NKBlocksAndItems.Pizza();
        NKBlocksAndItems.EggsAndBacon();
        NKBlocksAndItems.createAndRegisterPear();
        NKBlocksAndItems.createAndRegisterStrawberry();
        NKBlocksAndItems.createAndRegisterCheese();
        NKBlocksAndItems.createAndRegisterYogurt();
        NKBlocksAndItems.Roti();
        NKBlocksAndItems.createAndRegisterSugarBlock();
        NKBlocksAndItems.createAndRegisterGreaseBlock();
        NKBlocksAndItems.createAndRegisterChips();
        NKBlocksAndItems.createAndRegisterGum();
        NKBlocksAndItems.createAndRegisterCornsyrup();
        NKBlocksAndItems.AirheadExtreme();
        NKBlocksAndItems.Gatorade();
        NKBlocksAndItems.Cheetos();
        NKBlocksAndItems.FriedChicken();
        NKBlocksAndItems.HotDog();
    }
}

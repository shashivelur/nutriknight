package org.nk;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.nk.chemworld.Chemblock;
import org.nk.drinkworld.Cornsyrup;
import org.nk.drinkworld.Spikes;
import org.nk.healthyfoods.Corn;


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
        Chemblock chemblock = NKBlocksAndItems.createAndRegisterChemblock();
        NKBlocksAndItems.createAndRegisterChemblock();
        NKBlocksAndItems.createAndRegisterGChembombItem();
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
        //NKBlocksAndItems.ToxicBucket();
        NKBlocksAndItems.CerealBlock();
    }
}

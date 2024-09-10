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
import org.nk.drinkworld.Cornsyrup;
import org.nk.drinkworld.Spikes;
import org.nk.healthyfoods.Corn;
//import org.nk.healthyfoods.CornProjectile;


public class Nutriknight implements ModInitializer {
    public static final String MOD_ID = "nutriknight";
    public static final Item CORN_BOW = new Corn(new Item.Settings());

//    public static final EntityType<CornProjectile> CORN_PROJECTILE = Registry.register(
//            Registries.ENTITY_TYPE, Identifier.of(MOD_ID, "corn"),
//            FabricEntityTypeBuilder.create(SpawnGroup.MISC, CornProjectile::new)
//                    .build());



    @Override
    public void onInitialize() {
//        FrozenWorldItemGroup.register();
        NKBlocksAndItems.createAndRegisterBobaTeaItem();
        NKBlocksAndItems.createAndRegisterSugarSlayerSwordItem();
        Spikes spikes = NKBlocksAndItems.createAndRegisterSpikes();
        NKBlocksAndItems.createAndRegisterSpikesBlockItem(spikes);
        NKBlocksAndItems.createAndRegisterChembombItem();
        NKBlocksAndItems.createAndRegisterChemblock();
        NKBlocksAndItems.createAndRegisterCornsyrup();
        NKBlocksAndItems.createAndRegisterBigRed();
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

    }


}

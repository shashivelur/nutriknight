package org.nk;

import net.fabricmc.api.ModInitializer;
import org.nk.drinkworld.Cornsyrup;
import org.nk.drinkworld.Spikes;

public class Nutriknight implements ModInitializer {

    @Override
    public void onInitialize() {
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
    }


}

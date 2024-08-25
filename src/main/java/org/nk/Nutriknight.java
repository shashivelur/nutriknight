package org.nk;

import net.fabricmc.api.ModInitializer;
import org.nk.drinkworld.Spikes;

public class Nutriknight implements ModInitializer {

    @Override
    public void onInitialize() {
        NKBlocksAndItems.createAndRegisterBobaTeaItem();
        NKBlocksAndItems.createAndRegisterSugarSlayerSwordItem();

        Spikes spikes = NKBlocksAndItems.createAndRegisterSpikes();
        NKBlocksAndItems.createAndRegisterSpikesBlockItem(spikes);
    }


}

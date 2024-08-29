package org.nk.drinkworld;

import net.minecraft.item.Item;
import net.minecraft.item.SnowballItem;
import net.minecraft.item.WindChargeItem;

public class BigRed extends WindChargeItem {

        public BigRed() {
            super( createSettings());
        }
        private static Item.Settings createSettings() {
            return new Item.Settings();
        }




    }



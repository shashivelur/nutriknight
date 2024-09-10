//package org.nk.frozenworld;
//
//import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
//import net.minecraft.item.ItemGroup;
//import net.minecraft.item.ItemStack;
//import net.minecraft.item.Items;
//import net.minecraft.registry.Registries;
//import net.minecraft.registry.RegistryKey;
//import net.minecraft.text.Text;
//import net.minecraft.util.Identifier;
//
//public class FrozenWorldItemGroup {
//    public static final RegistryKey<ItemGroup> CUSTOM_ITEM_GROUP_KEY = RegistryKey.of(Registries.ITEM_GROUP.getKey(), createIdentifier());
//
//    public static final ItemGroup CUSTOM_ITEM_GROUP = FabricItemGroup.builder()
//            // .icon(() -> new ItemStack(NKBlocksAndItems.WaffleCone)) // Uncomment and set your custom icon
//            .displayName(Text.translatable("itemGroup.nutriknights.frozenworlditemgroup"))
//            .build();
//
//    private static Identifier createIdentifier() {
//        return new Identifier("nutriknights", "frozenworlditemgroup");
//    }
//
//    public static void register() {
//        // This method can include any additional setup for your item group if needed.
//        CUSTOM_ITEM_GROUP.getDisplayName();
//    }
//}
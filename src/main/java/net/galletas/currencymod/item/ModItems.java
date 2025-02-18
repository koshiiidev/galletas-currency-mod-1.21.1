package net.galletas.currencymod.item;

import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.galletas.currencymod.GalletasCurrencyMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class ModItems {
    public static final Item COIN = registerItem("coin", new Item(new Item.Settings()));
    public static final Item WALLET = registerItem("wallet", new Item(new Item.Settings()));

    private static void addItemsToIngridientItemGroup(FabricItemGroupEntries entries){
        entries.add(COIN);
        entries.add(WALLET);

    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(GalletasCurrencyMod.MOD_ID, name), item);
    }
    public static void registerModItems() {
        GalletasCurrencyMod.LOGGER.info("Registering Mod Items for " + GalletasCurrencyMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngridientItemGroup);
    }
}

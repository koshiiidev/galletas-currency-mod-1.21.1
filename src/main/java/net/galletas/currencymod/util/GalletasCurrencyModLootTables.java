package net.galletas.currencymod.util;

import net.galletas.currencymod.GalletasCurrencyMod;
import net.minecraft.loot.LootTable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public class GalletasCurrencyModLootTables {
    public static RegistryKey<LootTable> TEST_CHEST_LOOT = RegistryKey.of(RegistryKey.LOOT_TABLE, Identifier.of(GalletasCurrencyMod.MOD_ID, "chest/test_loot"));
}

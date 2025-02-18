package net.galletas.currencymod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.galletas.currencymod.GalletasCurrencyMod;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup COIN_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(GalletasCurrencyMod.MOD_ID, "coin"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.coin"))
                    .icon(() -> new ItemStack(ModItems.COIN)).entries((displayContext, entries) -> {
                        entries.add(ModItems.COIN);
                        entries.add(ModItems.WALLET);

                    }).build());
    public static void registerItemGroups() {
        GalletasCurrencyMod.LOGGER.info("Registering Items Groups for " + GalletasCurrencyMod.MOD_ID);
    }
}

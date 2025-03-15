package net.galletas.currencymod;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.galletas.currencymod.util.CoinsChestLootTable;

public class GalletasCurrencyModDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {


		pack.addProvider(CoinsChestLootTable::new);
		//pack.addProvider(CoinsZombieLootTable::new);
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

	}



}



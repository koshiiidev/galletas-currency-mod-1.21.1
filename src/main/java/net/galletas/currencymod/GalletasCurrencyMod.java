package net.galletas.currencymod;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GalletasCurrencyMod implements ModInitializer {
	//public static final String MOD_NAME = "Galleta's Currency Mod";
	public static final String MOD_ID = "galletascurrencymod";


	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		LOGGER.info("Hello Fabric world!");
	}
}
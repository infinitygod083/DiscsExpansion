package net.infinitygod083.discsexpansion;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DiscsExpansion implements ModInitializer {
	public static final String MOD_ID = "discsexpansion";
    public static final Logger LOGGER = LoggerFactory.getLogger("discsexpansion");

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
	}
}
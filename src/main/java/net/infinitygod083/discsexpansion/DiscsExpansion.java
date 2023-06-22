package net.infinitygod083.discsexpansion;

import net.fabricmc.api.ModInitializer;

import net.infinitygod083.discsexpansion.item.ModItemGroup;
import net.infinitygod083.discsexpansion.item.ModItems;
import net.infinitygod083.discsexpansion.sound.ModSounds;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DiscsExpansion implements ModInitializer {
	public static final String MOD_ID = "discsexpansion";
    public static final Logger LOGGER = LoggerFactory.getLogger("discsexpansion");

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModItemGroup.registerItemGroups();
	}
}
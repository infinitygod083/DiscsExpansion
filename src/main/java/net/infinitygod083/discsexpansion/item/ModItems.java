package net.infinitygod083.discsexpansion.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.infinitygod083.discsexpansion.DiscsExpansion;
import net.infinitygod083.discsexpansion.sound.ModSounds;
import net.minecraft.item.Item;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item MUSIC_DISC_MASK = registerItem("music_disc_mask",
            new MusicDiscItem(6, ModSounds.MASK, new FabricItemSettings().maxCount(1), 174));
    public static final Item MUSIC_DISC_TRANCE_MUSIC_FOR_RACING_GAME = registerItem("music_disc_trance_music_for_racing_game",
            new MusicDiscItem(6, ModSounds.TRANCE_MUSIC_FOR_RACING_GAME, new FabricItemSettings().maxCount(1), 319));
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(DiscsExpansion.MOD_ID, name), item);
    }
    public static void registerModItems() {
        DiscsExpansion.LOGGER.info("Registering Mod Items for" + DiscsExpansion.MOD_ID);
    }
}

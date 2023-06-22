package net.infinitygod083.discsexpansion.sound;

import net.infinitygod083.discsexpansion.DiscsExpansion;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {
    public static SoundEvent TRANCE_MUSIC_FOR_RACING_GAME = registerSoundEvent("bobby_cole_trance_music_for_racing_game");
    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(DiscsExpansion.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }
}

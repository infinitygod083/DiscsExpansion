package net.infinitygod083.discsexpansion.sound;

import net.infinitygod083.discsexpansion.DiscsExpansion;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {
    public static SoundEvent EVEN_THOUGH_IM_JUST_A_LITTLE_GOAT = registerSoundEvent("qianmin_gu_even_though_im_just_a_little_goat");
    public static SoundEvent MASK = registerSoundEvent("dream_mask");
    public static SoundEvent TRANCE_MUSIC_FOR_RACING_GAME = registerSoundEvent("bobby_cole_trance_music_for_racing_game");
    public static SoundEvent UNTIL_I_END_UP_DEAD = registerSoundEvent("dream_until_i_end_up_dead");
    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(DiscsExpansion.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }
}

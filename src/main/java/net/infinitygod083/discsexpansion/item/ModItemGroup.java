package net.infinitygod083.discsexpansion.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.infinitygod083.discsexpansion.DiscsExpansion;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static ItemGroup CLASSIC_ANIMATION_MUSIC_DISCS = Registry.register(Registries.ITEM_GROUP, new Identifier(DiscsExpansion.MOD_ID, "classic_animation_music_discs"),
            FabricItemGroup.builder()
                    .displayName(Text.translatable("itemgroup.classic_animation_music_discs"))
                    .icon(() -> new ItemStack(ModItems.MUSIC_DISC_EVEN_THOUGH_IM_JUST_A_LITTLE_GOAT)).entries((displayContext, entries) -> {
                        entries.add(ModItems.MUSIC_DISC_EVEN_THOUGH_IM_JUST_A_LITTLE_GOAT);
                    }).build());
    public static ItemGroup MCYT_MUSIC_DISCS = Registry.register(Registries.ITEM_GROUP, new Identifier(DiscsExpansion.MOD_ID, "mcyt_music_discs"),
            FabricItemGroup.builder()
                    .displayName(Text.translatable("itemgroup.mcyt_music_discs"))
                    .icon(() -> new ItemStack(ModItems.MUSIC_DISC_UNTIL_I_END_UP_DEAD)).entries((displayContext, entries) -> {
                        entries.add(ModItems.MUSIC_DISC_MASK);
                        entries.add(ModItems.MUSIC_DISC_TRANCE_MUSIC_FOR_RACING_GAME);
                        entries.add(ModItems.MUSIC_DISC_UNTIL_I_END_UP_DEAD);
                    }).build());
    public static void registerItemGroups() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> {
            entries.add(ModItems.MUSIC_DISC_EVEN_THOUGH_IM_JUST_A_LITTLE_GOAT);
            entries.add(ModItems.MUSIC_DISC_MASK);
            entries.add(ModItems.MUSIC_DISC_TRANCE_MUSIC_FOR_RACING_GAME);
            entries.add(ModItems.MUSIC_DISC_UNTIL_I_END_UP_DEAD);
        });
    }
}

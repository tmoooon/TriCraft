package org.tmon.tricraft.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectionContext;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.PlacedFeature;
import org.tmon.tricraft.TriCraft;

import java.util.function.Predicate;

public class ModFeatures {
    public static final RegistryKey<PlacedFeature> OVERWORLD_GIGERIUM_ORE = registryOreFeature(
            "gigerium_ore",
            RegistryKeys.PLACED_FEATURE,
            BiomeSelectors.foundInOverworld(),
            GenerationStep.Feature.UNDERGROUND_ORES);
    public static final RegistryKey<PlacedFeature> NETHER_INES_ORE = registryOreFeature(
            "nether_ines_ore",
            RegistryKeys.PLACED_FEATURE,
            BiomeSelectors.foundInTheNether(),
            GenerationStep.Feature.UNDERGROUND_ORES);
    public static final RegistryKey<PlacedFeature> END_INES_ORE = registryOreFeature(
            "end_ines_ore",
            RegistryKeys.PLACED_FEATURE,
            BiomeSelectors.foundInTheEnd(),
            GenerationStep.Feature.UNDERGROUND_ORES);

    private static RegistryKey<PlacedFeature> registryOreFeature(String id, RegistryKey<Registry<PlacedFeature>> registryKey, Predicate<BiomeSelectionContext> biomeSelectionContext, GenerationStep.Feature feature){
        RegistryKey<PlacedFeature> result = RegistryKey.of(registryKey, new Identifier(TriCraft.MOD_ID, id));
        BiomeModifications.addFeature(biomeSelectionContext, feature, result);

        return result;
    }

    public static void register() {
        TriCraft.LOGGER.debug("Registering items for: " + TriCraft.MOD_ID);
    }
}

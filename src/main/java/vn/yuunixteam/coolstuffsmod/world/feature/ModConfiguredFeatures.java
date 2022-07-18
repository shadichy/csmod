package vn.yuunixteam.coolstuffsmod.world.feature;

import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;
import vn.yuunixteam.coolstuffsmod.Main;
import vn.yuunixteam.coolstuffsmod.block.ModBlocks;

import java.util.List;

public class ModConfiguredFeatures {

    public static final List<OreFeatureConfig.Target> SILVER_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.SILVER_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_SILVER_ORE.getDefaultState())
    );

    public static final List<OreFeatureConfig.Target> DIAMOND_NETHER = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.NETHERRACK, ModBlocks.NETHER_DIAMOND_ORE.getDefaultState())
    );

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> SILVER_ORE = ConfiguredFeatures.register("silver_ore", Feature.ORE, new OreFeatureConfig(SILVER_ORES, 4));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> NETHER_DIAMOND = ConfiguredFeatures.register("nether_diamond", Feature.ORE, new OreFeatureConfig(DIAMOND_NETHER, 1));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> BIG_NETHER_DIAMOND = ConfiguredFeatures.register("big_nether_diamond", Feature.ORE, new OreFeatureConfig(DIAMOND_NETHER, 3));

    public static void registerConfiguredFeatures() {
        System.out.println("[CS] Registering Configured Features for " + Main.MOD_ID);
    }
}

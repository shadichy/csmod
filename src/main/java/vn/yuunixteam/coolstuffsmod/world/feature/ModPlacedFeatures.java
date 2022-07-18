package vn.yuunixteam.coolstuffsmod.world.feature;

import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;

public class ModPlacedFeatures {
    public static final RegistryEntry<PlacedFeature> SILVER_ORE_PLACED = PlacedFeatures.register("silver_ore_placed",
            ModConfiguredFeatures.SILVER_ORE, ModOreFeatures.modifiersWithCount(7,
                    HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-100), YOffset.aboveBottom(100))));

    public static final RegistryEntry<PlacedFeature> NETHER_DIAMOND_ORE_PLACED = PlacedFeatures.register("nether_diamond_ore_placed",
            ModConfiguredFeatures.NETHER_DIAMOND, ModOreFeatures.modifiersWithCount(7,
                    HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-100), YOffset.aboveBottom(60))));

    public static final RegistryEntry<PlacedFeature> BIG_NETHER_DIAMOND_ORE_PLACED = PlacedFeatures.register("big_nether_diamond_ore_placed",
            ModConfiguredFeatures.BIG_NETHER_DIAMOND, ModOreFeatures.modifiersWithCount(7,
                    HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-100), YOffset.aboveBottom(20))));
}

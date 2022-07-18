package vn.yuunixteam.coolstuffsmod.util;

import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.client.color.world.BiomeColors;
import net.minecraft.client.color.world.GrassColors;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.VillagerProfession;
import vn.yuunixteam.coolstuffsmod.block.ModBlocks;
import vn.yuunixteam.coolstuffsmod.item.ModItems;

public class ModRegistries {
    public static void registerModStuffs() {
        registerColormap();
        registerFuels();
        registerFlammable();
        registerCustomTrades();
    }

    private static void registerFuels() {
        FuelRegistry fuelRegistry = FuelRegistry.INSTANCE;

        fuelRegistry.add(ModItems.BAMBOO_BUNDLE, 500);
        fuelRegistry.add(ModItems.BAMBOO_DOOR, 150);
        fuelRegistry.add(ModItems.BAMBOO_TRAPDOOR, 250);
        fuelRegistry.add(ModItems.BAMBOO_FENCE, 250);
        fuelRegistry.add(ModItems.BAMBOO_FENCE_GATE, 250);

        fuelRegistry.add(ModItems.DRIED_BAMBOO_BUNDLE, 600);
        fuelRegistry.add(ModItems.DRIED_BAMBOO, 60);
        fuelRegistry.add(ModItems.DRIED_BAMBOO_DOOR, 200);
        fuelRegistry.add(ModItems.DRIED_BAMBOO_TRAPDOOR, 300);
        fuelRegistry.add(ModItems.DRIED_BAMBOO_FENCE, 300);
        fuelRegistry.add(ModItems.DRIED_BAMBOO_FENCE_GATE, 300);
    }

    private static void registerFlammable() {
        FlammableBlockRegistry flammableBlockRegistry = FlammableBlockRegistry.getDefaultInstance();

        flammableBlockRegistry.add(ModBlocks.BAMBOO_BUNDLE, 15, 5);
        flammableBlockRegistry.add(ModBlocks.BAMBOO_FENCE, 15, 5);
        flammableBlockRegistry.add(ModBlocks.BAMBOO_FENCE_GATE, 15, 5);

        flammableBlockRegistry.add(ModBlocks.DRIED_BAMBOO, 20, 30);
        flammableBlockRegistry.add(ModBlocks.DRIED_BAMBOO_BUNDLE, 20, 5);
        flammableBlockRegistry.add(ModBlocks.DRIED_BAMBOO_FENCE, 20, 5);
        flammableBlockRegistry.add(ModBlocks.DRIED_BAMBOO_FENCE_GATE, 20, 5);
    }

    private static void registerCustomTrades() {
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 1, factories -> factories.add((entity, random) -> new TradeOffer(new ItemStack(Items.EMERALD, 1), new ItemStack(ModItems.RICE_BOWL, 1), 6,2,0.02f)));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.TOOLSMITH, 3, factories -> factories.add((entity, random) -> new TradeOffer(new ItemStack(Items.EMERALD, 6), new ItemStack(ModItems.SILVER_PICKAXE, 1), 12,7,0.08f)));
    }

    private static void registerColormap() {
        ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> world != null && pos != null ? BiomeColors.getGrassColor(world, pos) : GrassColors.getColor(0.5, 1.0), ModBlocks.GRASS_CARPET);
        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> GrassColors.getColor(0.5, 1.0), ModItems.GRASS_CARPET);
    }
}

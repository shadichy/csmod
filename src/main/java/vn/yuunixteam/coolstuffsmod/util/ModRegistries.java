package vn.yuunixteam.coolstuffsmod.util;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import vn.yuunixteam.coolstuffsmod.Main;
import vn.yuunixteam.coolstuffsmod.block.ModBlocks;
import vn.yuunixteam.coolstuffsmod.item.ModItems;

public class ModRegistries {
    public static void registerModStuffs() {
        registerFuels();
        registerFlammable();
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
}

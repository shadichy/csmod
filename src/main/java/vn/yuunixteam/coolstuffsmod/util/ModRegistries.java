package vn.yuunixteam.coolstuffsmod.util;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import vn.yuunixteam.coolstuffsmod.Main;
import vn.yuunixteam.coolstuffsmod.item.ModItems;

public class ModRegistries {
    public static void registerModStuffs() {
        registerFuels();
    }

    private static void registerFuels() {
        Main.LOGGER.info("[CS] Registering fuels for " + Main.MOD_ID);
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
}

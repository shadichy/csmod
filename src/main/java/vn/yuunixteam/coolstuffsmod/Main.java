package vn.yuunixteam.coolstuffsmod;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import vn.yuunixteam.coolstuffsmod.block.ModBlocks;
import vn.yuunixteam.coolstuffsmod.item.ModItems;
import vn.yuunixteam.coolstuffsmod.util.ModRegistries;
import vn.yuunixteam.coolstuffsmod.world.feature.ModConfiguredFeatures;
import vn.yuunixteam.coolstuffsmod.world.gen.ModWorldGen;

public class Main implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final String MOD_ID = "coolstuffsmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		ModConfiguredFeatures.registerConfiguredFeatures();

		ModItems.registerModItem();
		ModBlocks.registerModBlock();

		ModWorldGen.generateModWorldGen();

		ModRegistries.registerModStuffs();
	}
}

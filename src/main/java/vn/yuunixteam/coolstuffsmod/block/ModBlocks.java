package vn.yuunixteam.coolstuffsmod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.PillarBlock;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import vn.yuunixteam.coolstuffsmod.Main;

public class ModBlock {
    public static final Block BAMBOO_BUNDLE = registerBlock("bamboo_bundle",
            new PillarBlock(FabricBlockSettings
                    .of(Material.BAMBOO)
                    .breakInstantly()),
            ItemGroup.BUILDING_BLOCKS);
    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return  Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }
    public static void registerModBlock() {
        Main.LOGGER.info("[CS] Registering blocks for" + Main.MOD_ID);
    }
}

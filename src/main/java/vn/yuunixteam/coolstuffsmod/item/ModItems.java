package vn.yuunixteam.coolstuffsmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.StewItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import vn.yuunixteam.coolstuffsmod.Main;
import vn.yuunixteam.coolstuffsmod.block.ModBlocks;

public class ModItems {

    //
    public static final Item USABLE_ITEM;
    public static final Item RAW_SILVER;
    public static final Item SILVER_INGOT;
    public static final Item SILVER_NUGGET;
    public static final Item RAW_RICE_BOWL;
    public static final Item RICE_BOWL;
    public static final Item BAMBOO_BUNDLE;
    public static final Item BAMBOO_FENCE;
    public static final Item BAMBOO_FENCE_GATE;
    public static final Item BAMBOO_DOOR;
    public static final Item BAMBOO_TRAPDOOR;
    public static final Item SCAFFOLD_BAMBOO_DOOR;
    public static final Item SCAFFOLD_BAMBOO_TRAPDOOR;
    public static final Item DRIED_BAMBOO_BUNDLE;
    public static final Item DRIED_BAMBOO;
    public static final Item DRIED_BAMBOO_FENCE;
    public static final Item DRIED_BAMBOO_FENCE_GATE;
    public static final Item DRIED_BAMBOO_DOOR;
    public static final Item DRIED_BAMBOO_TRAPDOOR;
    public static final Item PUNJI_STICKS;
    public static final Item SILVER_BLOCK;
    public static final Item RAW_SILVER_BLOCK;
    public static final Item SILVER_ORE;
    public static final Item DEEPSLATE_SILVER_ORE;
    public static final Item NETHER_DIAMOND_ORE;

    // ### METHODS ###
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, name), item);
    }
    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }
    public static void registerModItem() {
        Main.LOGGER.info("[CS] Registering items for " + Main.MOD_ID);
    }

    static {
        //  ### ITEMS ###
        USABLE_ITEM = registerItem("usable_item", new Item(new FabricItemSettings()
                .group(ItemGroup.MISC)
                .fireproof()
                .maxCount(16)
                .maxDamage(10)
        ));
        RAW_SILVER = registerItem("raw_silver", new Item(new FabricItemSettings()
                .group(ItemGroup.MATERIALS)
        ));
        SILVER_INGOT = registerItem("silver_ingot", new Item(new FabricItemSettings()
                .group(ItemGroup.MATERIALS)
        ));
        SILVER_NUGGET = registerItem("silver_nugget", new Item(new FabricItemSettings()
                .group(ItemGroup.MATERIALS)
        ));
        RAW_RICE_BOWL = registerItem("raw_rice_bowl", new Item(new FabricItemSettings()
                .maxCount(1)
                .group(ItemGroup.FOOD)
        ));
        RICE_BOWL = registerItem("rice_bowl", new StewItem(new FabricItemSettings()
                .maxCount(1)
                .group(ItemGroup.FOOD)
                .food(ModFoodComponents.RICE)
        ));

        // ### BLOCK ITEMS ###

        // Bamboo
        BAMBOO_BUNDLE = registerBlockItem("bamboo_bundle",ModBlocks.BAMBOO_BUNDLE,ItemGroup.BUILDING_BLOCKS);
        BAMBOO_FENCE = registerBlockItem("bamboo_fence",ModBlocks.BAMBOO_FENCE,ItemGroup.DECORATIONS);
        BAMBOO_FENCE_GATE = registerBlockItem("bamboo_fence_gate",ModBlocks.BAMBOO_FENCE_GATE,ItemGroup.DECORATIONS);
        BAMBOO_DOOR = registerBlockItem("bamboo_door",ModBlocks.BAMBOO_DOOR,ItemGroup.DECORATIONS);
        BAMBOO_TRAPDOOR = registerBlockItem("bamboo_trapdoor",ModBlocks.BAMBOO_TRAPDOOR,ItemGroup.DECORATIONS);
        SCAFFOLD_BAMBOO_DOOR = registerBlockItem("scaffold_bamboo_door)",ModBlocks.SCAFFOLD_BAMBOO_DOOR,ItemGroup.DECORATIONS);
        SCAFFOLD_BAMBOO_TRAPDOOR = registerBlockItem("scaffold_bamboo_trapdoor",ModBlocks.SCAFFOLD_BAMBOO_TRAPDOOR,ItemGroup.DECORATIONS);

        // Dried bamboo
        DRIED_BAMBOO_BUNDLE = registerBlockItem("dried_bamboo_bundle",ModBlocks.DRIED_BAMBOO_BUNDLE,ItemGroup.BUILDING_BLOCKS);
        DRIED_BAMBOO = registerBlockItem("dried_bamboo",ModBlocks.DRIED_BAMBOO,ItemGroup.DECORATIONS);
        DRIED_BAMBOO_FENCE = registerBlockItem("dried_bamboo_fence",ModBlocks.DRIED_BAMBOO_FENCE,ItemGroup.DECORATIONS);
        DRIED_BAMBOO_FENCE_GATE = registerBlockItem("dried_bamboo_fence_gate",ModBlocks.DRIED_BAMBOO_FENCE_GATE,ItemGroup.DECORATIONS);
        DRIED_BAMBOO_DOOR = registerBlockItem("dried_bamboo_door",ModBlocks.DRIED_BAMBOO_DOOR,ItemGroup.DECORATIONS);
        DRIED_BAMBOO_TRAPDOOR = registerBlockItem("dried_bamboo_trapdoor",ModBlocks.DRIED_BAMBOO_TRAPDOOR,ItemGroup.DECORATIONS);
        PUNJI_STICKS = registerBlockItem("punji_sticks",ModBlocks.PUNJI_STICKS,ItemGroup.DECORATIONS);

        // Metals
        SILVER_BLOCK = registerBlockItem("silver_block",ModBlocks.SILVER_BLOCK,ItemGroup.BUILDING_BLOCKS);
        RAW_SILVER_BLOCK = registerBlockItem("raw_silver_block",ModBlocks.RAW_SILVER_BLOCK,ItemGroup.BUILDING_BLOCKS);
        SILVER_ORE = registerBlockItem("silver_ore",ModBlocks.SILVER_ORE,ItemGroup.BUILDING_BLOCKS);
        DEEPSLATE_SILVER_ORE = registerBlockItem("deepslate_silver_ore",ModBlocks.DEEPSLATE_SILVER_ORE,ItemGroup.BUILDING_BLOCKS);
        NETHER_DIAMOND_ORE = registerBlockItem("nether_diamond_ore",ModBlocks.NETHER_DIAMOND_ORE,ItemGroup.BUILDING_BLOCKS);

    }
}

package vn.yuunixteam.coolstuffsmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.*;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import vn.yuunixteam.coolstuffsmod.Main;
import vn.yuunixteam.coolstuffsmod.block.ModBlocks;

public class ModItems {

    // ### Declaration
    public static final Item USABLE_ITEM;

    // Silver
    public static final Item RAW_SILVER;
    public static final Item SILVER_INGOT;
    public static final Item SILVER_NUGGET;
    public static final Item SILVER_BLOCK;
    public static final Item RAW_SILVER_BLOCK;
    public static final Item SILVER_ORE;
    public static final Item DEEPSLATE_SILVER_ORE;
    public static final Item SILVER_SWORD;
    public static final Item SILVER_AXE;
    public static final Item SILVER_SHOVEL;
    public static final Item SILVER_HOE;
    public static final Item SILVER_PICKAXE;

    // Rice
    public static final Item RAW_RICE_BOWL;
    public static final Item RICE_BOWL;

    // Bamboo
    public static final Item BAMBOO_BUNDLE;
    public static final Item BAMBOO_FENCE;
    public static final Item BAMBOO_FENCE_GATE;
    public static final Item BAMBOO_DOOR;
    public static final Item BAMBOO_TRAPDOOR;
    public static final Item SCAFFOLD_BAMBOO_DOOR;
    public static final Item SCAFFOLD_BAMBOO_TRAPDOOR;

    // Dried bamboo
    public static final Item DRIED_BAMBOO_BUNDLE;
    public static final Item DRIED_BAMBOO;
    public static final Item DRIED_BAMBOO_FENCE;
    public static final Item DRIED_BAMBOO_FENCE_GATE;
    public static final Item DRIED_BAMBOO_DOOR;
    public static final Item DRIED_BAMBOO_TRAPDOOR;
    public static final Item PUNJI_STICKS;

    // Nether ore
    public static final Item NETHER_DIAMOND_ORE;

    // Steel
    public static final Item PIG_IRON;
    public static final Item STEEL_BLOCK;
    public static final Item STEEL_INGOT;
    public static final Item STEEL_SWORD;
    public static final Item STEEL_AXE;
    public static final Item STEEL_SHOVEL;
    public static final Item STEEL_HOE;
    public static final Item STEEL_PICKAXE;

    // Bows
    public static final Item IRON_BOW;
    public static final Item STEEL_BOW;
    public static final Item GOLD_BOW;
    public static final Item SILVER_BOW;
    public static final Item DIAMOND_BOW;
    public static final Item NETHERITE_BOW;

    // Spears
    public static final Item WOODEN_SPEAR;
    public static final Item STONE_SPEAR;
    public static final Item IRON_SPEAR;
    public static final Item STEEL_SPEAR;
    public static final Item GOLD_SPEAR;
    public static final Item SILVER_SPEAR;
    public static final Item DIAMOND_SPEAR;
    public static final Item NETHERITE_SPEAR;

    // Reinforced
    public static final Item REINFORCED_IRON_SWORD;
    public static final Item REINFORCED_IRON_AXE;
    public static final Item REINFORCED_IRON_SHOVEL;
    public static final Item REINFORCED_IRON_HOE;
    public static final Item REINFORCED_IRON_PICKAXE;
    public static final Item REINFORCED_IRON_SPEAR;
    public static final Item REINFORCED_STEEL_SWORD;
    public static final Item REINFORCED_STEEL_AXE;
    public static final Item REINFORCED_STEEL_SHOVEL;
    public static final Item REINFORCED_STEEL_HOE;
    public static final Item REINFORCED_STEEL_PICKAXE;
    public static final Item REINFORCED_STEEL_SPEAR;
    public static final Item REINFORCED_GOLD_SWORD;
    public static final Item REINFORCED_GOLD_AXE;
    public static final Item REINFORCED_GOLD_SHOVEL;
    public static final Item REINFORCED_GOLD_HOE;
    public static final Item REINFORCED_GOLD_PICKAXE;
    public static final Item REINFORCED_GOLD_SPEAR;
    public static final Item REINFORCED_SILVER_SWORD;
    public static final Item REINFORCED_SILVER_AXE;
    public static final Item REINFORCED_SILVER_SHOVEL;
    public static final Item REINFORCED_SILVER_HOE;
    public static final Item REINFORCED_SILVER_PICKAXE;
    public static final Item REINFORCED_SILVER_SPEAR;
    public static final Item REINFORCED_DIAMOND_SWORD;
    public static final Item REINFORCED_DIAMOND_AXE;
    public static final Item REINFORCED_DIAMOND_SHOVEL;
    public static final Item REINFORCED_DIAMOND_HOE;
    public static final Item REINFORCED_DIAMOND_PICKAXE;
    public static final Item REINFORCED_DIAMOND_SPEAR;
    public static final Item REINFORCED_NETHERITE_SWORD;
    public static final Item REINFORCED_NETHERITE_AXE;
    public static final Item REINFORCED_NETHERITE_SHOVEL;
    public static final Item REINFORCED_NETHERITE_HOE;
    public static final Item REINFORCED_NETHERITE_PICKAXE;
    public static final Item REINFORCED_NETHERITE_SPEAR;




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

        // Silver
        RAW_SILVER = registerItem("raw_silver", new Item(new FabricItemSettings()
                .group(ItemGroup.MATERIALS)
        ));
        SILVER_INGOT = registerItem("silver_ingot", new Item(new FabricItemSettings()
                .group(ItemGroup.MATERIALS)
        ));
        SILVER_NUGGET = registerItem("silver_nugget", new Item(new FabricItemSettings()
                .group(ItemGroup.MATERIALS)
        ));
        SILVER_SWORD = registerItem("silver_sword", new SwordItem(ModToolMaterials.SILVER, 3, -2.4F, new FabricItemSettings().group(ItemGroup.COMBAT)));
        SILVER_AXE = registerItem("silver_axe", new ModAxeItem(ModToolMaterials.SILVER, 5.0F, -3.0F, new FabricItemSettings().group(ItemGroup.TOOLS)));
        SILVER_SHOVEL = registerItem("silver_shovel", new ModShovelItem(ModToolMaterials.SILVER, 1.5F, -3.0F, new FabricItemSettings().group(ItemGroup.TOOLS)));
        SILVER_HOE = registerItem("silver_hoe", new ModHoeItem(ModToolMaterials.SILVER, -3, 0.0F, new FabricItemSettings().group(ItemGroup.TOOLS)));
        SILVER_PICKAXE = registerItem("silver_pickaxe", new ModPickaxeItem(ModToolMaterials.SILVER, 1, -2.8F, new FabricItemSettings().group(ItemGroup.TOOLS)));

        // Rice
        RAW_RICE_BOWL = registerItem("raw_rice_bowl", new Item(new FabricItemSettings()
                .maxCount(1)
                .group(ItemGroup.MATERIALS)
        ));
        RICE_BOWL = registerItem("rice_bowl", new StewItem(new FabricItemSettings()
                .maxCount(1)
                .group(ItemGroup.FOOD)
                .food(ModFoodComponents.RICE)
        ));

        // Steel
        STEEL_INGOT = registerItem("steel_ingot", new Item(new FabricItemSettings()
                .group(ItemGroup.MATERIALS)
        ));
        STEEL_SWORD = registerItem("steel_sword", new SwordItem(ModToolMaterials.STEEL, 3, -2.4F, new FabricItemSettings().group(ItemGroup.COMBAT)));
        STEEL_AXE = registerItem("steel_axe", new ModAxeItem(ModToolMaterials.STEEL, 6.0F, -3.0F, new FabricItemSettings().group(ItemGroup.TOOLS)));
        STEEL_SHOVEL = registerItem("steel_shovel", new ModShovelItem(ModToolMaterials.STEEL, 1.5F, -3.0F, new FabricItemSettings().group(ItemGroup.TOOLS)));
        STEEL_HOE = registerItem("steel_hoe", new ModHoeItem(ModToolMaterials.STEEL, -2, -1.0F, new FabricItemSettings().group(ItemGroup.TOOLS)));
        STEEL_PICKAXE = registerItem("steel_pickaxe", new ModPickaxeItem(ModToolMaterials.STEEL, 1, -2.8F, new FabricItemSettings().group(ItemGroup.TOOLS)));

        // Bows
        IRON_BOW = registerItem("iron_bow", new BowItem(new FabricItemSettings().maxDamage(512).group(ItemGroup.COMBAT)));
        STEEL_BOW = registerItem("steel_bow", new BowItem(new FabricItemSettings().maxDamage(640).group(ItemGroup.COMBAT)));
        GOLD_BOW = registerItem("gold_bow", new BowItem(new FabricItemSettings().maxDamage(256).group(ItemGroup.COMBAT)));
        SILVER_BOW = registerItem("silver_bow", new BowItem(new FabricItemSettings().maxDamage(1024).group(ItemGroup.COMBAT)));
        DIAMOND_BOW = registerItem("diamond_bow", new BowItem(new FabricItemSettings().maxDamage(1664).group(ItemGroup.COMBAT)));
        NETHERITE_BOW = registerItem("netherite_bow", new BowItem(new FabricItemSettings().maxDamage(2112).group(ItemGroup.COMBAT)));

        // Spears
        WOODEN_SPEAR = registerItem("wooden_spear", new SpearItem(ToolMaterials.WOOD, 2, -2.4F, new FabricItemSettings().group(ItemGroup.COMBAT)));
        STONE_SPEAR = registerItem("stone_spear", new SpearItem(ToolMaterials.STONE, 2, -2.4F, new FabricItemSettings().group(ItemGroup.COMBAT)));
        IRON_SPEAR = registerItem("iron_spear", new SpearItem(ToolMaterials.IRON, 2, -2.4F, new FabricItemSettings().group(ItemGroup.COMBAT)));
        STEEL_SPEAR = registerItem("steel_spear", new SpearItem(ModToolMaterials.STEEL, 2, -2.4F, new FabricItemSettings().group(ItemGroup.COMBAT)));
        GOLD_SPEAR = registerItem("gold_spear", new SpearItem(ToolMaterials.GOLD, 2, -2.4F, new FabricItemSettings().group(ItemGroup.COMBAT)));
        SILVER_SPEAR = registerItem("silver_spear", new SpearItem(ModToolMaterials.SILVER, 2, -2.4F, new FabricItemSettings().group(ItemGroup.COMBAT)));
        DIAMOND_SPEAR = registerItem("diamond_spear", new SpearItem(ToolMaterials.DIAMOND, 2, -2.4F, new FabricItemSettings().group(ItemGroup.COMBAT)));
        NETHERITE_SPEAR = registerItem("netherite_spear", new SpearItem(ToolMaterials.NETHERITE, 2, -2.4F, new FabricItemSettings().group(ItemGroup.COMBAT).fireproof()));

        // Reinforced
        REINFORCED_IRON_SWORD = registerItem("reinforced_iron_sword", new SwordItem(ModToolMaterials.REINFORCED_IRON, 3, -2.4F, new FabricItemSettings().group(ItemGroup.COMBAT)));
        REINFORCED_IRON_AXE = registerItem("reinforced_iron_axe", new ModAxeItem(ModToolMaterials.REINFORCED_IRON, 6.0F, -3.0F, new FabricItemSettings().group(ItemGroup.TOOLS)));
        REINFORCED_IRON_SHOVEL = registerItem("reinforced_iron_shovel", new ModShovelItem(ModToolMaterials.REINFORCED_IRON, 1.5F, -3.0F, new FabricItemSettings().group(ItemGroup.TOOLS)));
        REINFORCED_IRON_HOE = registerItem("reinforced_iron_hoe", new ModHoeItem(ModToolMaterials.REINFORCED_IRON, -2, -1.0F, new FabricItemSettings().group(ItemGroup.TOOLS)));
        REINFORCED_IRON_PICKAXE = registerItem("reinforced_iron_pickaxe", new ModPickaxeItem(ModToolMaterials.REINFORCED_IRON, 1, -2.8F, new FabricItemSettings().group(ItemGroup.TOOLS)));
        REINFORCED_IRON_SPEAR = registerItem("reinforced_iron_spear", new SpearItem(ModToolMaterials.REINFORCED_IRON, 2, -2.4F, new FabricItemSettings().group(ItemGroup.COMBAT)));
        REINFORCED_STEEL_SWORD = registerItem("reinforced_steel_sword", new SwordItem(ModToolMaterials.REINFORCED_STEEL, 3, -2.4F, new FabricItemSettings().group(ItemGroup.COMBAT)));
        REINFORCED_STEEL_AXE = registerItem("reinforced_steel_axe", new ModAxeItem(ModToolMaterials.REINFORCED_STEEL, 6.0F, -3.0F, new FabricItemSettings().group(ItemGroup.TOOLS)));
        REINFORCED_STEEL_SHOVEL = registerItem("reinforced_steel_shovel", new ModShovelItem(ModToolMaterials.REINFORCED_STEEL, 1.5F, -3.0F, new FabricItemSettings().group(ItemGroup.TOOLS)));
        REINFORCED_STEEL_HOE = registerItem("reinforced_steel_hoe", new ModHoeItem(ModToolMaterials.REINFORCED_STEEL, -2, -1.0F, new FabricItemSettings().group(ItemGroup.TOOLS)));
        REINFORCED_STEEL_PICKAXE = registerItem("reinforced_steel_pickaxe", new ModPickaxeItem(ModToolMaterials.REINFORCED_STEEL, 1, -2.8F, new FabricItemSettings().group(ItemGroup.TOOLS)));
        REINFORCED_STEEL_SPEAR = registerItem("reinforced_steel_spear", new SpearItem(ModToolMaterials.REINFORCED_STEEL, 2, -2.4F, new FabricItemSettings().group(ItemGroup.COMBAT)));
        REINFORCED_GOLD_SWORD = registerItem("reinforced_gold_sword", new SwordItem(ModToolMaterials.REINFORCED_GOLD, 3, -2.4F, new FabricItemSettings().group(ItemGroup.COMBAT)));
        REINFORCED_GOLD_AXE = registerItem("reinforced_gold_axe", new ModAxeItem(ModToolMaterials.REINFORCED_GOLD, 6.0F, -3.0F, new FabricItemSettings().group(ItemGroup.TOOLS)));
        REINFORCED_GOLD_SHOVEL = registerItem("reinforced_gold_shovel", new ModShovelItem(ModToolMaterials.REINFORCED_GOLD, 1.5F, -3.0F, new FabricItemSettings().group(ItemGroup.TOOLS)));
        REINFORCED_GOLD_HOE = registerItem("reinforced_gold_hoe", new ModHoeItem(ModToolMaterials.REINFORCED_GOLD, 0, -3.0F, new FabricItemSettings().group(ItemGroup.TOOLS)));
        REINFORCED_GOLD_PICKAXE = registerItem("reinforced_gold_pickaxe", new ModPickaxeItem(ModToolMaterials.REINFORCED_GOLD, 1, -2.8F, new FabricItemSettings().group(ItemGroup.TOOLS)));
        REINFORCED_GOLD_SPEAR = registerItem("reinforced_gold_spear", new SpearItem(ModToolMaterials.REINFORCED_GOLD, 2, -2.4F, new FabricItemSettings().group(ItemGroup.COMBAT)));
        REINFORCED_SILVER_SWORD = registerItem("reinforced_silver_sword", new SwordItem(ModToolMaterials.REINFORCED_SILVER, 3, -2.4F, new FabricItemSettings().group(ItemGroup.COMBAT)));
        REINFORCED_SILVER_AXE = registerItem("reinforced_silver_axe", new ModAxeItem(ModToolMaterials.REINFORCED_SILVER, 5.0F, -3.0F, new FabricItemSettings().group(ItemGroup.TOOLS)));
        REINFORCED_SILVER_SHOVEL = registerItem("reinforced_silver_shovel", new ModShovelItem(ModToolMaterials.REINFORCED_SILVER, 1.5F, -3.0F, new FabricItemSettings().group(ItemGroup.TOOLS)));
        REINFORCED_SILVER_HOE = registerItem("reinforced_silver_hoe", new ModHoeItem(ModToolMaterials.REINFORCED_SILVER, -3, 0.0F, new FabricItemSettings().group(ItemGroup.TOOLS)));
        REINFORCED_SILVER_PICKAXE = registerItem("reinforced_silver_pickaxe", new ModPickaxeItem(ModToolMaterials.REINFORCED_SILVER, 1, -2.8F, new FabricItemSettings().group(ItemGroup.TOOLS)));
        REINFORCED_SILVER_SPEAR = registerItem("reinforced_silver_spear", new SpearItem(ModToolMaterials.REINFORCED_SILVER, 2, -2.4F, new FabricItemSettings().group(ItemGroup.COMBAT)));
        REINFORCED_DIAMOND_SWORD = registerItem("reinforced_diamond_sword", new SwordItem(ModToolMaterials.REINFORCED_DIAMOND, 3, -2.4F, new FabricItemSettings().group(ItemGroup.COMBAT)));
        REINFORCED_DIAMOND_AXE = registerItem("reinforced_diamond_axe", new ModAxeItem(ModToolMaterials.REINFORCED_DIAMOND, 5.0F, -3.0F, new FabricItemSettings().group(ItemGroup.TOOLS)));
        REINFORCED_DIAMOND_SHOVEL = registerItem("reinforced_diamond_shovel", new ModShovelItem(ModToolMaterials.REINFORCED_DIAMOND, 1.5F, -3.0F, new FabricItemSettings().group(ItemGroup.TOOLS)));
        REINFORCED_DIAMOND_HOE = registerItem("reinforced_diamond_hoe", new ModHoeItem(ModToolMaterials.REINFORCED_DIAMOND, -3, 0.0F, new FabricItemSettings().group(ItemGroup.TOOLS)));
        REINFORCED_DIAMOND_PICKAXE = registerItem("reinforced_diamond_pickaxe", new ModPickaxeItem(ModToolMaterials.REINFORCED_DIAMOND, 1, -2.8F, new FabricItemSettings().group(ItemGroup.TOOLS)));
        REINFORCED_DIAMOND_SPEAR = registerItem("reinforced_diamond_spear", new SpearItem(ModToolMaterials.REINFORCED_DIAMOND, 2, -2.4F, new FabricItemSettings().group(ItemGroup.COMBAT)));
        REINFORCED_NETHERITE_SWORD = registerItem("reinforced_netherite_sword", new SwordItem(ModToolMaterials.REINFORCED_NETHERITE, 3, -2.4F, new FabricItemSettings().group(ItemGroup.COMBAT).fireproof()));
        REINFORCED_NETHERITE_AXE = registerItem("reinforced_netherite_axe", new ModAxeItem(ModToolMaterials.REINFORCED_NETHERITE, 5.0F, -3.0F, new FabricItemSettings().group(ItemGroup.TOOLS).fireproof()));
        REINFORCED_NETHERITE_SHOVEL = registerItem("reinforced_netherite_shovel", new ModShovelItem(ModToolMaterials.REINFORCED_NETHERITE, 1.5F, -3.0F, new FabricItemSettings().group(ItemGroup.TOOLS).fireproof()));
        REINFORCED_NETHERITE_HOE = registerItem("reinforced_netherite_hoe", new ModHoeItem(ModToolMaterials.REINFORCED_NETHERITE, -4, 0.0F, new FabricItemSettings().group(ItemGroup.TOOLS).fireproof()));
        REINFORCED_NETHERITE_PICKAXE = registerItem("reinforced_netherite_pickaxe", new ModPickaxeItem(ModToolMaterials.REINFORCED_NETHERITE, 1, -2.8F, new FabricItemSettings().group(ItemGroup.TOOLS).fireproof()));
        REINFORCED_NETHERITE_SPEAR = registerItem("reinforced_netherite_spear", new SpearItem(ModToolMaterials.REINFORCED_NETHERITE, 2, -2.4F, new FabricItemSettings().group(ItemGroup.COMBAT).fireproof()));



        // ### BLOCK ITEMS ###

        // Bamboo
        BAMBOO_BUNDLE = registerBlockItem("bamboo_bundle",ModBlocks.BAMBOO_BUNDLE,ItemGroup.BUILDING_BLOCKS);
        BAMBOO_FENCE = registerBlockItem("bamboo_fence",ModBlocks.BAMBOO_FENCE,ItemGroup.DECORATIONS);
        BAMBOO_FENCE_GATE = registerBlockItem("bamboo_fence_gate",ModBlocks.BAMBOO_FENCE_GATE,ItemGroup.DECORATIONS);
        BAMBOO_DOOR = registerBlockItem("bamboo_door",ModBlocks.BAMBOO_DOOR,ItemGroup.REDSTONE);
        BAMBOO_TRAPDOOR = registerBlockItem("bamboo_trapdoor",ModBlocks.BAMBOO_TRAPDOOR,ItemGroup.REDSTONE);
        SCAFFOLD_BAMBOO_DOOR = registerBlockItem("scaffold_bamboo_door",ModBlocks.SCAFFOLD_BAMBOO_DOOR,ItemGroup.REDSTONE);
        SCAFFOLD_BAMBOO_TRAPDOOR = registerBlockItem("scaffold_bamboo_trapdoor",ModBlocks.SCAFFOLD_BAMBOO_TRAPDOOR,ItemGroup.REDSTONE);

        // Dried bamboo
        DRIED_BAMBOO_BUNDLE = registerBlockItem("dried_bamboo_bundle",ModBlocks.DRIED_BAMBOO_BUNDLE,ItemGroup.BUILDING_BLOCKS);
        DRIED_BAMBOO = registerBlockItem("dried_bamboo",ModBlocks.DRIED_BAMBOO,ItemGroup.DECORATIONS);
        DRIED_BAMBOO_FENCE = registerBlockItem("dried_bamboo_fence",ModBlocks.DRIED_BAMBOO_FENCE,ItemGroup.DECORATIONS);
        DRIED_BAMBOO_FENCE_GATE = registerBlockItem("dried_bamboo_fence_gate",ModBlocks.DRIED_BAMBOO_FENCE_GATE,ItemGroup.DECORATIONS);
        DRIED_BAMBOO_DOOR = registerBlockItem("dried_bamboo_door",ModBlocks.DRIED_BAMBOO_DOOR,ItemGroup.REDSTONE);
        DRIED_BAMBOO_TRAPDOOR = registerBlockItem("dried_bamboo_trapdoor",ModBlocks.DRIED_BAMBOO_TRAPDOOR,ItemGroup.REDSTONE);
        PUNJI_STICKS = registerBlockItem("punji_sticks",ModBlocks.PUNJI_STICKS,ItemGroup.DECORATIONS);

        // Metals
        SILVER_BLOCK = registerBlockItem("silver_block",ModBlocks.SILVER_BLOCK,ItemGroup.BUILDING_BLOCKS);
        RAW_SILVER_BLOCK = registerBlockItem("raw_silver_block",ModBlocks.RAW_SILVER_BLOCK,ItemGroup.BUILDING_BLOCKS);
        SILVER_ORE = registerBlockItem("silver_ore",ModBlocks.SILVER_ORE,ItemGroup.BUILDING_BLOCKS);
        DEEPSLATE_SILVER_ORE = registerBlockItem("deepslate_silver_ore",ModBlocks.DEEPSLATE_SILVER_ORE,ItemGroup.BUILDING_BLOCKS);
        NETHER_DIAMOND_ORE = registerBlockItem("nether_diamond_ore",ModBlocks.NETHER_DIAMOND_ORE,ItemGroup.BUILDING_BLOCKS);
        STEEL_BLOCK = registerBlockItem("steel_block",ModBlocks.STEEL_BLOCK,ItemGroup.BUILDING_BLOCKS);
        PIG_IRON = registerBlockItem("pig_iron",ModBlocks.PIG_IRON,ItemGroup.BUILDING_BLOCKS);

    }
}

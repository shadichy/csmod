package vn.yuunixteam.coolstuffsmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.*;
import net.minecraft.entity.EquipmentSlot;
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
    public static final Item SILVER_HELMET;
    public static final Item SILVER_CHESTPLATE;
    public static final Item SILVER_LEGGINGS;
    public static final Item SILVER_BOOTS;

    // Food
    public static final Item RAW_RICE_BOWL;
    public static final Item RICE_BOWL;
    public static final Item ONIGIRI;
    public static final Item SCORCHED_RICE;
    public static final Item CHOCOLATE;
    public static final Item CHOCOLATE_MILK;
    public static final Item CHOCOLATE_CAKE;

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
    public static final Item STEEL_NUGGET;
    public static final Item STEEL_SWORD;
    public static final Item STEEL_AXE;
    public static final Item STEEL_SHOVEL;
    public static final Item STEEL_HOE;
    public static final Item STEEL_PICKAXE;
    public static final Item STEEL_HELMET;
    public static final Item STEEL_CHESTPLATE;
    public static final Item STEEL_LEGGINGS;
    public static final Item STEEL_BOOTS;

    // Bows
    public static final Item IRON_BOW;
    public static final Item STEEL_BOW;
    public static final Item GOLDEN_BOW;
    public static final Item SILVER_BOW;
    public static final Item DIAMOND_BOW;
    public static final Item NETHERITE_BOW;

    // Spears
    public static final Item WOODEN_SPEAR;
    public static final Item STONE_SPEAR;
    public static final Item IRON_SPEAR;
    public static final Item STEEL_SPEAR;
    public static final Item GOLDEN_SPEAR;
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
    public static final Item REINFORCED_GOLDEN_SWORD;
    public static final Item REINFORCED_GOLDEN_AXE;
    public static final Item REINFORCED_GOLDEN_SHOVEL;
    public static final Item REINFORCED_GOLDEN_HOE;
    public static final Item REINFORCED_GOLDEN_PICKAXE;
    public static final Item REINFORCED_GOLDEN_SPEAR;
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
    public static final Item REINFORCED_IRON_KNIFE;
    public static final Item REINFORCED_STEEL_KNIFE;
    public static final Item REINFORCED_GOLDEN_KNIFE;
    public static final Item REINFORCED_SILVER_KNIFE;
    public static final Item REINFORCED_DIAMOND_KNIFE;
    public static final Item REINFORCED_NETHERITE_KNIFE;

    // Knives
    public static final Item WOODEN_KNIFE;
    public static final Item STONE_KNIFE;
    public static final Item IRON_KNIFE;
    public static final Item STEEL_KNIFE;
    public static final Item GOLDEN_KNIFE;
    public static final Item SILVER_KNIFE;
    public static final Item DIAMOND_KNIFE;
    public static final Item NETHERITE_KNIFE;

    // Shieldblades
    public static final Item IRON_SHIELDBLADE;
    public static final Item STEEL_SHIELDBLADE;
    public static final Item GOLDEN_SHIELDBLADE;
    public static final Item SILVER_SHIELDBLADE;
    public static final Item DIAMOND_SHIELDBLADE;
    public static final Item NETHERITE_SHIELDBLADE;

    // ### METHODS ###
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, name), item);
    }
    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }
    private static Item registerBlockItemWithSettings(String name, Block block, Item.Settings settings) {
        return Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, name),
                new BlockItem(block, settings));
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
        SILVER_HELMET = registerItem("silver_helmet", new ArmorItem(ModArmorMaterials.SILVER, EquipmentSlot.HEAD, (new Item.Settings()).group(ItemGroup.COMBAT)));
        SILVER_CHESTPLATE = registerItem("silver_chestplate", new ArmorItem(ModArmorMaterials.SILVER, EquipmentSlot.CHEST, (new Item.Settings()).group(ItemGroup.COMBAT)));
        SILVER_LEGGINGS = registerItem("silver_leggings", new ArmorItem(ModArmorMaterials.SILVER, EquipmentSlot.LEGS, (new Item.Settings()).group(ItemGroup.COMBAT)));
        SILVER_BOOTS = registerItem("silver_boots", new ArmorItem(ModArmorMaterials.SILVER, EquipmentSlot.FEET, (new Item.Settings()).group(ItemGroup.COMBAT)));

        // Food
        RAW_RICE_BOWL = registerItem("raw_rice_bowl", new Item(new FabricItemSettings()
                .maxCount(1)
                .group(ItemGroup.MATERIALS)
        ));
        RICE_BOWL = registerItem("rice_bowl", new StewItem(new FabricItemSettings()
                .recipeRemainder(Items.BOWL)
                .maxCount(1)
                .group(ItemGroup.FOOD)
                .food(ModFoodComponents.RICE)
        ));
        ONIGIRI = registerItem("onigiri", new Item(new FabricItemSettings()
                .maxCount(1)
                .group(ItemGroup.FOOD)
                .food(ModFoodComponents.ONIGIRI)
        ));
        SCORCHED_RICE = registerItem("scorched_rice", new Item(new FabricItemSettings()
                .maxCount(16)
                .group(ItemGroup.FOOD)
                .food(ModFoodComponents.SCORCHED_RICE)
        ));
        CHOCOLATE = registerItem("chocolate", new Item(new FabricItemSettings()
                .maxCount(16)
                .group(ItemGroup.FOOD)
                .food(ModFoodComponents.CHOCOLATE)
        ));
        CHOCOLATE_MILK = registerItem("chocolate_milk", new MilkBottleItem(new FabricItemSettings()
                .maxCount(1)
                .group(ItemGroup.FOOD)
                .food(ModFoodComponents.CHOCOLATE_MILK)
        ));
        CHOCOLATE_CAKE = registerBlockItemWithSettings("chocolate_cake", ModBlocks.CHOCOLATE_CAKE, new FabricItemSettings()
                .maxCount(1)
                .group(ItemGroup.FOOD)
        );

        // Steel
        STEEL_INGOT = registerItem("steel_ingot", new Item(new FabricItemSettings()
                .group(ItemGroup.MATERIALS)
        ));
        STEEL_NUGGET = registerItem("steel_nugget", new Item(new FabricItemSettings()
                .group(ItemGroup.MATERIALS)
        ));
        STEEL_SWORD = registerItem("steel_sword", new SwordItem(ModToolMaterials.STEEL, 3, -2.4F, new FabricItemSettings().group(ItemGroup.COMBAT)));
        STEEL_AXE = registerItem("steel_axe", new ModAxeItem(ModToolMaterials.STEEL, 6.0F, -3.0F, new FabricItemSettings().group(ItemGroup.TOOLS)));
        STEEL_SHOVEL = registerItem("steel_shovel", new ModShovelItem(ModToolMaterials.STEEL, 1.5F, -3.0F, new FabricItemSettings().group(ItemGroup.TOOLS)));
        STEEL_HOE = registerItem("steel_hoe", new ModHoeItem(ModToolMaterials.STEEL, -2, -1.0F, new FabricItemSettings().group(ItemGroup.TOOLS)));
        STEEL_PICKAXE = registerItem("steel_pickaxe", new ModPickaxeItem(ModToolMaterials.STEEL, 1, -2.8F, new FabricItemSettings().group(ItemGroup.TOOLS)));
        STEEL_HELMET = registerItem("steel_helmet", new ArmorItem(ModArmorMaterials.STEEL, EquipmentSlot.HEAD, (new Item.Settings()).group(ItemGroup.COMBAT)));
        STEEL_CHESTPLATE = registerItem("steel_chestplate", new ArmorItem(ModArmorMaterials.STEEL, EquipmentSlot.CHEST, (new Item.Settings()).group(ItemGroup.COMBAT)));
        STEEL_LEGGINGS = registerItem("steel_leggings", new ArmorItem(ModArmorMaterials.STEEL, EquipmentSlot.LEGS, (new Item.Settings()).group(ItemGroup.COMBAT)));
        STEEL_BOOTS = registerItem("steel_boots", new ArmorItem(ModArmorMaterials.STEEL, EquipmentSlot.FEET, (new Item.Settings()).group(ItemGroup.COMBAT)));

        // Bows
        IRON_BOW = registerItem("iron_bow", new BowItem(new FabricItemSettings().maxDamage(512).group(ItemGroup.COMBAT)));
        STEEL_BOW = registerItem("steel_bow", new BowItem(new FabricItemSettings().maxDamage(640).group(ItemGroup.COMBAT)));
        GOLDEN_BOW = registerItem("golden_bow", new BowItem(new FabricItemSettings().maxDamage(208).group(ItemGroup.COMBAT)));
        SILVER_BOW = registerItem("silver_bow", new BowItem(new FabricItemSettings().maxDamage(1024).group(ItemGroup.COMBAT)));
        DIAMOND_BOW = registerItem("diamond_bow", new BowItem(new FabricItemSettings().maxDamage(1664).group(ItemGroup.COMBAT)));
        NETHERITE_BOW = registerItem("netherite_bow", new BowItem(new FabricItemSettings().maxDamage(2112).group(ItemGroup.COMBAT)));

        // Spears
        WOODEN_SPEAR = registerItem("wooden_spear", new SpearItem(ToolMaterials.WOOD, 2, -3.0F, new FabricItemSettings().group(ItemGroup.COMBAT)));
        STONE_SPEAR = registerItem("stone_spear", new SpearItem(ToolMaterials.STONE, 2, -3.0F, new FabricItemSettings().group(ItemGroup.COMBAT)));
        IRON_SPEAR = registerItem("iron_spear", new SpearItem(ToolMaterials.IRON, 2, -3.0F, new FabricItemSettings().group(ItemGroup.COMBAT)));
        STEEL_SPEAR = registerItem("steel_spear", new SpearItem(ModToolMaterials.STEEL, 2, -3.0F, new FabricItemSettings().group(ItemGroup.COMBAT)));
        GOLDEN_SPEAR = registerItem("golden_spear", new SpearItem(ToolMaterials.GOLD, 2, -3.0F, new FabricItemSettings().group(ItemGroup.COMBAT)));
        SILVER_SPEAR = registerItem("silver_spear", new SpearItem(ModToolMaterials.SILVER, 2, -3.0F, new FabricItemSettings().group(ItemGroup.COMBAT)));
        DIAMOND_SPEAR = registerItem("diamond_spear", new SpearItem(ToolMaterials.DIAMOND, 2, -3.0F, new FabricItemSettings().group(ItemGroup.COMBAT)));
        NETHERITE_SPEAR = registerItem("netherite_spear", new SpearItem(ToolMaterials.NETHERITE, 2, -3.0F, new FabricItemSettings().group(ItemGroup.COMBAT).fireproof()));

        // Knives
        WOODEN_KNIFE = registerItem("wooden_knife", new SwordItem(ToolMaterials.WOOD, 0, 1.5F, new FabricItemSettings().group(ItemGroup.COMBAT)));
        STONE_KNIFE = registerItem("stone_knife", new SwordItem(ToolMaterials.STONE, 0, 1.5F, new FabricItemSettings().group(ItemGroup.COMBAT)));
        IRON_KNIFE = registerItem("iron_knife", new SwordItem(ToolMaterials.IRON, 0, 1.5F, new FabricItemSettings().group(ItemGroup.COMBAT)));
        STEEL_KNIFE = registerItem("steel_knife", new SwordItem(ModToolMaterials.STEEL, 0, 1.5F, new FabricItemSettings().group(ItemGroup.COMBAT)));
        GOLDEN_KNIFE = registerItem("golden_knife", new SwordItem(ToolMaterials.GOLD, 0, 1.5F, new FabricItemSettings().group(ItemGroup.COMBAT)));
        SILVER_KNIFE = registerItem("silver_knife", new SwordItem(ModToolMaterials.SILVER, 0, 1.5F, new FabricItemSettings().group(ItemGroup.COMBAT)));
        DIAMOND_KNIFE = registerItem("diamond_knife", new SwordItem(ToolMaterials.DIAMOND, 0, 1.5F, new FabricItemSettings().group(ItemGroup.COMBAT)));
        NETHERITE_KNIFE = registerItem("netherite_knife", new SwordItem(ToolMaterials.NETHERITE, 0, 1.5F, new FabricItemSettings().group(ItemGroup.COMBAT).fireproof()));

        // Shieldblade
        IRON_SHIELDBLADE = registerItem("iron_shieldblade", new ShieldbladeItem(ModToolMaterials.REINFORCED_IRON, 2, -3.0F, new FabricItemSettings().group(ItemGroup.COMBAT)));
        STEEL_SHIELDBLADE = registerItem("steel_shieldblade", new ShieldbladeItem(ModToolMaterials.REINFORCED_STEEL, 2, -3.0F, new FabricItemSettings().group(ItemGroup.COMBAT)));
        GOLDEN_SHIELDBLADE = registerItem("golden_shieldblade", new ShieldbladeItem(ModToolMaterials.REINFORCED_GOLD, 2, -3.0F, new FabricItemSettings().group(ItemGroup.COMBAT)));
        SILVER_SHIELDBLADE = registerItem("silver_shieldblade", new ShieldbladeItem(ModToolMaterials.REINFORCED_SILVER, 2, -3.0F, new FabricItemSettings().group(ItemGroup.COMBAT)));
        DIAMOND_SHIELDBLADE = registerItem("diamond_shieldblade", new ShieldbladeItem(ModToolMaterials.REINFORCED_DIAMOND, 2, -3.0F, new FabricItemSettings().group(ItemGroup.COMBAT)));
        NETHERITE_SHIELDBLADE = registerItem("netherite_shieldblade", new ShieldbladeItem(ModToolMaterials.REINFORCED_NETHERITE, 2, -3.0F, new FabricItemSettings().group(ItemGroup.COMBAT).fireproof()));

        // Reinforced
        REINFORCED_IRON_SWORD = registerItem("reinforced_iron_sword", new SwordItem(ModToolMaterials.REINFORCED_IRON, 3, -2.4F, new FabricItemSettings().group(ItemGroup.COMBAT)));
        REINFORCED_IRON_AXE = registerItem("reinforced_iron_axe", new ModAxeItem(ModToolMaterials.REINFORCED_IRON, 6.0F, -3.0F, new FabricItemSettings().group(ItemGroup.TOOLS)));
        REINFORCED_IRON_SHOVEL = registerItem("reinforced_iron_shovel", new ModShovelItem(ModToolMaterials.REINFORCED_IRON, 1.5F, -3.0F, new FabricItemSettings().group(ItemGroup.TOOLS)));
        REINFORCED_IRON_HOE = registerItem("reinforced_iron_hoe", new ModHoeItem(ModToolMaterials.REINFORCED_IRON, -2, -1.0F, new FabricItemSettings().group(ItemGroup.TOOLS)));
        REINFORCED_IRON_PICKAXE = registerItem("reinforced_iron_pickaxe", new ModPickaxeItem(ModToolMaterials.REINFORCED_IRON, 1, -2.8F, new FabricItemSettings().group(ItemGroup.TOOLS)));
        REINFORCED_IRON_SPEAR = registerItem("reinforced_iron_spear", new SpearItem(ModToolMaterials.REINFORCED_IRON, 2, -3.0F, new FabricItemSettings().group(ItemGroup.COMBAT)));
        REINFORCED_IRON_KNIFE = registerItem("reinforced_iron_knife", new SwordItem(ModToolMaterials.REINFORCED_IRON, 0, 1.5F, new FabricItemSettings().group(ItemGroup.COMBAT)));
        REINFORCED_STEEL_SWORD = registerItem("reinforced_steel_sword", new SwordItem(ModToolMaterials.REINFORCED_STEEL, 3, -2.4F, new FabricItemSettings().group(ItemGroup.COMBAT)));
        REINFORCED_STEEL_AXE = registerItem("reinforced_steel_axe", new ModAxeItem(ModToolMaterials.REINFORCED_STEEL, 6.0F, -3.0F, new FabricItemSettings().group(ItemGroup.TOOLS)));
        REINFORCED_STEEL_SHOVEL = registerItem("reinforced_steel_shovel", new ModShovelItem(ModToolMaterials.REINFORCED_STEEL, 1.5F, -3.0F, new FabricItemSettings().group(ItemGroup.TOOLS)));
        REINFORCED_STEEL_HOE = registerItem("reinforced_steel_hoe", new ModHoeItem(ModToolMaterials.REINFORCED_STEEL, -2, -1.0F, new FabricItemSettings().group(ItemGroup.TOOLS)));
        REINFORCED_STEEL_PICKAXE = registerItem("reinforced_steel_pickaxe", new ModPickaxeItem(ModToolMaterials.REINFORCED_STEEL, 1, -2.8F, new FabricItemSettings().group(ItemGroup.TOOLS)));
        REINFORCED_STEEL_SPEAR = registerItem("reinforced_steel_spear", new SpearItem(ModToolMaterials.REINFORCED_STEEL, 2, -3.0F, new FabricItemSettings().group(ItemGroup.COMBAT)));
        REINFORCED_STEEL_KNIFE = registerItem("reinforced_steel_knife", new SwordItem(ModToolMaterials.REINFORCED_STEEL, 0, 1.5F, new FabricItemSettings().group(ItemGroup.COMBAT)));
        REINFORCED_GOLDEN_SWORD = registerItem("reinforced_golden_sword", new SwordItem(ModToolMaterials.REINFORCED_GOLD, 3, -2.4F, new FabricItemSettings().group(ItemGroup.COMBAT)));
        REINFORCED_GOLDEN_AXE = registerItem("reinforced_golden_axe", new ModAxeItem(ModToolMaterials.REINFORCED_GOLD, 6.0F, -3.0F, new FabricItemSettings().group(ItemGroup.TOOLS)));
        REINFORCED_GOLDEN_SHOVEL = registerItem("reinforced_golden_shovel", new ModShovelItem(ModToolMaterials.REINFORCED_GOLD, 1.5F, -3.0F, new FabricItemSettings().group(ItemGroup.TOOLS)));
        REINFORCED_GOLDEN_HOE = registerItem("reinforced_golden_hoe", new ModHoeItem(ModToolMaterials.REINFORCED_GOLD, 0, -3.0F, new FabricItemSettings().group(ItemGroup.TOOLS)));
        REINFORCED_GOLDEN_PICKAXE = registerItem("reinforced_golden_pickaxe", new ModPickaxeItem(ModToolMaterials.REINFORCED_GOLD, 1, -2.8F, new FabricItemSettings().group(ItemGroup.TOOLS)));
        REINFORCED_GOLDEN_SPEAR = registerItem("reinforced_golden_spear", new SpearItem(ModToolMaterials.REINFORCED_GOLD, 2, -3.0F, new FabricItemSettings().group(ItemGroup.COMBAT)));
        REINFORCED_GOLDEN_KNIFE = registerItem("reinforced_golden_knife", new SwordItem(ModToolMaterials.REINFORCED_GOLD, 0, 1.5F, new FabricItemSettings().group(ItemGroup.COMBAT)));
        REINFORCED_SILVER_SWORD = registerItem("reinforced_silver_sword", new SwordItem(ModToolMaterials.REINFORCED_SILVER, 3, -2.4F, new FabricItemSettings().group(ItemGroup.COMBAT)));
        REINFORCED_SILVER_AXE = registerItem("reinforced_silver_axe", new ModAxeItem(ModToolMaterials.REINFORCED_SILVER, 5.0F, -3.0F, new FabricItemSettings().group(ItemGroup.TOOLS)));
        REINFORCED_SILVER_SHOVEL = registerItem("reinforced_silver_shovel", new ModShovelItem(ModToolMaterials.REINFORCED_SILVER, 1.5F, -3.0F, new FabricItemSettings().group(ItemGroup.TOOLS)));
        REINFORCED_SILVER_HOE = registerItem("reinforced_silver_hoe", new ModHoeItem(ModToolMaterials.REINFORCED_SILVER, -3, 0.0F, new FabricItemSettings().group(ItemGroup.TOOLS)));
        REINFORCED_SILVER_PICKAXE = registerItem("reinforced_silver_pickaxe", new ModPickaxeItem(ModToolMaterials.REINFORCED_SILVER, 1, -2.8F, new FabricItemSettings().group(ItemGroup.TOOLS)));
        REINFORCED_SILVER_SPEAR = registerItem("reinforced_silver_spear", new SpearItem(ModToolMaterials.REINFORCED_SILVER, 2, -3.0F, new FabricItemSettings().group(ItemGroup.COMBAT)));
        REINFORCED_SILVER_KNIFE = registerItem("reinforced_silver_knife", new SwordItem(ModToolMaterials.REINFORCED_SILVER, 0, 1.5F, new FabricItemSettings().group(ItemGroup.COMBAT)));
        REINFORCED_DIAMOND_SWORD = registerItem("reinforced_diamond_sword", new SwordItem(ModToolMaterials.REINFORCED_DIAMOND, 3, -2.4F, new FabricItemSettings().group(ItemGroup.COMBAT)));
        REINFORCED_DIAMOND_AXE = registerItem("reinforced_diamond_axe", new ModAxeItem(ModToolMaterials.REINFORCED_DIAMOND, 5.0F, -3.0F, new FabricItemSettings().group(ItemGroup.TOOLS)));
        REINFORCED_DIAMOND_SHOVEL = registerItem("reinforced_diamond_shovel", new ModShovelItem(ModToolMaterials.REINFORCED_DIAMOND, 1.5F, -3.0F, new FabricItemSettings().group(ItemGroup.TOOLS)));
        REINFORCED_DIAMOND_HOE = registerItem("reinforced_diamond_hoe", new ModHoeItem(ModToolMaterials.REINFORCED_DIAMOND, -3, 0.0F, new FabricItemSettings().group(ItemGroup.TOOLS)));
        REINFORCED_DIAMOND_PICKAXE = registerItem("reinforced_diamond_pickaxe", new ModPickaxeItem(ModToolMaterials.REINFORCED_DIAMOND, 1, -2.8F, new FabricItemSettings().group(ItemGroup.TOOLS)));
        REINFORCED_DIAMOND_SPEAR = registerItem("reinforced_diamond_spear", new SpearItem(ModToolMaterials.REINFORCED_DIAMOND, 2, -3.0F, new FabricItemSettings().group(ItemGroup.COMBAT)));
        REINFORCED_DIAMOND_KNIFE = registerItem("reinforced_diamond_knife", new SwordItem(ModToolMaterials.REINFORCED_DIAMOND, 0, 1.5F, new FabricItemSettings().group(ItemGroup.COMBAT)));
        REINFORCED_NETHERITE_SWORD = registerItem("reinforced_netherite_sword", new SwordItem(ModToolMaterials.REINFORCED_NETHERITE, 3, -2.4F, new FabricItemSettings().group(ItemGroup.COMBAT).fireproof()));
        REINFORCED_NETHERITE_AXE = registerItem("reinforced_netherite_axe", new ModAxeItem(ModToolMaterials.REINFORCED_NETHERITE, 5.0F, -3.0F, new FabricItemSettings().group(ItemGroup.TOOLS).fireproof()));
        REINFORCED_NETHERITE_SHOVEL = registerItem("reinforced_netherite_shovel", new ModShovelItem(ModToolMaterials.REINFORCED_NETHERITE, 1.5F, -3.0F, new FabricItemSettings().group(ItemGroup.TOOLS).fireproof()));
        REINFORCED_NETHERITE_HOE = registerItem("reinforced_netherite_hoe", new ModHoeItem(ModToolMaterials.REINFORCED_NETHERITE, -4, 0.0F, new FabricItemSettings().group(ItemGroup.TOOLS).fireproof()));
        REINFORCED_NETHERITE_PICKAXE = registerItem("reinforced_netherite_pickaxe", new ModPickaxeItem(ModToolMaterials.REINFORCED_NETHERITE, 1, -2.8F, new FabricItemSettings().group(ItemGroup.TOOLS).fireproof()));
        REINFORCED_NETHERITE_SPEAR = registerItem("reinforced_netherite_spear", new SpearItem(ModToolMaterials.REINFORCED_NETHERITE, 2, -3.0F, new FabricItemSettings().group(ItemGroup.COMBAT).fireproof()));
        REINFORCED_NETHERITE_KNIFE = registerItem("reinforced_netherite_knife", new SwordItem(ModToolMaterials.REINFORCED_NETHERITE, 0, 1.5F, new FabricItemSettings().group(ItemGroup.COMBAT).fireproof()));

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

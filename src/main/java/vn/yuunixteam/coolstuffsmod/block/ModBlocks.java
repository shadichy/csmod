package vn.yuunixteam.coolstuffsmod.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.entity.EntityType;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.BlockView;
import vn.yuunixteam.coolstuffsmod.Main;

public class ModBlocks {

    // Bamboo blocks
    public static final Block BAMBOO_BUNDLE = registerBlock("bamboo_bundle",
            new BambooBlock(FabricBlockSettings
                    .of(Material.BAMBOO, MapColor.DARK_GREEN)
                    .breakInstantly()
                    .strength(1.0F)
                    .sounds(BlockSoundGroup.BAMBOO)
                    .nonOpaque()
                    .dynamicBounds()
            ));
    public static final Block BAMBOO_FENCE = registerBlock("bamboo_fence",
            new FenceBlock(FabricBlockSettings
                    .of(Material.BAMBOO)
                    .strength(2.0F, 3.0F)
                    .sounds(BlockSoundGroup.BAMBOO)
            ));
    public static final Block BAMBOO_FENCE_GATE = registerBlock("bamboo_fence_gate",
            new FenceGateBlock(FabricBlockSettings
                    .of(Material.BAMBOO)
                    .strength(2.0F, 3.0F)
                    .sounds(BlockSoundGroup.BAMBOO)
            ));
    public static final Block BAMBOO_DOOR = registerBlock("bamboo_door",
            new DoorBlock(FabricBlockSettings
                    .of(Material.BAMBOO)
                    .strength(3.0F)
                    .sounds(BlockSoundGroup.BAMBOO)
                    .nonOpaque()
            ));
    public static final Block BAMBOO_TRAPDOOR = registerBlock("bamboo_trapdoor",
            new TrapdoorBlock(FabricBlockSettings
                    .of(Material.BAMBOO)
                    .strength(1.0F)
                    .sounds(BlockSoundGroup.BAMBOO)
                    .nonOpaque()
                    .allowsSpawning(ModBlocks::never)
            ));
    public static final Block SCAFFOLD_BAMBOO_DOOR = registerBlock("scaffold_bamboo_door",
            new DoorBlock(FabricBlockSettings
                    .of(Material.BAMBOO)
                    .strength(3.0F)
                    .sounds(BlockSoundGroup.BAMBOO)
                    .nonOpaque()
            ));
    public static final Block SCAFFOLD_BAMBOO_TRAPDOOR = registerBlock("scaffold_bamboo_trapdoor",
            new TrapdoorBlock(FabricBlockSettings
                    .of(Material.BAMBOO)
                    .strength(1.0F)
                    .sounds(BlockSoundGroup.BAMBOO)
                    .nonOpaque()
                    .allowsSpawning(ModBlocks::never)
            ));

    // Dried bamboo blocks
    public static final Block DRIED_BAMBOO_BUNDLE = registerBlock("dried_bamboo_bundle",
            new PillarBlock(FabricBlockSettings
                    .of(Material.BAMBOO)
                    .breakInstantly()
                    .strength(1.0F)
                    .sounds(BlockSoundGroup.BAMBOO)
                    .nonOpaque()
                    .dynamicBounds()
            ));
    public static final Block DRIED_BAMBOO = registerBlock("dried_bamboo",
            new DriedBambooBlock(FabricBlockSettings
                    .of(Material.BAMBOO)
                    .breakInstantly()
                    .strength(1.0F)
                    .sounds(BlockSoundGroup.BAMBOO)
                    .nonOpaque()
                    .dynamicBounds()
            ));
    public static final Block DRIED_BAMBOO_FENCE = registerBlock("dried_bamboo_fence",
            new FenceBlock(FabricBlockSettings
                    .of(Material.BAMBOO)
                    .strength(2.0F, 3.0F)
                    .sounds(BlockSoundGroup.BAMBOO)
            ));
    public static final Block DRIED_BAMBOO_FENCE_GATE = registerBlock("dried_bamboo_fence_gate",
            new FenceGateBlock(FabricBlockSettings
                    .of(Material.BAMBOO)
                    .strength(2.0F, 3.0F)
                    .sounds(BlockSoundGroup.BAMBOO)
            ));

    public static final Block DRIED_BAMBOO_DOOR = registerBlock("dried_bamboo_door",
            new DoorBlock(FabricBlockSettings
                    .of(Material.BAMBOO)
                    .strength(3.0F)
                    .sounds(BlockSoundGroup.BAMBOO)
                    .nonOpaque()
            ));
    public static final Block DRIED_BAMBOO_TRAPDOOR = registerBlock("dried_bamboo_trapdoor",
            new TrapdoorBlock(FabricBlockSettings
                    .of(Material.BAMBOO)
                    .strength(1.0F)
                    .sounds(BlockSoundGroup.BAMBOO)
                    .nonOpaque()
                    .allowsSpawning(ModBlocks::never)
            ));
    public static final Block PUNJI_STICKS = registerBlock("punji_sticks",
            new PunjiSticksBlock(FabricBlockSettings
                    .of(Material.BAMBOO)
                    .strength(1.0F)
                    .sounds(BlockSoundGroup.BAMBOO)
                    .noCollision()
            ));

    // Silver blocks
    public static final Block SILVER_BLOCK = registerBlock("silver_block",
            new Block(FabricBlockSettings
                    .of(Material.METAL)
                    .requiresTool()
                    .strength(5.0F, 8.0F)
                    .sounds(BlockSoundGroup.METAL)
            ));
    public static final Block RAW_SILVER_BLOCK = registerBlock("raw_silver_block",
            new Block(FabricBlockSettings
                    .of(Material.STONE, MapColor.BRIGHT_TEAL)
                    .requiresTool()
                    .strength(5.0F, 6.0F)
            ));
    public static final Block SILVER_ORE = registerBlock("silver_ore",
            new OreBlock(FabricBlockSettings
                    .of(Material.STONE)
                    .requiresTool()
                    .strength(3.0F,3.0F)
            ));
    public static final Block DEEPSLATE_SILVER_ORE = registerBlock("deepslate_silver_ore",
            new OreBlock(FabricBlockSettings
                    .copy(SILVER_ORE)
                    .mapColor(MapColor.DEEPSLATE_GRAY)
                    .strength(4.5F, 3.0F)
                    .sounds(BlockSoundGroup.DEEPSLATE)
            ));

    // Nether ores
    public static final Block NETHER_DIAMOND_ORE = registerBlock("nether_diamond_ore",
            new OreBlock(FabricBlockSettings
                    .of(Material.STONE, MapColor.DARK_RED)
                    .requiresTool()
                    .strength(3.0F, 3.0F)
                    .sounds(BlockSoundGroup.NETHER_GOLD_ORE)
            ));

    // Steel
    public static final Block PIG_IRON = registerBlock("pig_iron",
            new Block(FabricBlockSettings
                    .of(Material.STONE, MapColor.RAW_IRON_PINK)
                    .requiresTool()
                    .strength(5.0F, 6.0F)
            ));
    public static final Block STEEL_BLOCK = registerBlock("steel_block",
            new Block(FabricBlockSettings
                    .of(Material.METAL, MapColor.IRON_GRAY)
                    .requiresTool()
                    .strength(5.0F, 7.0F)
                    .sounds(BlockSoundGroup.METAL)
            ));

    // Methods
    private static Block registerBlock(String name, Block block) {
        return  Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, name), block);
    }

    private static Boolean never(BlockState state, BlockView world, BlockPos pos, EntityType<?> type) {
        return false;
    }

    public static void registerModBlock() {
        Main.LOGGER.info("[CS] Registering blocks for" + Main.MOD_ID);
    }
}

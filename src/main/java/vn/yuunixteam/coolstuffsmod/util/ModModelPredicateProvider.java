package vn.yuunixteam.coolstuffsmod.util;

import net.minecraft.client.item.ModelPredicateProviderRegistry;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import vn.yuunixteam.coolstuffsmod.item.ModItems;

public class ModModelPredicateProvider {
    public static void registerModModels() {
        registerBow(ModItems.IRON_BOW);
        registerBow(ModItems.STEEL_BOW);
        registerBow(ModItems.GOLDEN_BOW);
        registerBow(ModItems.SILVER_BOW);
        registerBow(ModItems.DIAMOND_BOW);
        registerBow(ModItems.NETHERITE_BOW);

        registerSpear(ModItems.WOODEN_SPEAR);
        registerSpear(ModItems.STONE_SPEAR);
        registerSpear(ModItems.IRON_SPEAR);
        registerSpear(ModItems.STEEL_SPEAR);
        registerSpear(ModItems.GOLDEN_SPEAR);
        registerSpear(ModItems.SILVER_SPEAR);
        registerSpear(ModItems.DIAMOND_SPEAR);
        registerSpear(ModItems.NETHERITE_SPEAR);
    }

    private static void registerBow(Item bowItem) {
        ModelPredicateProviderRegistry.register(bowItem, new Identifier("pull"), (stack, world, entity, seed) -> {
            if (entity == null) {
                return 0.0F;
            } else {
                return entity.getActiveItem() != stack ? 0.0F : (float)(stack.getMaxUseTime() - entity.getItemUseTimeLeft()) / 20.0F;
            }
        });
        ModelPredicateProviderRegistry.register(bowItem, new Identifier("pulling"), (stack, world, entity, seed) -> entity != null && entity.isUsingItem() && entity.getActiveItem() == stack ? 1.0F : 0.0F);
    }

    private static void registerSpear(Item spearItem) {
        ModelPredicateProviderRegistry.register(spearItem, new Identifier("throwing"), (stack, world, entity, seed) -> entity != null && entity.isUsingItem() && entity.getActiveItem() == stack ? 1.0F : 0.0F);
    }

}

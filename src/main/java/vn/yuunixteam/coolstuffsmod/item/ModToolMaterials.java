package vn.yuunixteam.coolstuffsmod.item;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.util.Lazy;

import java.util.function.Supplier;

public enum ModToolMaterials implements ToolMaterial {
    STEEL               (2, 320,    6.5F,   2.5F, 15,   () -> Ingredient.ofItems(ModItems.STEEL_INGOT)),
    SILVER              (3, 900,    7.0F,   3.0F, 18,   () -> Ingredient.ofItems(ModItems.SILVER_INGOT)),
    REINFORCED_IRON     (2, 400,    6.5F,   2.5F, 14,   () -> Ingredient.ofItems(Items.IRON_INGOT)),
    REINFORCED_STEEL    (2, 512,    7.0F,   3.0F, 15,   () -> Ingredient.ofItems(ModItems.STEEL_INGOT)),
    REINFORCED_GOLD     (1, 51,     12.5F,  0.5F, 22,   () -> Ingredient.ofItems(Items.GOLD_INGOT)),
    REINFORCED_SILVER   (3, 1080,   7.5F,   3.0F, 18,   () -> Ingredient.ofItems(ModItems.SILVER_INGOT)),
    REINFORCED_DIAMOND  (3, 1873,   8.5F,   3.5F, 10,   () -> Ingredient.ofItems(Items.DIAMOND)),
    REINFORCED_NETHERITE(4, 2234,   9.5F,   4.5F, 15,   () -> Ingredient.ofItems(Items.NETHERITE_INGOT));

    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Lazy<Ingredient> repairIngredient;

    ModToolMaterials(int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = new Lazy<>(repairIngredient);
    }

    public int getDurability() {
        return this.itemDurability;
    }

    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    public float getAttackDamage() {
        return this.attackDamage;
    }

    public int getMiningLevel() {
        return this.miningLevel;
    }

    public int getEnchantability() {
        return this.enchantability;
    }

    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}

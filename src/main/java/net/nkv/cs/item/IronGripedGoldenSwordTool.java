
package net.nkv.cs.item;

import net.minecraft.recipe.Ingredient;
import net.minecraft.item.ToolMaterial;
import net.minecraft.item.SwordItem;
import net.minecraft.item.Items;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;

public class IronGripedGoldenSwordTool {
	public static final ToolMaterial IRONGRIPEDGOLDENSWORD_TOOL_MATERIAL = new ToolMaterial() {
		@Override
		public int getDurability() {
			return 48;
		}

		@Override
		public float getMiningSpeedMultiplier() {
			return 12F;
		}

		@Override
		public float getAttackDamage() {
			return 3F;
		}

		@Override
		public int getMiningLevel() {
			return 2;
		}

		@Override
		public int getEnchantability() {
			return 22;
		}

		@Override
		public Ingredient getRepairIngredient() {
			return Ingredient.ofItems(Items.GOLD_INGOT);
		}
	};
	public static final Item INSTANCE = new SwordItem(IRONGRIPEDGOLDENSWORD_TOOL_MATERIAL, 0, (float) -3,
			(new FabricItemSettings().group(ItemGroup.COMBAT))) {
	};
}

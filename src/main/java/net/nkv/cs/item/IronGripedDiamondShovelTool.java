
package net.nkv.cs.item;

import net.minecraft.recipe.Ingredient;
import net.minecraft.item.ToolMaterial;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.Items;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;

public class IronGripedDiamondShovelTool {
	public static final ToolMaterial IRONGRIPEDDIAMONDSHOVEL_TOOL_MATERIAL = new ToolMaterial() {
		@Override
		public int getDurability() {
			return 1727;
		}

		@Override
		public float getMiningSpeedMultiplier() {
			return 8F;
		}

		@Override
		public float getAttackDamage() {
			return 0F;
		}

		@Override
		public int getMiningLevel() {
			return 3;
		}

		@Override
		public int getEnchantability() {
			return 10;
		}

		@Override
		public Ingredient getRepairIngredient() {
			return Ingredient.ofItems(Items.DIAMOND);
		}
	};
	public static final Item INSTANCE = new ShovelItem(IRONGRIPEDDIAMONDSHOVEL_TOOL_MATERIAL, 0, (float) -3,
			(new FabricItemSettings().group(ItemGroup.TOOLS))) {
	};
}

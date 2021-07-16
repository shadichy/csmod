
package net.nkv.cs.item;

import net.minecraft.recipe.Ingredient;
import net.minecraft.item.ToolMaterial;
import net.minecraft.item.Items;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.AxeItem;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;

public class IronGripedIronAxeTool {
	public static final ToolMaterial IRONGRIPEDIRONAXE_TOOL_MATERIAL = new ToolMaterial() {
		@Override
		public int getDurability() {
			return 325;
		}

		@Override
		public float getMiningSpeedMultiplier() {
			return 6F;
		}

		@Override
		public float getAttackDamage() {
			return 4F;
		}

		@Override
		public int getMiningLevel() {
			return 2;
		}

		@Override
		public int getEnchantability() {
			return 14;
		}

		@Override
		public Ingredient getRepairIngredient() {
			return Ingredient.ofItems(Items.IRON_INGOT);
		}
	};
	public static final Item INSTANCE = new AxeItem(IRONGRIPEDIRONAXE_TOOL_MATERIAL, 0, (float) -3,
			(new FabricItemSettings().group(ItemGroup.TOOLS))) {
	};
}

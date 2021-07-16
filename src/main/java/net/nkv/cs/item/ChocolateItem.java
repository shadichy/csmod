
package net.nkv.cs.item;

import net.minecraft.util.UseAction;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.FoodComponent;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;

public class ChocolateItem extends Item {
	public ChocolateItem() {
		super(new FabricItemSettings().group(ItemGroup.FOOD).maxCount(64)
				.food((new FoodComponent.Builder()).hunger(4).saturationModifier(1.6f).build()));
	}

	@Override
	public int getMaxUseTime(ItemStack stack) {
		return 28;
	}

	public UseAction getUseAction(ItemStack stack) {
		return UseAction.EAT;
	}
}

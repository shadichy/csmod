
package net.nkv.cs.item;

import net.minecraft.util.UseAction;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.FoodComponent;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;

public class CacaoMilkItem extends Item {
	public CacaoMilkItem() {
		super(new FabricItemSettings().group(ItemGroup.FOOD).maxCount(64)
				.food((new FoodComponent.Builder()).hunger(4).saturationModifier(1.2000000000000002f).build()));
	}

	public UseAction getUseAction(ItemStack stack) {
		return UseAction.DRINK;
	}

	@Override
	public net.minecraft.sound.SoundEvent getEatSound() {
		return net.minecraft.sound.SoundEvents.ENTITY_GENERIC_DRINK;
	}
}

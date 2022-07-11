package vn.yuunixteam.coolstuffsmod.item;

import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent RICE = (new FoodComponent.Builder())
            .hunger(6)
            .saturationModifier(0.6F)
            .build();
}

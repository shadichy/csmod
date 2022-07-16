package vn.yuunixteam.coolstuffsmod.item;

import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent RICE = (new FoodComponent.Builder())
            .hunger(6)
            .saturationModifier(0.6F)
            .build();
    public static final FoodComponent ONIGIRI = (new FoodComponent.Builder())
            .hunger(7)
            .saturationModifier(0.9F)
            .build();
    public static final FoodComponent SCORCHED_RICE = (new FoodComponent.Builder())
            .hunger(6)
            .saturationModifier(0.5F)
            .build();
    public static final FoodComponent CHOCOLATE = (new FoodComponent.Builder())
            .hunger(6)
            .saturationModifier(0.2F)
            .build();
    public static final FoodComponent CHOCOLATE_MILK = (new FoodComponent.Builder())
            .hunger(6)
            .saturationModifier(0.2F)
            .build();
}

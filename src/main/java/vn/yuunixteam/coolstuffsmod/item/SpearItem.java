package vn.yuunixteam.coolstuffsmod.item;

import net.minecraft.item.Item;
import net.minecraft.item.ToolItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.item.Vanishable;

public class SpearItem extends ToolItem implements Vanishable {
    public SpearItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Item.Settings settings) {
        super(toolMaterial, settings);
    }
}

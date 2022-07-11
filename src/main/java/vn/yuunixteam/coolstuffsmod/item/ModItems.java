package vn.yuunixteam.coolstuffsmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import vn.yuunixteam.coolstuffsmod.Main;

public class ModItem {
    public static final Item USABLE_ITEM = registerItem("usable_item",
            new Item(new FabricItemSettings()
                    .group(ItemGroup.MISC)
                    .fireproof()
                    .maxCount(16)
                    .maxDamage(10)));
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, name), item);
    }
    public static void registerModItem() {
        Main.LOGGER.info("[CS] Registering items for " + Main.MOD_ID);
    }
}

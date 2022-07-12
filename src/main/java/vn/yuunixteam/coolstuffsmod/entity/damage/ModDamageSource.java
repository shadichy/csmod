package vn.yuunixteam.coolstuffsmod.entity.damage;

import net.minecraft.entity.damage.DamageSource;

public class ModDamageSource extends DamageSource {

    public static final DamageSource FALL_TO_PUNJI_STICKS = new ModDamageSource("fall_to_punji_sticks");
    public static final DamageSource MOVE_IN_PUNJI_STICKS = new ModDamageSource("move_in_punji_sticks");

    protected ModDamageSource(String name) {
        super(name);
    }
}

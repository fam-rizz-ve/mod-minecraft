
package net.mcreator.utility.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class GravityMobEffect extends MobEffect {
	public GravityMobEffect() {
		super(MobEffectCategory.HARMFUL, -1);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}

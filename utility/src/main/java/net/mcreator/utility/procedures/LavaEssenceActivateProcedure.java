package net.mcreator.utility.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.mcreator.utility.init.UtilityModEnchantments;

public class LavaEssenceActivateProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(UtilityModEnchantments.LAVAESSENCE.get()) == 1) {
			if (entity instanceof LivingEntity _livEnt2 && _livEnt2.getMobType() == MobType.UNDEAD) {
				entity.setSecondsOnFire(100);
				if ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) == 1) {
					if (Mth.nextInt(RandomSource.create(), 1, 5) == 3) {
						if (!entity.level().isClientSide())
							entity.discard();
					}
				}
			}
		}
	}
}

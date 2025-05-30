package net.mcreator.utility.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.core.registries.Registries;

import net.mcreator.utility.init.UtilityModEnchantments;

public class WaterEssenceActivateProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(UtilityModEnchantments.WATERESSENCE.get()) == 1) {
			if (entity instanceof LivingEntity _livEnt2 && _livEnt2.getMobType() == MobType.UNDEAD) {
				if (Mth.nextInt(RandomSource.create(), 1, 10) == 5) {
					if (!entity.level().isClientSide())
						entity.discard();
				}
			} else {
				entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.DROWN)), 5);
			}
		}
	}
}

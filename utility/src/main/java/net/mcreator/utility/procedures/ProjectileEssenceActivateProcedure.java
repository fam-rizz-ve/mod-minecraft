package net.mcreator.utility.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.utility.init.UtilityModEnchantments;

public class ProjectileEssenceActivateProcedure {
	public static void execute(LevelAccessor world, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(UtilityModEnchantments.PROJECTILE_ESSENCE.get()) == 1) {
			if (sourceentity instanceof Mob _entity && entity instanceof LivingEntity _ent)
				_entity.setTarget(_ent);
		}
	}
}

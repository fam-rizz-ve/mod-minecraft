package net.mcreator.utility.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.utility.init.UtilityModEnchantments;

public class ObsidianEssenceActivateProcedure {
	public static void execute(LevelAccessor world, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(UtilityModEnchantments.OBSIDIANESSENCE.get()) == 1) {
			while (itemstack.getMaxDamage() == 200) {
				itemstack.setDamageValue(1);
			}
		}
	}
}

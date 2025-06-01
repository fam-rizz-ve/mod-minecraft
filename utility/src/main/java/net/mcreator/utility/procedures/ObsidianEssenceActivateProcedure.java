package net.mcreator.utility.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.utility.init.UtilityModEnchantments;

public class ObsidianEssenceActivateProcedure {
	public static void execute(LevelAccessor world, Entity sourceentity, ItemStack itemstack) {
		if (sourceentity == null)
			return;
		if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(UtilityModEnchantments.OBSIDIANESSENCE.get()) == 1) {
			if (itemstack.getMaxDamage() <= 20) {
				itemstack.setDamageValue((int) (itemstack.getDamageValue() + 10));
			} else {
				itemstack.setDamageValue((int) (itemstack.getDamageValue() - 2));
			}
		}
	}
}

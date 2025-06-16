package net.mcreator.utility.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.utility.init.UtilityModItems;

public class AttivadisattivanighthelmetQuandoIlTastoVienePremutoProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem() == UtilityModItems.NIGHTELMET_HELMET.get()) {
			if (entity instanceof LivingEntity _livEnt2 && _livEnt2.hasEffect(MobEffects.NIGHT_VISION)) {
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(MobEffects.NIGHT_VISION);
			} else {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, -1, 1));
			}
		}
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getItem() == UtilityModItems.NIGHTELMET_CHESTPLATE.get()) {
			if (entity instanceof LivingEntity _livEnt7 && _livEnt7.hasEffect(MobEffects.HEALTH_BOOST)) {
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(MobEffects.HEALTH_BOOST);
			} else {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.HEALTH_BOOST, -1, 2));
			}
		}
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getItem() == UtilityModItems.NIGHTELMET_LEGGINGS.get()) {
			if (entity instanceof LivingEntity _livEnt12 && _livEnt12.hasEffect(MobEffects.MOVEMENT_SPEED)) {
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(MobEffects.MOVEMENT_SPEED);
			} else {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, -1, 2));
			}
		}
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getItem() == UtilityModItems.NIGHTELMET_BOOTS.get()) {
			if (entity instanceof LivingEntity _livEnt17 && _livEnt17.hasEffect(MobEffects.JUMP)) {
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(MobEffects.JUMP);
			} else {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.JUMP, -1, 2));
			}
		}
	}
}

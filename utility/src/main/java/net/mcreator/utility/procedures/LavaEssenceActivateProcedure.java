package net.mcreator.utility.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingAttackEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.mcreator.utility.init.UtilityModEnchantments;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class LavaEssenceActivateProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingAttackEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level(), event.getEntity(), event.getSource().getEntity());
		}
	}

	public static void execute(LevelAccessor world, Entity entity, Entity sourceentity) {
		execute(null, world, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getEnchantmentLevel(UtilityModEnchantments.LAVAESSENCE.get()) <= 1) {
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

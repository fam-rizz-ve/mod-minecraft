
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.utility.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.utility.potion.GravityMobEffect;
import net.mcreator.utility.UtilityMod;

public class UtilityModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, UtilityMod.MODID);
	public static final RegistryObject<MobEffect> GRAVITY = REGISTRY.register("gravity", () -> new GravityMobEffect());
}

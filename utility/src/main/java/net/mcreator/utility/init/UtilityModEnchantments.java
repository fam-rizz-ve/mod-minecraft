
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.utility.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.enchantment.Enchantment;

import net.mcreator.utility.enchantment.WateressenceEnchantment;
import net.mcreator.utility.enchantment.ProjectileessenceEnchantment;
import net.mcreator.utility.enchantment.LavaessenceEnchantment;
import net.mcreator.utility.enchantment.CreeperessenceEnchantment;
import net.mcreator.utility.UtilityMod;

public class UtilityModEnchantments {
	public static final DeferredRegister<Enchantment> REGISTRY = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, UtilityMod.MODID);
	public static final RegistryObject<Enchantment> LAVAESSENCE = REGISTRY.register("lavaessence", () -> new LavaessenceEnchantment());
	public static final RegistryObject<Enchantment> WATERESSENCE = REGISTRY.register("wateressence", () -> new WateressenceEnchantment());
	public static final RegistryObject<Enchantment> CREEPERESSENCE = REGISTRY.register("creeperessence", () -> new CreeperessenceEnchantment());
	public static final RegistryObject<Enchantment> PROJECTILEESSENCE = REGISTRY.register("projectileessence", () -> new ProjectileessenceEnchantment());
}

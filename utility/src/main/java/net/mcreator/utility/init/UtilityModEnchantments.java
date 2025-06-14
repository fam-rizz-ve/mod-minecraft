
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.utility.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.enchantment.Enchantment;

import net.mcreator.utility.enchantment.WindesseceEnchantment;
import net.mcreator.utility.enchantment.WateressenceEnchantment;
import net.mcreator.utility.enchantment.StormesseceEnchantment;
import net.mcreator.utility.enchantment.SporetouchEnchantment;
import net.mcreator.utility.enchantment.LavaessenceEnchantment;
import net.mcreator.utility.enchantment.IceessenceEnchantment;
import net.mcreator.utility.enchantment.FuryesseceEnchantment;
import net.mcreator.utility.enchantment.CreeperessenceEnchantment;
import net.mcreator.utility.enchantment.AshesseceEnchantment;
import net.mcreator.utility.UtilityMod;

public class UtilityModEnchantments {
	public static final DeferredRegister<Enchantment> REGISTRY = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, UtilityMod.MODID);
	public static final RegistryObject<Enchantment> LAVAESSENCE = REGISTRY.register("lavaessence", () -> new LavaessenceEnchantment());
	public static final RegistryObject<Enchantment> WATERESSENCE = REGISTRY.register("wateressence", () -> new WateressenceEnchantment());
	public static final RegistryObject<Enchantment> CREEPERESSENCE = REGISTRY.register("creeperessence", () -> new CreeperessenceEnchantment());
	public static final RegistryObject<Enchantment> ICEESSENCE = REGISTRY.register("iceessence", () -> new IceessenceEnchantment());
	public static final RegistryObject<Enchantment> ASHESSECE = REGISTRY.register("ashessece", () -> new AshesseceEnchantment());
	public static final RegistryObject<Enchantment> STORMESSECE = REGISTRY.register("stormessece", () -> new StormesseceEnchantment());
	public static final RegistryObject<Enchantment> WINDESSECE = REGISTRY.register("windessece", () -> new WindesseceEnchantment());
	public static final RegistryObject<Enchantment> SPORETOUCH = REGISTRY.register("sporetouch", () -> new SporetouchEnchantment());
	public static final RegistryObject<Enchantment> FURYESSECE = REGISTRY.register("furyessece", () -> new FuryesseceEnchantment());
	public static final RegistryObject<Enchantment> FURYESSECEARMOR = REGISTRY.register("furyessecearmor", () -> new FuryessecearmorEnchantment());
}

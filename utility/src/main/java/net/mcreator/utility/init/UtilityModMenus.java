
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.utility.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.utility.world.inventory.AncentAnviMenu;
import net.mcreator.utility.UtilityMod;

public class UtilityModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, UtilityMod.MODID);
	public static final RegistryObject<MenuType<AncentAnviMenu>> ANCENT_ANVI = REGISTRY.register("ancent_anvi", () -> IForgeMenuType.create(AncentAnviMenu::new));
}

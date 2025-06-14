
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.utility.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.utility.world.inventory.EssenctiondistilizerGUIMenu;
import net.mcreator.utility.UtilityMod;

public class UtilityModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, UtilityMod.MODID);
	public static final RegistryObject<MenuType<EssenctiondistilizerGUIMenu>> ESSENCTIONDISTILIZER_GUI = REGISTRY.register("essenctiondistilizer_gui", () -> IForgeMenuType.create(EssenctiondistilizerGUIMenu::new));
}

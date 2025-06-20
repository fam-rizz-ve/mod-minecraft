
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.utility.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.utility.UtilityMod;

public class UtilityModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, UtilityMod.MODID);
	public static final RegistryObject<CreativeModeTab> UTILITY = REGISTRY.register("utility",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.utility.utility")).icon(() -> new ItemStack(UtilityModItems.NIGHTELMET_HELMET.get())).displayItems((parameters, tabData) -> {
				tabData.accept(UtilityModItems.NIGHTELMET_HELMET.get());
				tabData.accept(UtilityModItems.NIGHTELMET_CHESTPLATE.get());
				tabData.accept(UtilityModItems.NIGHTELMET_LEGGINGS.get());
				tabData.accept(UtilityModItems.NIGHTELMET_BOOTS.get());
				tabData.accept(UtilityModItems.FLATKEY.get());
				tabData.accept(UtilityModItems.OVERWORDKEY.get());
				tabData.accept(UtilityModItems.NETHERKEY.get());
				tabData.accept(UtilityModItems.ENDKEY.get());
				tabData.accept(UtilityModItems.LIMBOKEY.get());
				tabData.accept(UtilityModItems.POWER_ESSENCE.get());
				tabData.accept(UtilityModBlocks.ESSENCTIONDISTILIZER.get().asItem());
				tabData.accept(UtilityModItems.LIMBO_KEY_PART_1.get());
				tabData.accept(UtilityModItems.LIMINALY_KEY.get());
				tabData.accept(UtilityModItems.EMPTYKEY.get());
				tabData.accept(UtilityModItems.OVERWORLDESSENCE.get());
				tabData.accept(UtilityModItems.NEHTERESSENCE.get());
				tabData.accept(UtilityModItems.ENDESSECE.get());
				tabData.accept(UtilityModItems.FLATESSENCE.get());
				tabData.accept(UtilityModItems.TACTICAL_TEMPLATE.get());
			}).build());
}

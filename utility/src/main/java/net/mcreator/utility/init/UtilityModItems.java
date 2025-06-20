
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.utility.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.utility.item.TacticalTemplateItem;
import net.mcreator.utility.item.PowerEssenceItem;
import net.mcreator.utility.item.OverworldessenceItem;
import net.mcreator.utility.item.OverwordkeyItem;
import net.mcreator.utility.item.NightelmetItem;
import net.mcreator.utility.item.NetherkeyItem;
import net.mcreator.utility.item.NehteressenceItem;
import net.mcreator.utility.item.LiminalyKeyItem;
import net.mcreator.utility.item.LimbokeyItem;
import net.mcreator.utility.item.LimboKeyPart1Item;
import net.mcreator.utility.item.FlatkeyItem;
import net.mcreator.utility.item.FlatessenceItem;
import net.mcreator.utility.item.EndkeyItem;
import net.mcreator.utility.item.EndesseceItem;
import net.mcreator.utility.item.EmptykeyItem;
import net.mcreator.utility.UtilityMod;

public class UtilityModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, UtilityMod.MODID);
	public static final RegistryObject<Item> NIGHTELMET_HELMET = REGISTRY.register("nightelmet_helmet", () -> new NightelmetItem.Helmet());
	public static final RegistryObject<Item> NIGHTELMET_CHESTPLATE = REGISTRY.register("nightelmet_chestplate", () -> new NightelmetItem.Chestplate());
	public static final RegistryObject<Item> NIGHTELMET_LEGGINGS = REGISTRY.register("nightelmet_leggings", () -> new NightelmetItem.Leggings());
	public static final RegistryObject<Item> NIGHTELMET_BOOTS = REGISTRY.register("nightelmet_boots", () -> new NightelmetItem.Boots());
	public static final RegistryObject<Item> FLATKEY = REGISTRY.register("flatkey", () -> new FlatkeyItem());
	public static final RegistryObject<Item> OVERWORDKEY = REGISTRY.register("overwordkey", () -> new OverwordkeyItem());
	public static final RegistryObject<Item> NETHERKEY = REGISTRY.register("netherkey", () -> new NetherkeyItem());
	public static final RegistryObject<Item> ENDKEY = REGISTRY.register("endkey", () -> new EndkeyItem());
	public static final RegistryObject<Item> LIMBOKEY = REGISTRY.register("limbokey", () -> new LimbokeyItem());
	public static final RegistryObject<Item> POWER_ESSENCE = REGISTRY.register("power_essence", () -> new PowerEssenceItem());
	public static final RegistryObject<Item> ESSENCTIONDISTILIZER = block(UtilityModBlocks.ESSENCTIONDISTILIZER);
	public static final RegistryObject<Item> LIMBO_KEY_PART_1 = REGISTRY.register("limbo_key_part_1", () -> new LimboKeyPart1Item());
	public static final RegistryObject<Item> LIMINALY_KEY = REGISTRY.register("liminaly_key", () -> new LiminalyKeyItem());
	public static final RegistryObject<Item> EMPTYKEY = REGISTRY.register("emptykey", () -> new EmptykeyItem());
	public static final RegistryObject<Item> OVERWORLDESSENCE = REGISTRY.register("overworldessence", () -> new OverworldessenceItem());
	public static final RegistryObject<Item> NEHTERESSENCE = REGISTRY.register("nehteressence", () -> new NehteressenceItem());
	public static final RegistryObject<Item> ENDESSECE = REGISTRY.register("endessece", () -> new EndesseceItem());
	public static final RegistryObject<Item> FLATESSENCE = REGISTRY.register("flatessence", () -> new FlatessenceItem());
	public static final RegistryObject<Item> TACTICAL_TEMPLATE = REGISTRY.register("tactical_template", () -> new TacticalTemplateItem());

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}

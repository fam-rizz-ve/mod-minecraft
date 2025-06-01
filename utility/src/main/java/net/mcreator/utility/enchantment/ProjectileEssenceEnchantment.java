
package net.mcreator.utility.enchantment;

import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.utility.init.UtilityModEnchantments;

import java.util.List;

public class ProjectileEssenceEnchantment extends Enchantment {
	private static final EnchantmentCategory ENCHANTMENT_CATEGORY = EnchantmentCategory.create("utility_projectile_essence", item -> Ingredient.of(ItemTags.create(new ResourceLocation("forge:amrmor"))).test(new ItemStack(item)));

	public ProjectileEssenceEnchantment() {
		super(Enchantment.Rarity.VERY_RARE, ENCHANTMENT_CATEGORY, EquipmentSlot.values());
	}

	@Override
	public int getMinCost(int level) {
		return 1 + level * 10;
	}

	@Override
	public int getMaxCost(int level) {
		return 6 + level * 10;
	}

	@Override
	protected boolean checkCompatibility(Enchantment enchantment) {
		return super.checkCompatibility(enchantment) && !List
				.of(UtilityModEnchantments.LAVAESSENCE.get(), UtilityModEnchantments.WATERESSENCE.get(), UtilityModEnchantments.CREEPERESSENCE.get(), UtilityModEnchantments.OBSIDIANESSENCE.get(), UtilityModEnchantments.OBSIDIANESSENCE_2.get())
				.contains(enchantment);
	}

	@Override
	public boolean isDiscoverable() {
		return false;
	}

	@Override
	public boolean isTradeable() {
		return false;
	}
}

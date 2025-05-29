
package net.mcreator.utility.enchantment;

import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.EquipmentSlot;

public class LavaessenceEnchantment extends Enchantment {
	private static final EnchantmentCategory ENCHANTMENT_CATEGORY = EnchantmentCategory.create("utility_lavaessence",
			item -> Ingredient.of(new ItemStack(Items.WOODEN_SWORD), new ItemStack(Items.IRON_SWORD), new ItemStack(Items.DIAMOND_SWORD), new ItemStack(Items.NETHERITE_SWORD)).test(new ItemStack(item)));

	public LavaessenceEnchantment() {
		super(Enchantment.Rarity.COMMON, ENCHANTMENT_CATEGORY, EquipmentSlot.values());
	}

	@Override
	public int getMinCost(int level) {
		return 1 + level * 10;
	}

	@Override
	public int getMaxCost(int level) {
		return 6 + level * 10;
	}
}


package net.mcreator.utility.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.utility.procedures.Netherite_Swordwith_Essence_procedureProcedure;
import net.mcreator.utility.init.UtilityModItems;

public class NetheriteSwordwithEssenceItem extends SwordItem {
	public NetheriteSwordwithEssenceItem() {
		super(new Tier() {
			public int getUses() {
				return 100;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 0f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(UtilityModItems.POWER_ESSENCE.get()), new ItemStack(Items.NETHERITE_INGOT));
			}
		}, 3, -3f, new Item.Properties().fireResistant());
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		Netherite_Swordwith_Essence_procedureProcedure.execute(entity.level(), entity);
		return retval;
	}
}

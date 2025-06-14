
package net.mcreator.utility.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class LimialikeyItem extends Item {
	public LimialikeyItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.EPIC));
	}
}

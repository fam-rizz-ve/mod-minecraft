
package net.mcreator.utility.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class FlatessenceItem extends Item {
	public FlatessenceItem() {
		super(new Item.Properties().stacksTo(16).rarity(Rarity.EPIC));
	}
}

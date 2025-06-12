
package net.mcreator.utility.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class LimboKeyPart1Item extends Item {
	public LimboKeyPart1Item() {
		super(new Item.Properties().stacksTo(3).fireResistant().rarity(Rarity.EPIC));
	}
}

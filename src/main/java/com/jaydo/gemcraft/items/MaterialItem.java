package com.jaydo.gemcraft.items;

import com.jaydo.gemcraft.main.Main;
import net.minecraft.world.item.Item;


public class MaterialItem extends Item
{

	public MaterialItem(Properties properties) {
		super(properties.tab(Main.GemcraftTabMaterial));
	}

}

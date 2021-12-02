package com.jaydo.gemcraft.gui;

import com.jaydo.gemcraft.setup.Registration;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;


public class GemcraftCreativeTabMaterials extends CreativeModeTab{

	public GemcraftCreativeTabMaterials(String label) {
		super(label);
		   }

	@Override
	public ItemStack makeIcon() {
		return new ItemStack(Registration.INGOT_ELEMENTUM.get());
	}
}

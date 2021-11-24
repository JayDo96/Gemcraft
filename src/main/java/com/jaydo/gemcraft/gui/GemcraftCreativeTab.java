package com.jaydo.gemcraft.gui;

import com.jaydo.gemcraft.setup.Registration;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;


public class GemcraftCreativeTab extends CreativeModeTab{
	
	public GemcraftCreativeTab(String label) {
		super(label);
		   }

	@Override
	public ItemStack makeIcon() {
		return new ItemStack(Registration.GEM_AMETHYST.get());
	}
}

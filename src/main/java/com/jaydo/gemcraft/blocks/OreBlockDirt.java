package com.jaydo.gemcraft.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

public class OreBlockDirt extends Block{

	public OreBlockDirt() {
		super(Properties.of(Material.DIRT)
				.sound(SoundType.GRAVEL)
				.strength(1.0f)
				.explosionResistance(1));
	}

}

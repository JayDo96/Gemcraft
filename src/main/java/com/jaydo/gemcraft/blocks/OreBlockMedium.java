package com.jaydo.gemcraft.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

public class OreBlockMedium extends Block{

	public OreBlockMedium() {
		super(Properties.of(Material.STONE)
				.sound(SoundType.STONE)
				.strength(5.0f)
				.explosionResistance(10)
		);
	}

}

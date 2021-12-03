package com.jaydo.gemcraft.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;

public class OreBlockSand extends Block{

	public OreBlockSand() {
		super(Properties.of(Material.SAND)
				.sound(SoundType.SAND)
				.strength(1.0f)
				.explosionResistance(1));
	}

}

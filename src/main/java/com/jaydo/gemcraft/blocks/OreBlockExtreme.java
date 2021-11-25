package com.jaydo.gemcraft.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

public class OreBlockExtreme extends Block{

	public OreBlockExtreme() {
		super(Properties.of(Material.STONE)
				.sound(SoundType.DEEPSLATE)
				.strength(20.0f)
				.explosionResistance(20000)
		);
	}

}

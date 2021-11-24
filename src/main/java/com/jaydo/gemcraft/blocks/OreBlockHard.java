package com.jaydo.gemcraft.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

public class OreBlockHard extends Block{

	public OreBlockHard() {
		super(Properties.of(Material.STONE)
				.sound(SoundType.DEEPSLATE)
				.strength(20.0f)
				.explosionResistance(1200)
		);
	}

}

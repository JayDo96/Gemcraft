package com.jaydo.gemcraft.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

public class OreBlock extends Block{

	public OreBlock() {
		super(Properties.of(Material.STONE)
				.sound(SoundType.STONE)
				.strength(3.0f)
				.explosionResistance(3));
	}

}

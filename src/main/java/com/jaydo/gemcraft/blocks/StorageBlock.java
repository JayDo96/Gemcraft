package com.jaydo.gemcraft.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

public class StorageBlock extends Block{

	public StorageBlock() {
		super(Properties.of(Material.METAL)
				.sound(SoundType.COPPER)
				.strength(3.0f)
				.explosionResistance(3));
	}

}

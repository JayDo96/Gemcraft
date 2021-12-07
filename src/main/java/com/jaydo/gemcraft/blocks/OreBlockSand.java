package com.jaydo.gemcraft.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraft.world.phys.shapes.VoxelShape;

public class OreBlockSand extends Block {

	public OreBlockSand() {
		super(Properties.of(Material.SAND)
				.sound(SoundType.SAND)
				.strength(1.0f)
				.explosionResistance(1));

	}
}

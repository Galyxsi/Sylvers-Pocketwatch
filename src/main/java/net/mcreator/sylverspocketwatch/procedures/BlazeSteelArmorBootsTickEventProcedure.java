package net.mcreator.sylverspocketwatch.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.sylverspocketwatch.init.SylversPocketwatchModBlocks;

public class BlazeSteelArmorBootsTickEventProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.LAVA) {
			world.setBlock(BlockPos.containing(x, y - 1, z), SylversPocketwatchModBlocks.BRITTLE_MAGMA.get().defaultBlockState(), 3);
		}
	}
}

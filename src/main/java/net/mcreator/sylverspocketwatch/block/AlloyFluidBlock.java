
package net.mcreator.sylverspocketwatch.block;

import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.sylverspocketwatch.init.SylversPocketwatchModFluids;

public class AlloyFluidBlock extends LiquidBlock {
	public AlloyFluidBlock() {
		super(() -> SylversPocketwatchModFluids.METAL_SLURDGE.get(),
				BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_GRAY).strength(100f).noCollission().noLootTable().liquid().pushReaction(PushReaction.DESTROY).sound(SoundType.EMPTY).replaceable());
	}
}

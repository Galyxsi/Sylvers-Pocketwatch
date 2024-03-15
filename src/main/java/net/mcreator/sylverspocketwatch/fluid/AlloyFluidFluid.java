
package net.mcreator.sylverspocketwatch.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.particles.ParticleOptions;

import net.mcreator.sylverspocketwatch.init.SylversPocketwatchModItems;
import net.mcreator.sylverspocketwatch.init.SylversPocketwatchModFluids;
import net.mcreator.sylverspocketwatch.init.SylversPocketwatchModFluidTypes;
import net.mcreator.sylverspocketwatch.init.SylversPocketwatchModBlocks;

public abstract class AlloyFluidFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> SylversPocketwatchModFluidTypes.METAL_SLURDGE_TYPE.get(), () -> SylversPocketwatchModFluids.METAL_SLURDGE.get(),
			() -> SylversPocketwatchModFluids.FLOWING_METAL_SLURDGE.get()).explosionResistance(100f).bucket(() -> SylversPocketwatchModItems.METAL_SLURDGE_BUCKET.get()).block(() -> (LiquidBlock) SylversPocketwatchModBlocks.METAL_SLURDGE.get());

	private AlloyFluidFluid() {
		super(PROPERTIES);
	}

	@Override
	public ParticleOptions getDripParticle() {
		return ParticleTypes.DRIPPING_LAVA;
	}

	public static class Source extends AlloyFluidFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends AlloyFluidFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}

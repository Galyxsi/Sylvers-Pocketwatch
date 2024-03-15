
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.sylverspocketwatch.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

import net.mcreator.sylverspocketwatch.fluid.types.AlloyFluidFluidType;
import net.mcreator.sylverspocketwatch.SylversPocketwatchMod;

public class SylversPocketwatchModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, SylversPocketwatchMod.MODID);
	public static final RegistryObject<FluidType> METAL_SLURDGE_TYPE = REGISTRY.register("metal_slurdge", () -> new AlloyFluidFluidType());
}

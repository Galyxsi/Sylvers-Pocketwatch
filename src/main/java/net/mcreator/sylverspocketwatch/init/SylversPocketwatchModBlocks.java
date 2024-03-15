
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.sylverspocketwatch.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.sylverspocketwatch.block.BrittleMagmaBlock;
import net.mcreator.sylverspocketwatch.block.AlloyFluidBlock;
import net.mcreator.sylverspocketwatch.SylversPocketwatchMod;

public class SylversPocketwatchModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, SylversPocketwatchMod.MODID);
	public static final RegistryObject<Block> METAL_SLURDGE = REGISTRY.register("metal_slurdge", () -> new AlloyFluidBlock());
	public static final RegistryObject<Block> BRITTLE_MAGMA = REGISTRY.register("brittle_magma", () -> new BrittleMagmaBlock());
}

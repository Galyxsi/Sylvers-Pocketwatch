
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.sylverspocketwatch.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.sylverspocketwatch.fluid.AlloyFluidFluid;
import net.mcreator.sylverspocketwatch.SylversPocketwatchMod;

public class SylversPocketwatchModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, SylversPocketwatchMod.MODID);
	public static final RegistryObject<FlowingFluid> METAL_SLURDGE = REGISTRY.register("metal_slurdge", () -> new AlloyFluidFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_METAL_SLURDGE = REGISTRY.register("flowing_metal_slurdge", () -> new AlloyFluidFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(METAL_SLURDGE.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_METAL_SLURDGE.get(), RenderType.translucent());
		}
	}
}


/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.sylverspocketwatch.init;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.sylverspocketwatch.SylversPocketwatchMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class SylversPocketwatchModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SylversPocketwatchMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {

		if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(SylversPocketwatchModItems.BLAZE_STEEL_ARMOR_HELMET.get());
			tabData.accept(SylversPocketwatchModItems.BLAZE_STEEL_ARMOR_CHESTPLATE.get());
			tabData.accept(SylversPocketwatchModItems.BLAZE_STEEL_ARMOR_LEGGINGS.get());
			tabData.accept(SylversPocketwatchModItems.BLAZE_STEEL_ARMOR_BOOTS.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(SylversPocketwatchModItems.NETHERITE_SHEET.get());
			tabData.accept(SylversPocketwatchModItems.BLAZE_SHEET.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(SylversPocketwatchModItems.METAL_SLURDGE_BUCKET.get());
		}
	}
}

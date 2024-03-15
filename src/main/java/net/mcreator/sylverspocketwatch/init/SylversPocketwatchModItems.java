
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.sylverspocketwatch.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.sylverspocketwatch.item.NetheriteSheetItem;
import net.mcreator.sylverspocketwatch.item.BlazeSheetItem;
import net.mcreator.sylverspocketwatch.SylversPocketwatchMod;

public class SylversPocketwatchModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, SylversPocketwatchMod.MODID);
	public static final RegistryObject<Item> NETHERITE_SHEET = REGISTRY.register("netherite_sheet", () -> new NetheriteSheetItem());
	public static final RegistryObject<Item> BLAZE_SHEET = REGISTRY.register("blaze_sheet", () -> new BlazeSheetItem());
}

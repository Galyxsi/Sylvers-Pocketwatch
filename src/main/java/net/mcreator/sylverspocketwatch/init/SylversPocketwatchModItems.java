
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.sylverspocketwatch.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.sylverspocketwatch.item.NetheriteSheetItem;
import net.mcreator.sylverspocketwatch.item.BlazeSteelArmorItem;
import net.mcreator.sylverspocketwatch.item.BlazeSheetItem;
import net.mcreator.sylverspocketwatch.item.AlloyFluidItem;
import net.mcreator.sylverspocketwatch.SylversPocketwatchMod;

public class SylversPocketwatchModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, SylversPocketwatchMod.MODID);
	public static final RegistryObject<Item> NETHERITE_SHEET = REGISTRY.register("netherite_sheet", () -> new NetheriteSheetItem());
	public static final RegistryObject<Item> BLAZE_SHEET = REGISTRY.register("blaze_sheet", () -> new BlazeSheetItem());
	public static final RegistryObject<Item> METAL_SLURDGE_BUCKET = REGISTRY.register("metal_slurdge_bucket", () -> new AlloyFluidItem());
	public static final RegistryObject<Item> BLAZE_STEEL_ARMOR_HELMET = REGISTRY.register("blaze_steel_armor_helmet", () -> new BlazeSteelArmorItem.Helmet());
	public static final RegistryObject<Item> BLAZE_STEEL_ARMOR_CHESTPLATE = REGISTRY.register("blaze_steel_armor_chestplate", () -> new BlazeSteelArmorItem.Chestplate());
	public static final RegistryObject<Item> BLAZE_STEEL_ARMOR_LEGGINGS = REGISTRY.register("blaze_steel_armor_leggings", () -> new BlazeSteelArmorItem.Leggings());
	public static final RegistryObject<Item> BLAZE_STEEL_ARMOR_BOOTS = REGISTRY.register("blaze_steel_armor_boots", () -> new BlazeSteelArmorItem.Boots());
	public static final RegistryObject<Item> BRITTLE_MAGMA = block(SylversPocketwatchModBlocks.BRITTLE_MAGMA);

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}

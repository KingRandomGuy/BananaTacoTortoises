package com.tortoise.taco.banana.energymod;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemSeedFood;
import net.minecraft.item.ItemSeeds;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.LanguageRegistry;
import net.minecraftforge.oredict.OreDictionary;


@Mod(modid = EnergyPlusPlusPlus_Main.modid, name = "EnergyPlusPlusPlus", version = "alpha")

public class EnergyPlusPlusPlus_Main {
	public static final String modid = "bananatacotortoise_energyplusplusplus";
	//public static CreativeTabs currycraft;
	//public static Block turmericBlock;
	//public static ItemStack knife;
	@EventHandler
	public void preInit(FMLPreInitializationEvent e)
	{
		//Basic Setup
		//knife = new ItemStack(itemKnife, 1, OreDictionary.WILDCARD_VALUE);
		//currycraft = new CreativeTabsCurryCraft(CreativeTabs.getNextID(), "CurryCraft");
		//pineappleBlock = new blockPineapple().setBlockName("Pineapple Block").setBlockTextureName(modid + ":" + "pineapple");
		//itemKnife = new ItemKnife().setUnlocalizedName("itemKnife").setTextureName(modid + ":" + "itemKnife").setCreativeTab(currycraft);;
		
		//Game Registry
		//GameRegistry.registerItem(itemTurmeric, itemTurmeric.getUnlocalizedName().substring(5));
		//GameRegistry.registerBlock(turmericBlock, turmericBlock.getUnlocalizedName().substring(5));
		
		//Recipes
		//GameRegistry.addShapelessRecipe(new ItemStack(itemPineappleSeed, 2), new ItemStack(itemKnife, 1, OreDictionary.WILDCARD_VALUE), itemPineapple);
		//GameRegistry.addShapelessRecipe(new ItemStack(masalaPowder, 2), new ItemStack(itemKnife, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(itemTurmeric));
		//GameRegistry.addRecipe(new ItemStack(itemKnife),new Object[]{"   "," x "," z ", 'x', Blocks.cobblestone, 'z', Items.stick});
		//GameRegistry.addSmelting(wetNoodles, new ItemStack(curryFood), 1F);
		//GameRegistry.addSmelting(slicedPotato, new ItemStack(chips), 1F);
		//Language Registry
		//LanguageRegistry.addName(itemPineapple, "Pineapple");

		//Event Registry
		//MinecraftForge.EVENT_BUS.register(new CurryCraftEventHandler());
	}
}
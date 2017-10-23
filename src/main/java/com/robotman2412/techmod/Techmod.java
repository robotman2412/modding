package com.robotman2412.techmod;

import java.util.List;

import com.robotman2412.techmod.item.TechArmor;


import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.event.world.WorldEvent;

@Mod(modid = "tech_mod", name = "RobotMan2412's Tech mod", version = "0.1.5")
public class Techmod {
	
	@SidedProxy(clientSide="com.robotman2412.techmod.ClientProxy", serverSide="com.robotman2412.techmod.ServerProxy")
	public static CommonProxy proxy;

	public static Item techHelmet;//getable dis
	public static Item techChestplate;//getable dis
	public static Item techLeggings;//getable dis
	public static Item techBoots;//getable dis
	
	public static Item holoProj_1;//getable dis
	public static Item holoProj_2;//getable dis
	public static Item holoProj_3;//getable dis
	public static Item greyTin;
	public static Item tinNugget;
	public static Item tinIngot;
	public static Item siliconDioxide;
	public static Item siliconPure;//getable dis
	public static Item siliconIngot;//getable dis
	public static Item siliconDisk;//getable dis
	public static Item emptyPCB;
	public static Item emptyPCBHC;
	public static Item etchedPCB;//functional dis
	public static Item etchedPCBHC;//functional dis
	public static Item processedPCB;//functional dis
	public static Item processedPCBHC;//functional dis
	public static Item finishedPCB;//functional dis
	public static Item finishedPCBLC;//functional dis
	public static Item finishedPCBHC;//functional dis
	public static Item etchedSiliconDisk;//getable dis
	public static Item etchedSilicon;//getable dis
	public static Item ICDIP;//getable dis
	public static Item ICPLCC;//getable dis
	public static Item ICQFP;//getable dis
	public static Item carryDIP;//getable dis
	public static Item carryPLCC;//getable dis
	public static Item insertDIP;//getable dis
	public static Item insertPLCC;//getable dis
	public static Item contactDIP;//getable dis
	public static Item contactSMD;//getable dis
	public static Item contactPLCC;//getable dis
	public static Item contactF;//getable dis
	public static Item contactFTM;//getable dis
	public static Item contactM;//getable dis
	
	public static Item AKI;
	
	public static Block trainWarn;//implemodel dis
	
	public static Block projectBench;//rotatablu und functional dis
	
	public static Block poorTinOre;
	public static Block richTinOre;
	public static Block greyTinOre;
	public static Block TinOre;
	public static Block SiliconOre;
	
	public static Block project_1;//functional dis
	public static Block project_2;//functional dis
	public static Block project_3;//functional dis
	
	QualityHandler quality = new QualityHandler();
	
	
	public static ItemArmor.ArmorMaterial techArmorMaterial = EnumHelper.addArmorMaterial("techArmorMaterial", 7500, new int[]{25, 40, 35, 30}, 30);
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		proxy.preInit(event);
		
		techHelmet = new TechArmor(techArmorMaterial, 0, 0, tabTechMod);
		techChestplate = new TechArmor(techArmorMaterial, 0, 1, tabTechMod);
		techLeggings = new TechArmor(techArmorMaterial, 0, 2, tabTechMod);
		techBoots = new TechArmor(techArmorMaterial, 0, 3, tabTechMod);
		
		holoProj_1 = new HoloProj(1, tabTechMod);
		holoProj_2 = new HoloProj(2, tabTechMod);
		holoProj_3 = new HoloProj(3, tabTechMod);
		tinNugget = new TinNugget(tabTechMod);
		tinIngot = new TinIngot(tabTechMod);
		greyTin = new GreyTin(tabTechMod);
		siliconDioxide = new SiliconDioxide(tabTechMod);
		siliconPure = new SiliconPure(tabTechMod);
		siliconIngot = new SiliconIngot(tabTechMod);
		siliconDisk = new SiliconDisk(tabTechMod);
		etchedSiliconDisk = new Silicon(false, tabTechMod);
		etchedSilicon = new Silicon(true, tabTechMod);
		ICDIP = new IC(1, tabTechMod);
		ICPLCC = new IC(2, tabTechMod);
		ICQFP = new IC(3, tabTechMod);
		carryDIP = new Carrier(false, false, tabTechMod, quality);
		carryPLCC = new Carrier(true, false, tabTechMod, quality);
		insertDIP = new Carrier(false, true, tabTechMod, quality);
		insertPLCC = new Carrier(true, true, tabTechMod, quality);
		emptyPCB = new PCB(0, tabTechMod);
		etchedPCB = new PCB(1, tabTechMod);
		processedPCB = new PCB(2, tabTechMod);
		finishedPCB = new PCB(3, tabTechMod);
		finishedPCBLC = new PCB(4, tabTechMod);
		emptyPCBHC = new PCB(5, tabTechMod);
		etchedPCBHC = new PCB(6, tabTechMod);
		processedPCBHC = new PCB(7, tabTechMod);
		finishedPCBHC = new PCB(8, tabTechMod);
		contactDIP = new Contact(0, tabTechMod, quality);
		contactSMD = new Contact(1, tabTechMod, quality);
		contactPLCC = new Contact(2, tabTechMod, quality);
		contactF = new Contact(3, tabTechMod, quality);
		contactFTM = new Contact(4, tabTechMod, quality);
		contactM = new Contact(5, tabTechMod, quality);
		
		AKI = new AKI(tabTechModTrains);
		trainWarn = new TrainWarn(tabTechModTrains);
		
		projectBench = new Bench(tabTechMod);

		poorTinOre = new TinOre(1, tinNugget, 1, 3, tabTechMod);
		TinOre = new TinOre(2, tinNugget, 4, 6, tabTechMod);
		richTinOre = new TinOre(3, tinNugget, 7, 12, tabTechMod);
		greyTinOre = new TinOre(4, greyTin, 1, 4, tabTechMod);
		SiliconOre = new SiliconOre(siliconDioxide, 2, 4, tabTechMod);
		
		project_1 = new Project(1, tabTechMod);
		project_2 = new Project(2, tabTechMod);
		project_3 = new Project(3, tabTechMod);
		
		GameRegistry.addSmelting(greyTin, new ItemStack(tinNugget, 3), 0.5F);
		GameRegistry.registerWorldGenerator(new OreGeneration(), 0);
		
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.init(event);
		
//		GameRegistry.addRecipe(new ItemStack(template, num), new Object[]{
//				"   ",
//				"   ",
//				"   ",
//				'T', template,
//				'T', template,
//			});
		GameRegistry.addRecipe(new ItemStack(project_1, 1), new Object[]{
				"GDG",
				"IRI",
				"IRI",
				'G', Blocks.glass,
				'I', Blocks.iron_block,
				'R', Items.redstone,
				'D', holoProj_1
			});
		GameRegistry.addRecipe(new ItemStack(project_2, 1), new Object[]{
				"GDG",
				"IRI",
				"IRI",
				'G', Blocks.glass,
				'I', Blocks.iron_block,
				'R', Items.redstone,
				'D', holoProj_2
			});
		GameRegistry.addRecipe(new ItemStack(project_3, 1), new Object[]{
				"GDG",
				"IRI",
				"IRI",
				'G', Blocks.glass,
				'I', Blocks.iron_block,
				'R', Items.redstone,
				'D', holoProj_3
			});
		GameRegistry.addRecipe(new ItemStack(tinIngot, 1), new Object[]{
				"NNN",
				"NNN",
				"NNN",
				'N', tinNugget,
			});
		GameRegistry.addShapelessRecipe(new ItemStack(tinNugget, 9), new Object[]{tinIngot}); //sum randomz errorsz
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		proxy.postInit(event);
	}
	
	public static CreativeTabs tabTechModTrains = new CreativeTabs("tabTechModTrains") {
		
		@Override
		public Item getTabIconItem() {
			return new ItemStack(AKI).getItem();
		}
		
	};
	
	public static CreativeTabs tabTechMod = new CreativeTabs("tabTechMod") {
		
		@Override
		public Item getTabIconItem() {
			return new ItemStack(holoProj_3).getItem();
		}
		
	};
	
}

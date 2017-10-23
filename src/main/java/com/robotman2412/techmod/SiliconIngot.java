package com.robotman2412.techmod;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class SiliconIngot extends Item {
	
	public SiliconIngot(CreativeTabs tab) {
		this.setUnlocalizedName("silicon_ingot");
		this.setTextureName("tech_mod:silicon_ingot");
		this.setCreativeTab(tab);
		GameRegistry.registerItem(this, this.getUnlocalizedName().substring(5));
	}
	
}

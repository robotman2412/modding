package com.robotman2412.techmod;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class SiliconDioxide extends Item {
	
	public SiliconDioxide(CreativeTabs tab) {
		this.setUnlocalizedName("silicon_dioxide");
		this.setTextureName("tech_mod:silicon_dioxide");
		this.setCreativeTab(tab);
		GameRegistry.registerItem(this, this.getUnlocalizedName().substring(5));
	}
	
}

package com.robotman2412.techmod;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class GreyTin extends Item {
	
	protected GreyTin(CreativeTabs tab) {
		this.setUnlocalizedName("tin_grey");
		this.setTextureName("tech_mod:grey_tin");
		this.setCreativeTab(tab);
		GameRegistry.registerItem(this, this.getUnlocalizedName().substring(5));
	}
	
}

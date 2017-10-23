package com.robotman2412.techmod;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TinIngot extends Item {
	
	protected TinIngot(CreativeTabs tab) {
		this.setUnlocalizedName("tin_ingot");
		this.setTextureName("tech_mod:tin_ingot");
		this.setCreativeTab(tab);
		GameRegistry.registerItem(this, this.getUnlocalizedName().substring(5));
	}
	
}

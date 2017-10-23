package com.robotman2412.techmod;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class IC extends Item {
	
	int num;
	
	protected IC(int n, CreativeTabs tab) {
		num = n;
		this.setUnlocalizedName("IC_" + num);
		this.setTextureName("tech_mod:IC_" + num);
		this.setCreativeTab(tab);
		this.setMaxStackSize(1);
		GameRegistry.registerItem(this, this.getUnlocalizedName().substring(5));
	}
	
}

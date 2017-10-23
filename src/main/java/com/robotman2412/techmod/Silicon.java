package com.robotman2412.techmod;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Silicon extends Item {
	
	boolean chip;
	
	protected Silicon(boolean c, CreativeTabs tab) {
		chip = c;
		String add = "etched_disk";
		if (chip) {
			add = "etched";
			this.setMaxStackSize(1);
		}
		this.setUnlocalizedName("silicon_" + add);
		this.setTextureName("tech_mod:silicon_" + add);
		this.setCreativeTab(tab);
		GameRegistry.registerItem(this, this.getUnlocalizedName().substring(5));
	}
	
}

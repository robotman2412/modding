package com.robotman2412.techmod;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class SiliconDisk extends Item {
	
	public SiliconDisk(CreativeTabs tab) {
		this.setUnlocalizedName("silicon_disk");
		this.setTextureName("tech_mod:silicon_disk");
		this.setCreativeTab(tab);
		GameRegistry.registerItem(this, this.getUnlocalizedName().substring(5));
	}
	
}

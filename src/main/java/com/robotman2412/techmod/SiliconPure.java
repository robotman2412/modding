package com.robotman2412.techmod;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class SiliconPure extends Item {

	public SiliconPure(CreativeTabs tab) {
		this.setUnlocalizedName("silicon_pure");
		this.setTextureName("tech_mod:silicon_pure");
		this.setCreativeTab(tab);
		GameRegistry.registerItem(this, this.getUnlocalizedName().substring(5));
	}

}

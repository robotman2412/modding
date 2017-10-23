package com.robotman2412.techmod;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TinNugget extends Item {
	protected TinNugget(CreativeTabs tab) {
		this.setUnlocalizedName("tin_nugget");
		this.setTextureName("tech_mod:tin_nugget");
		this.setCreativeTab(tab);
		GameRegistry.registerItem(this, this.getUnlocalizedName().substring(5));
	}
}

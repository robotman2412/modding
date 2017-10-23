package com.robotman2412.techmod;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class PCB extends Item {
	
	int stage;

	public PCB(int stage, CreativeTabs tab) {
		String[] stagelib = {"", "_etched", "_processed", "_finished", "_finished_LC", "_HC", "_etched_HC", "_processed_HC", "_finished_HC"};
		this.setUnlocalizedName("PCB" + stagelib[stage]);
		this.setCreativeTab(tab);
		this.setTextureName("tech_mod:PCB" + stagelib[stage]);
		GameRegistry.registerItem(this, this.getUnlocalizedName().substring(5));
	}

}

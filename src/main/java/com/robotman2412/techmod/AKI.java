package com.robotman2412.techmod;

import java.util.List;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class AKI extends Item {
	
	public AKI(CreativeTabs tab) {
		this.setUnlocalizedName("aki");
		this.setTextureName("tech_mod:icon_aki_anim");
		this.setCreativeTab(tab);
		GameRegistry.registerItem(this, this.getUnlocalizedName().substring(5));
	}
	
	@Override
	public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean par4) {
		list.add("This is handy for ungaurded railroad crossings.");
	}
	
}

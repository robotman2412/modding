package com.robotman2412.techmod;

import java.util.List;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class HoloProj extends Item {
	
	int num;
	
	protected HoloProj(int n, CreativeTabs tab) {
		num = n;
		this.setUnlocalizedName("project_" + num);
		this.setTextureName("tech_mod:hologram_projector_" + num);
		this.setCreativeTab(tab);
		GameRegistry.registerItem(this, this.getUnlocalizedName().substring(5));
	}
	
	@Override
	public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean par4) {
		String[] LList = {"Primitive", "Mediate", "Advanced"};
		list.add(LList[num - 1] + " projector.");
		list.add("this can be used for making");
		list.add("hologram projectors");
	}
	
}

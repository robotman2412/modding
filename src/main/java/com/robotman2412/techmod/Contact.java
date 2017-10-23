package com.robotman2412.techmod;

import java.util.List;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

public class Contact extends Item {
	
	int type;
	QualityHandler quality;
	
	public Contact(int t, CreativeTabs tab, QualityHandler q) {
		quality = q;
		type = t;
		String[] addlib = {"DIP", "SMD", "PLCC", "F", "FTM", "M"};
		String add = addlib[type];
		this.setUnlocalizedName("contact_" + add);
		this.setTextureName("tech_mod:contact_" + add);
		this.setCreativeTab(tab);
		GameRegistry.registerItem(this, this.getUnlocalizedName().substring(5));
	}
	
	@Override
	public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean par4) {
		if (type == 0) {
			list.add("DIP contact pin");
			list.add("Required for making DIP IC\'s");
		}
		if (type == 1) {
			list.add("SMD contact pin");
			list.add("Required for making SMD IC\'s");
			list.add("That includes QFP");
		}
		if (type == 2) {
			list.add("PLCC contact");
			list.add("Required for making PLCC IC\'s");
		}
		if (type == 3) {
			list.add("Female pin");
			list.add("Used in things as:");
			list.add("Female PCB header");
			list.add("Female to female experiment board wire");
			list.add("Female to male experiment board wire");
		}
		if (type == 4) {
			list.add("Female to male pin");
			list.add("Used in things as:");
			list.add("Female to male PCB header");
		}
		if (type == 5) {
			list.add("Male pin");
			list.add("Used in things as:");
			list.add("Male PCB header");
			list.add("Male to male experiment board wires");
			list.add("Female to male experiment board wires");
		}
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {
		NBTTagCompound NBT = stack.getTagCompound();
		if (NBT == null) {
			NBT = new NBTTagCompound();
		}
		NBT = quality.verifyNBT(NBT, quality.NBT.STR_contact);
		stack.setTagCompound(NBT);
		return stack;
	}
	
}

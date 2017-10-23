package com.robotman2412.techmod;

import java.util.List;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.nbt.NBTTagString;
import net.minecraft.world.World;

public class Carrier extends Item {
	
	boolean isPLCC;
	boolean isInserted;
	QualityHandler quality;
	
	protected Carrier(boolean i, boolean c, CreativeTabs tab, QualityHandler q) {
		quality = q;
		isPLCC = i;
		isInserted = c;
		String add = "DIP";
		String type = "carrier";
		if (isPLCC) add = "PLCC";
		if (isInserted) type = "insert";
		this.setUnlocalizedName(type + "_" + add);
		this.setTextureName("tech_mod:" + type + "_" + add);
		this.setCreativeTab(tab);
		GameRegistry.registerItem(this, this.getUnlocalizedName().substring(5));
	}
	
	@Override
	public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean par4) {
		if (!isInserted) {
			if (isPLCC) {
				list.add("socket for PLCC IC's");
				list.add("required for mounting on PCB.");
			}
			else
			{
				list.add("socket for DIP IC's");
				list.add("OPTIONAL but gives the freedom of");
				list.add("being able to salvage it later.");
			}
		}
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {
		NBTTagCompound NBT = stack.getTagCompound();
		if (NBT == null) {
			NBT = new NBTTagCompound();
		}
		if (isInserted) NBT = quality.verifyNBT(NBT, quality.NBT.STR_insert);
		else NBT = quality.verifyNBT(NBT, quality.NBT.STR_carry);
		stack.setTagCompound(NBT);
		return stack;
	}
	
}

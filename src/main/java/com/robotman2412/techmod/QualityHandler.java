package com.robotman2412.techmod;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.nbt.NBTTagString;

public class QualityHandler {
	
	public static TechNBTStructure NBT = new TechNBTStructure();
	
	public QualityHandler() {
		
	}
	
	public String getStars(float quality) {
		char blank_star = '\u2606';
		char full_star = '\u2605';
		StringBuilder stars = new StringBuilder();
		for (int i = 1; i < 6; i ++) {
			if (quality / 2 >= i) stars.append(full_star);
			else stars.append(blank_star);
		}
		return stars.toString();
	}
	
	public NBTTagCompound verifyNBT(NBTTagCompound verify, int structure) {
		switch(structure) {
			case(0):
				return NBTCarry(verify);
			case(1):
				return NBTInsert(verify);
			case(2):
				return NBTContact(verify);
		}
		return verify;
	}
	
	NBTTagCompound NBTContact(NBTTagCompound verify) {
		NBTTagCompound techNBT = verify.getCompoundTag("techNBT");
		NBTTagCompound qualityNBT = techNBT.getCompoundTag("qualityNBT");
		NBTTagCompound displayNBT = verify.getCompoundTag("display");
		boolean correct;
		if (correct = verify.hasKey("techNBT")) System.out.println("found techNBT");
		if (correct &= techNBT.hasKey("qualityNBT")) System.out.println("found qualityNBT");
		if (correct &= qualityNBT.hasKey("plastic")) System.out.println("found metal");
		if (correct &= qualityNBT.hasKey("mold")) System.out.println("found mold");
		if (correct &= qualityNBT.hasKey("average")) System.out.println("found average");
		if (!correct){
			System.out.println("corrupt NBT!");
			if (!qualityNBT.hasKey("metal")) qualityNBT.setFloat("metal", 10f);
			if (!qualityNBT.hasKey("mold")) qualityNBT.setFloat("mold", 10f);
			float avg = 0;
			avg += qualityNBT.getFloat("metal");
			avg += qualityNBT.getFloat("mold");
			avg /= 2;
			qualityNBT.setFloat("average", avg);
			techNBT.setTag("qualityNBT", qualityNBT);
			verify.setTag("techNBT", techNBT);
			System.out.println("fixed corrupt NBT!");
		}
		NBTTagList lore = new NBTTagList();
		NBTTagString line1 = new NBTTagString("§fQuality:");
		NBTTagString line2 = new NBTTagString("§e" + getStars(qualityNBT.getFloat("metal")) + "§f for: metal");
		NBTTagString line3 = new NBTTagString("§e" + getStars(qualityNBT.getFloat("mold")) + "§f for: mold");
		NBTTagString line4 = new NBTTagString("§e" + getStars(qualityNBT.getFloat("average")) + "§f for: average");
		lore.appendTag(line1);
		lore.appendTag(line2);
		lore.appendTag(line3);
		lore.appendTag(line4);
		displayNBT.setTag("Lore", lore);
		verify.setTag("display", displayNBT);
		return verify;
	}
	
	NBTTagCompound NBTCarry(NBTTagCompound verify) {
		NBTTagCompound techNBT = verify.getCompoundTag("techNBT");
		NBTTagCompound qualityNBT = techNBT.getCompoundTag("qualityNBT");
		NBTTagCompound displayNBT = verify.getCompoundTag("display");
		boolean correct;
		if (correct = verify.hasKey("techNBT")) System.out.println("found techNBT");
		if (correct &= techNBT.hasKey("qualityNBT")) System.out.println("found qualityNBT");
		if (correct &= qualityNBT.hasKey("contact")) System.out.println("found contact");
		if (correct &= qualityNBT.hasKey("plastic")) System.out.println("found plastic");
		if (correct &= qualityNBT.hasKey("mold")) System.out.println("found mold");
		if (correct &= qualityNBT.hasKey("average")) System.out.println("found average");
		if (!correct){
			System.out.println("corrupt NBT!");
			if (!qualityNBT.hasKey("contact")) qualityNBT.setFloat("contact", 10f);
			if (!qualityNBT.hasKey("plastic")) qualityNBT.setFloat("plastic", 10f);
			if (!qualityNBT.hasKey("mold")) qualityNBT.setFloat("mold", 10f);
			float avg = 0;
			avg += qualityNBT.getFloat("contact");
			avg += qualityNBT.getFloat("plastic");
			avg += qualityNBT.getFloat("mold");
			avg /= 3;
			qualityNBT.setFloat("average", avg);
			techNBT.setTag("qualityNBT", qualityNBT);
			verify.setTag("techNBT", techNBT);
			System.out.println("fixed corrupt NBT!");
		}
		NBTTagList lore = new NBTTagList();
		NBTTagString line1 = new NBTTagString("§fQuality:");
		NBTTagString line2 = new NBTTagString("§e" + getStars(qualityNBT.getFloat("contact")) + "§f for: contact");
		NBTTagString line3 = new NBTTagString("§e" + getStars(qualityNBT.getFloat("plastic")) + "§f for: plastic");
		NBTTagString line4 = new NBTTagString("§e" + getStars(qualityNBT.getFloat("mold")) + "§f for: mold");
		NBTTagString line5 = new NBTTagString("§e" + getStars(qualityNBT.getFloat("average")) + "§f for: average");
		lore.appendTag(line1);
		lore.appendTag(line2);
		lore.appendTag(line3);
		lore.appendTag(line4);
		lore.appendTag(line5);
		displayNBT.setTag("Lore", lore);
		verify.setTag("display", displayNBT);
		return verify;
	}
	
	NBTTagCompound NBTInsert(NBTTagCompound verify) {
		NBTTagCompound techNBT = verify.getCompoundTag("techNBT");
		NBTTagCompound qualityNBT = techNBT.getCompoundTag("qualityNBT");
		NBTTagCompound displayNBT = verify.getCompoundTag("display");
		boolean correct;
		if (correct = verify.hasKey("techNBT")) System.out.println("found techNBT");
		if (correct &= techNBT.hasKey("qualityNBT")) System.out.println("found qualityNBT");
		if (correct &= qualityNBT.hasKey("contact")) System.out.println("found contact");
		if (correct &= qualityNBT.hasKey("plastic")) System.out.println("found plastic");
		if (correct &= qualityNBT.hasKey("mold")) System.out.println("found mold");
		if (correct &= qualityNBT.hasKey("average")) System.out.println("found average");
		if (correct &= qualityNBT.hasKey("ICcontact")) System.out.println("found IC contact");
		if (correct &= qualityNBT.hasKey("ICplastic")) System.out.println("found IC plastic");
		if (correct &= qualityNBT.hasKey("ICmold")) System.out.println("found IC mold");
		if (correct &= qualityNBT.hasKey("ICaverage")) System.out.println("found IC average");
		if (correct &= qualityNBT.hasKey("ICsilicon")) System.out.println("found IC silicon");
		if (correct &= qualityNBT.hasKey("ICprint")) System.out.println("found IC print");
		if (!correct){
			System.out.println("corrupt NBT!");
			if (!qualityNBT.hasKey("contact")) qualityNBT.setFloat("contact", 10f);
			if (!qualityNBT.hasKey("plastic")) qualityNBT.setFloat("plastic", 10f);
			if (!qualityNBT.hasKey("mold")) qualityNBT.setFloat("mold", 10f);
			if (!qualityNBT.hasKey("ICcontact")) qualityNBT.setFloat("ICcontact", 10f);
			if (!qualityNBT.hasKey("ICplastic")) qualityNBT.setFloat("ICplastic", 10f);
			if (!qualityNBT.hasKey("ICmold")) qualityNBT.setFloat("ICmold", 10f);
			if (!qualityNBT.hasKey("ICaverage")) qualityNBT.setFloat("ICaverage", 10f);
			if (!qualityNBT.hasKey("ICsilicon")) qualityNBT.setFloat("ICsilicon", 10f);
			if (!qualityNBT.hasKey("ICprint")) qualityNBT.setFloat("ICprint", 10f);
			float avg = 0;
			avg += qualityNBT.getFloat("contact");
			avg += qualityNBT.getFloat("plastic");
			avg += qualityNBT.getFloat("mold");
			avg /= 3;
			qualityNBT.setFloat("average", avg);
			techNBT.setTag("qualityNBT", qualityNBT);
			verify.setTag("techNBT", techNBT);
			System.out.println("fixed corrupt NBT!");
		}
		NBTTagList lore = new NBTTagList();
		NBTTagString line1 = new NBTTagString("§fQuality:");
		NBTTagString line2 = new NBTTagString("§fSocket:");
		NBTTagString line3 = new NBTTagString("§e" + getStars(qualityNBT.getFloat("contact")) + "§f for: contact");
		NBTTagString line4 = new NBTTagString("§e" + getStars(qualityNBT.getFloat("plastic")) + "§f for: plastic");
		NBTTagString line5 = new NBTTagString("§e" + getStars(qualityNBT.getFloat("mold")) + "§f for: mold");
		NBTTagString line6 = new NBTTagString("§e" + getStars(qualityNBT.getFloat("average")) + "§f for: average");
		NBTTagString line7 = new NBTTagString("§fIC:");
		NBTTagString line8 = new NBTTagString("§e" + getStars(qualityNBT.getFloat("ICcontact")) + "§f for: contact");
		NBTTagString line9 = new NBTTagString("§e" + getStars(qualityNBT.getFloat("ICplastic")) + "§f for: plastic");
		NBTTagString line10 = new NBTTagString("§e" + getStars(qualityNBT.getFloat("ICmold")) + "§f for: mold");
		NBTTagString line11 = new NBTTagString("§e" + getStars(qualityNBT.getFloat("ICsilicon")) + "§f for: silicon");
		NBTTagString line12 = new NBTTagString("§e" + getStars(qualityNBT.getFloat("ICprint")) + "§f for: print");
		NBTTagString line13 = new NBTTagString("§e" + getStars(qualityNBT.getFloat("ICaverage")) + "§f for: average");
		lore.appendTag(line1);
		lore.appendTag(line2);
		lore.appendTag(line3);
		lore.appendTag(line4);
		lore.appendTag(line5);
		lore.appendTag(line6);
		lore.appendTag(line7);
		lore.appendTag(line8);
		lore.appendTag(line9);
		lore.appendTag(line10);
		lore.appendTag(line11);
		lore.appendTag(line12);
		lore.appendTag(line13);
		displayNBT.setTag("Lore", lore);
		verify.setTag("display", displayNBT);
		return verify;
	}
	
}

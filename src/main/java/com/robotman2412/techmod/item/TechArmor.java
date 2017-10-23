package com.robotman2412.techmod.item;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class TechArmor extends ItemArmor {

	public TechArmor(ArmorMaterial material, int renderInd, int armorType, CreativeTabs tab) {
		super(material, renderInd, armorType);
		String[] nameLib = {"helmet", "chest", "leggings", "boots"};
		this.setUnlocalizedName("tech_" + nameLib[armorType]);
		this.setTextureName("tech_mod:tech_" + nameLib[armorType]);
		this.setCreativeTab(tab);
		GameRegistry.registerItem(this, this.getUnlocalizedName().substring(5));
	}
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		if (this.armorType == 2) return "tech_mod:textures/models/armor/tech_layer_2.png";
		else return "tech_mod:textures/models/armor/tech_layer_1.png";
	}
	
}

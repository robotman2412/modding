package com.robotman2412.techmod;

import java.util.Random;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TinOre extends Block {
	
	Item drop;
	int minDrop;
	int maxDrop;
	
	int num;
	
	protected TinOre(int n, Item dr, int mind, int maxd, CreativeTabs tab) {
		super(Material.rock);
		num = n;
		drop = dr;
		minDrop = mind;
		maxDrop = maxd + 1;
		this.setBlockName("tin_ore_" + num);
		this.setBlockTextureName("tech_mod:tin_ore_" + num);
		this.setCreativeTab(tab);
		this.setHardness(2.5F);
		this.setHarvestLevel("pickaxe", 0);
		GameRegistry.registerBlock(this, this.getUnlocalizedName().substring(5));
	}
	
	@Override
	public Item getItemDropped(int meta, Random random, int fortune) {
		return drop;
	}
	
	@Override
	public int damageDropped(int meta) {
		return 0;
	}
	
	@Override
	public int quantityDropped(int meta, int fortune, Random random) {
		if (fortune >= 1) {
			return maxDrop;
		}
		else
		{
			return minDrop + random.nextInt(maxDrop - minDrop);
		}
	}
	
}

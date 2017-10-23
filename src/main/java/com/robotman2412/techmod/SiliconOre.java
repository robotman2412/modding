package com.robotman2412.techmod;

import java.util.ArrayList;
import java.util.Random;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class SiliconOre extends Block {

	Item drop;
	int minDrop;
	int maxDrop;
	
	protected SiliconOre(Item dr, int mind, int maxd, CreativeTabs tab) {
		super(Material.rock);
		minDrop = mind;
		maxDrop = maxd;
		drop = dr;
		this.setBlockTextureName("tech_mod:silicon_ore");
		this.setBlockName("silicon_ore");
		this.setCreativeTab(tab);
		this.setHardness(1F);
		this.setHarvestLevel("pickaxe", 0);
		GameRegistry.registerBlock(this, this.getUnlocalizedName().substring(5));
	}
	
	@Override
	public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune) {
		ArrayList<ItemStack> drops = new ArrayList<ItemStack>();
		drops.add(new ItemStack(drop, minDrop + (world.rand.nextInt(maxDrop - minDrop) + 1)));
		drops.add(new ItemStack(Blocks.stone, 1));
		return drops;
	}
	
}

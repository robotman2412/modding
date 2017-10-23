package com.robotman2412.techmod;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class TrainWarn extends Block {

	public TrainWarn(CreativeTabs tab) {
		super(Material.iron);
		this.setBlockName("train_warn");
		this.setCreativeTab(tab);
		GameRegistry.registerBlock(this, this.getUnlocalizedName().substring(5));
	}
	
	@Override
	public boolean renderAsNormalBlock() {
		return false;
	}
	
	@Override
	public int getRenderType(){
		return -1;
	}
	
	@Override
	public boolean isOpaqueCube() {
		return false;
	}
	
	@Override
	public TileEntity createTileEntity(World world, int par2) {
		return new TileEntityTrainWarn(0);
	}

}

package com.robotman2412.techmod;

import cpw.mods.fml.common.registry.GameRegistry;
import javafx.scene.control.ToolBar;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import paulscode.sound.Vector3D;

public class Project extends Block {

	public IIcon icon_top;
	public IIcon icon_bottom;
	public IIcon icon_side;
	int num;
	
	protected Project(int n, CreativeTabs tab) {
		super(Material.anvil);
		num = n;
		this.setBlockName("holo_project_" + num);
		this.setBlockTextureName("tech_mod:project_" + num + "_top");
		this.setCreativeTab(tab);
		this.setHardness(2.5F);
		this.setHarvestLevel("pickaxe", 1);
		this.setLightLevel(1.0F);
		this.setStepSound(soundTypeGlass);
		GameRegistry.registerBlock(this, this.getUnlocalizedName().substring(5));
	}
	
	@Override
	public boolean isOpaqueCube() {
		return true;
	}
	
	@Override
	public void registerBlockIcons(IIconRegister reg) {
		this.icon_top = reg.registerIcon("tech_mod:project_" + num + "_top");
		this.icon_side = reg.registerIcon("tech_mod:project_side");
		this.icon_bottom = reg.registerIcon("tech_mod:project_bottom");
	}
	
	@Override
	public IIcon getIcon(int side, int meta) {
		if (side == 0) return this.icon_bottom;
		if (side == 1) return this.icon_top;
	    return this.icon_side;
	}
	
	@Override
	public boolean canConnectRedstone(IBlockAccess world, int x, int y, int z, int side) {
		if (side < 0 || side > 3) return false;
		return true;
	}
	
}

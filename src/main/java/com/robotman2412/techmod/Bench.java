package com.robotman2412.techmod;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class Bench extends Block {

	public IIcon icon_top;
	public IIcon icon_bottom;
	public IIcon icon_side;
	public IIcon icon_side_1;
	public IIcon icon_side_2;
	public IIcon icon_side_3;
	public IIcon icon_side_4;
	
	protected Bench(CreativeTabs tab) {
		super(Material.wood);
		this.setBlockName("project_bench");
		this.setBlockTextureName("tech_mod:project_bench_top");
		this.setCreativeTab(tab);
		this.setHardness(1F);
		GameRegistry.registerBlock(this, this.getUnlocalizedName().substring(5));
	}
	
	@Override
	public boolean isOpaqueCube() {
		return true;
	}
	
	@Override
	public void registerBlockIcons(IIconRegister reg) {
		icon_top = reg.registerIcon("tech_mod:project_bench_top");
		icon_side = reg.registerIcon("tech_mod:project_bench_side");
		icon_side_1 = reg.registerIcon("tech_mod:project_bench_side_1");
		icon_side_2 = reg.registerIcon("tech_mod:project_bench_side_2");
		icon_side_3 = reg.registerIcon("tech_mod:project_bench_side_3");
		icon_side_4 = reg.registerIcon("tech_mod:project_bench_side_4");
		icon_bottom = reg.registerIcon("tech_mod:project_bench_bottom");
	}
	
	@Override
	public IIcon getIcon(int side, int meta) {
		if (side == 0) return icon_bottom;
		if (side == 1) return icon_top;
		if (side == 2) return icon_side_1;
		if (side == 3) return icon_side_2;
		if (side == 4) return icon_side_3;
		if (side == 5) return icon_side_4;
	    return icon_side;
	}
	
	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int metadata, float sideX, float sideY, float sideZ) {
		if (!world.isRemote) Minecraft.getMinecraft().displayGuiScreen(new GUI_project_bench());
		return true;
	}
	
}

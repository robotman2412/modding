package com.robotman2412.techmod;


/**
 * @author Julian Scheffers
**/

/*
  RobotMan2412's tech mod © Julian Scheffers, all rights reserved.
*/


import com.robotman2412.techmod.blocks.ProjectBenchContainer;
import com.robotman2412.techmod.blocks.ProjectBenchGUI;
import com.robotman2412.techmod.blocks.ProjectBenchTileEnt;
import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class GuiHandler implements IGuiHandler {
    public static final int PROJECT_BENCH_GUI = 0;

    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        if (ID == PROJECT_BENCH_GUI) return new ProjectBenchContainer(player.inventory, (ProjectBenchTileEnt) world.getTileEntity(x, y, z));
        return null;
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        if (ID == PROJECT_BENCH_GUI) return new ProjectBenchGUI();
        return null;
    }
	
}

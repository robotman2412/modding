package com.robotman2412.techmod;


/**
 * @author Julian Scheffers
**/

/*
  RobotMan2412's tech mod © Julian Scheffers, all rights reserved.
*/


import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;

public class CommonProxy {

    public void preInit(FMLPreInitializationEvent e) {
    	
    }

    public void init(FMLInitializationEvent e) {
    	NetworkRegistry.INSTANCE.registerGuiHandler(Techmod.instance, new GuiHandler());
    }

    public void postInit(FMLPostInitializationEvent e) {
    	
    }
}

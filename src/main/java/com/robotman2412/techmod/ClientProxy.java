package com.robotman2412.techmod;

import com.robotman2412.techmod.blocks.RenderTileEntityTrainWarn;
import com.robotman2412.techmod.blocks.TileEntityTrainWarn;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

public class ClientProxy extends CommonProxy {

    @Override
    public void preInit(FMLPreInitializationEvent e) {
        super.preInit(e);
    	GameRegistry.registerTileEntity(TileEntityTrainWarn.class, "tileTrainWarn");
    	ClientRegistry.bindTileEntitySpecialRenderer(TileEntityTrainWarn.class, new RenderTileEntityTrainWarn());
    }

    @Override
    public void init(FMLInitializationEvent e) {
        super.init(e);
    }

    @Override
    public void postInit(FMLPostInitializationEvent e) {
        super.postInit(e);
    }

}

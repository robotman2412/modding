package com.robotman2412.techmod;

import net.minecraft.tileentity.TileEntity;

public class TileEntityTrainWarn extends TileEntity {
	
	public float rotation = 0;
	public float scale = 0;
	
	public TileEntityTrainWarn(int rot) {
		rotation = rot;
	}

	@Override
	public void updateEntity(){
		if (worldObj.isRemote) scale = 1f;
	}
}
package com.robotman2412.techmod;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;

public class RenderTileEntityTrainWarn extends TileEntitySpecialRenderer {
	
	ResourceLocation texture;
	ResourceLocation objModelLocation;
	IModelCustom model;
	
	public RenderTileEntityTrainWarn() {
		texture = new ResourceLocation("tech_mod", "models/train_warn.png");
		objModelLocation = new ResourceLocation("tech_mod", "models/trainwarn.obj");
		model = AdvancedModelLoader.loadModel(objModelLocation);
		//FIX DIS MMMMODDDDDLLLLLLLL CRAHPPPPPPPPPP!!!!!!!!!!!
	}

	@Override
	public void renderTileEntityAt(TileEntity tileEntity, double x, double y, double z, float timeSinceLastTick) {
		TileEntityTrainWarn entity = (TileEntityTrainWarn) tileEntity;
		float scale = entity.scale;
		float rotation = entity.rotation;
		bindTexture(texture);
		GL11.glPushMatrix();
		GL11.glTranslated(x + 0.5, x + 0.5, x + 0.5);
		GL11.glScalef(scale, scale, scale);
		GL11.glPushMatrix();
		GL11.glRotatef(rotation, 0F, 1F, 0.5F);
		model.renderAll();
		GL11.glPopMatrix();
		GL11.glPopMatrix();
	}
	
}

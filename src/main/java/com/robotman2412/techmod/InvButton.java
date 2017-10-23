package com.robotman2412.techmod;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;

public class InvButton extends GuiButton {

	public InvButton(int id, int x, int y, int width, int height, String text) {
		super(id, x, y, width, height, text);
	}

	public InvButton(int id, int x, int y, int width, int height) {
		super(id, x, y, width, height, "");
	}
	
	@Override
	public void drawButton(Minecraft p_146112_1_, int p_146112_2_, int p_146112_3_) {
		
	}
	
}

package com.robotman2412.techmod;

import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.SoundHandler;
import net.minecraft.client.gui.GuiButton;

public class InvButton extends GuiButton {
	
	boolean silent = false;

	public InvButton(int id, int x, int y, int width, int height, String text) {
		super(id, x, y, width, height, text);
	}

	public InvButton(int id, int x, int y, int width, int height, String text, boolean s) {
		super(id, x, y, width, height, text);
		silent = s;
	}

	public InvButton(int id, int x, int y, int width, int height, boolean s) {
		super(id, x, y, width, height, "");
		silent = s;
	}

	public InvButton(int id, int x, int y, int width, int height) {
		super(id, x, y, width, height, "");
	}
	
	public void setMuted(boolean s) {
		silent = s;
	}
	
	@Override
	public void drawButton(Minecraft p_146112_1_, int p_146112_2_, int p_146112_3_) {
		
	}
	
	@Override
	public void func_146113_a(SoundHandler sound) {
		if (!silent) {
			super.func_146113_a(sound);
		}
	}
	
}

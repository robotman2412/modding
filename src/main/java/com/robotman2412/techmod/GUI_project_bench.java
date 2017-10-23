package com.robotman2412.techmod;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.util.ResourceLocation;

public class GUI_project_bench extends GuiScreen {
	
	int guiWidth = 200;
	int guiHeight = 150;
	int guiX;
	int guiY;
	String[] info;
	int tab = 0;
	
	InvButton tabInfo;
	
	@Override
	public void drawScreen(int x, int y, float ticks) {
		int guiX = (width - guiWidth) / 2;
		int guiY = (height - guiHeight) / 2;
		String[] info = {"inventory: stores items", "tools: stores tools only", "craft: crafting grid"};
		mc.renderEngine.bindTexture(new ResourceLocation("tech_mod", "textures/gui/project_bench.png"));
		String name = "Project bench";
		String inf = "INFORMATION";
		GL11.glColor4f(1, 1, 1, 1);
		drawDefaultBackground();
		clear(guiX, guiY);
		switch (tab) {
		case(0):
			fontRendererObj.drawString("please select a tab", guiX + 17, guiY + 36, 0x000000);
			break;
		case(1)://info
			info(guiX, guiY, info);
			name += ": info";
			break;
		}
		fontRendererObj.drawString(inf, guiX + 113, guiY + 21, 0x000000);
		fontRendererObj.drawString(name, guiX + guiWidth / 2 - fontRendererObj.getStringWidth(name) / 2, guiY + 5, 0x000000);
		super.drawScreen(x, y, ticks);
	}
	
	@Override
	public void initGui() {
		int guiX = (width - guiWidth) / 2;
		int guiY = (height - guiHeight) / 2;
		tab = 1;
		String[] info = {"inventory: stores items", "tools: stores tools only", "craft: our crafting grid"};
		buttonList.clear();
		tabInfo = new InvButton(0, guiX + 99, guiY + 17, 82, 14);
		buttonList.add(tabInfo);
		super.initGui();
	}
	
	@Override
	protected void actionPerformed(GuiButton button) {
		switch(button.id) {
		case(0):
			tab = 1;
		}
		super.actionPerformed(button);
	}
	
	void clear(int guiX, int guiY) {
		drawTexturedModalRect(guiX, guiY, 0, 0, guiWidth, guiHeight);
	}
	
	void info(int guiX, int guiY, String[] info) {
		drawTexturedModalRect(guiX + 99, guiY + 30, 0, 185, 82, 4);
		for (int i = 0; i < info.length; i ++) {
			fontRendererObj.drawString(info[i], guiX + 17, guiY + 36 + i * 14, 0x000000);
		}
		for (int i = 0; i < 7; i ++) {
			drawTexturedModalRect(guiX + 4, guiY + 35 + i * 14, 0, 172, 12, 12);
		}
	}
	
}

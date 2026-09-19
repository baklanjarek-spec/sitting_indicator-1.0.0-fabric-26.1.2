package net.mcreator.sittingindicator.client.screens;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.resources.Identifier;
import net.minecraft.client.renderer.RenderPipelines;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.client.Minecraft;
import net.minecraft.client.DeltaTracker;

import net.mcreator.sittingindicator.procedures.StandingConditionBlaBlaProcedure;
import net.mcreator.sittingindicator.procedures.SittingConditionBlaBlaProcedure;

import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

@Environment(EnvType.CLIENT)
public class SittingiconOverlay {
	private static final Identifier IMAGE_0 = Identifier.parse("sitting_indicator:textures/screens/notsittingbig.png");
	private static final Identifier IMAGE_1 = Identifier.parse("sitting_indicator:textures/screens/sittingbig.png");

	public static void render(GuiGraphicsExtractor guiGraphics, DeltaTracker deltaTracker) {
		int w = guiGraphics.guiWidth();
		int h = guiGraphics.guiHeight();
		Level world = null;
		double x = 0;
		double y = 0;
		double z = 0;
		Player entity = Minecraft.getInstance().player;
		if (entity != null) {
			world = entity.level();
			x = entity.getX();
			y = entity.getY();
			z = entity.getZ();
		}
		if (true) {
			if (StandingConditionBlaBlaProcedure.execute(entity)) {
				guiGraphics.blit(RenderPipelines.GUI_TEXTURED, IMAGE_0, w / 2 + 92, h - 24, 0, 0, 20, 20, 20, 20);
			}
			if (SittingConditionBlaBlaProcedure.execute(entity)) {
				guiGraphics.blit(RenderPipelines.GUI_TEXTURED, IMAGE_1, w / 2 + 92, h - 24, 0, 0, 20, 20, 20, 20);
			}
		}
	}
}
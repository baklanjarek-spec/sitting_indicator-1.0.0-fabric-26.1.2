/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.sittingindicator.init;

import net.minecraft.resources.Identifier;

import net.mcreator.sittingindicator.client.screens.SittingiconOverlay;
import net.mcreator.sittingindicator.SittingIndicatorMod;

import net.fabricmc.fabric.api.client.rendering.v1.hud.VanillaHudElements;
import net.fabricmc.fabric.api.client.rendering.v1.hud.HudElementRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.hud.HudElement;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

@Environment(EnvType.CLIENT)
public class SittingIndicatorModOverlays {
	public static void clientLoad() {
		register("sittingicon", SittingiconOverlay::render);
	}

	private static void register(Identifier identifier, String registryname, HudElement element) {
		HudElementRegistry.attachElementAfter(identifier, Identifier.fromNamespaceAndPath(SittingIndicatorMod.MODID, registryname), element);
	}

	private static void register(String registryname, HudElement element) {
		register(VanillaHudElements.MISC_OVERLAYS, registryname, element);
	}
}
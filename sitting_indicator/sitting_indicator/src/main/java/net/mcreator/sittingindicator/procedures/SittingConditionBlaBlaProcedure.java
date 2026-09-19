package net.mcreator.sittingindicator.procedures;

import net.minecraft.world.entity.Entity;

public class SittingConditionBlaBlaProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return entity.isShiftKeyDown();
	}
}
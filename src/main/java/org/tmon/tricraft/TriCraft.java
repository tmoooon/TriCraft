package org.tmon.tricraft;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tmon.tricraft.block.ModBlocks;
import org.tmon.tricraft.item.ModItems;
import org.tmon.tricraft.world.gen.ModFeatures;

public class TriCraft implements ModInitializer {
	public static final String MOD_ID = "tricraft";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.register();
		ModBlocks.register();
		ModFeatures.register();
	}
}
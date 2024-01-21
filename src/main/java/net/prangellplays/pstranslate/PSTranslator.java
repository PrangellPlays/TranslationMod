package net.prangellplays.pstranslate;

import eu.midnightdust.lib.config.MidnightConfig;
import net.fabricmc.api.ModInitializer;

import net.minecraft.util.Identifier;
import net.prangellplays.pstranslate.config.ConfigUI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings("unused")
public class PSTranslator implements ModInitializer {
	public static final String MOD_ID = "pstranslate";
	public static final Logger LOGGER = LoggerFactory.getLogger("pstranslate");

	@Override
	public void onInitialize() {
		LOGGER.info("Plasmythic Studios Translator is Initializing...");
		MidnightConfig.init(MOD_ID, ConfigUI.class);
	}
	public static Identifier id(String path) {
		return new Identifier(MOD_ID, path);
	}
}
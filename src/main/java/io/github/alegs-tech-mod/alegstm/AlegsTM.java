package io.github.alegs-tech-mod.alegstm;

import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AlegsTM implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("Alegs Tech Mod");

    @Override
    public void onInitialize(ModContainer mod) {
        LOGGER.info("Hello Quilt world from {}! Stay fresh!", mod.metadata().name());
    }
}
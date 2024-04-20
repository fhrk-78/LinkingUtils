package net.harupiza.linkingutils.client;

import net.fabricmc.api.ClientModInitializer;
import net.harupiza.linkingutils.LinkingUtils;
import net.harupiza.linkingutils.hud.HudOverlay;

public class LinkingUtilsClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        LinkingUtils.LOGGER.info("Entry point: main loaded");

        HudOverlay.init();
    }
}

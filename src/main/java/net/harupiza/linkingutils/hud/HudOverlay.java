package net.harupiza.linkingutils.hud;

import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;

public class HudOverlay {
    public static void init() {
        HudRenderCallback.EVENT.register((drawContext, tickDelta) -> {
            //
        });
    }
}

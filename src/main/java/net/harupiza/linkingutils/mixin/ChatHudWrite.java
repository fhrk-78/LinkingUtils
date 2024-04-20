package net.harupiza.linkingutils.mixin;

import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.hud.ChatHud;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ChatHud.class)
public class ChatHudWrite {
    @Inject(method = "render(Lnet/minecraft/client/gui/DrawContext;III)V", at = @At("RETURN"))
    public void render(DrawContext context, int currentTick, int mouseX, int mouseY, CallbackInfo ci) {
        //
    }
}

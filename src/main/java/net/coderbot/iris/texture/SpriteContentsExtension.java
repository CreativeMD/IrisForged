package net.coderbot.iris.texture;

import org.jetbrains.annotations.Nullable;

import net.minecraft.client.renderer.texture.SpriteContents;

public interface SpriteContentsExtension {
    @Nullable
    SpriteContents.Ticker getCreatedTicker();
}

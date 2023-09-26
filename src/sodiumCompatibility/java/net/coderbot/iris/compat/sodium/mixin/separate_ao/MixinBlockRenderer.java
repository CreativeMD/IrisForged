package net.coderbot.iris.compat.sodium.mixin.separate_ao;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;

import me.jellysquid.mods.sodium.client.render.chunk.compile.pipeline.BlockRenderer;

/**
 * Allows vertex AO to be optionally passed in the alpha channel of the vertex color instead of being multiplied
 * through into the RGB values.
 */
@Mixin(BlockRenderer.class)
public class MixinBlockRenderer {
    @Unique
    private boolean useSeparateAo;
}

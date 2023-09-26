package net.coderbot.iris.compat.sodium.mixin.shader_overrides;

import org.spongepowered.asm.mixin.Mixin;

import me.jellysquid.mods.sodium.client.render.chunk.terrain.TerrainRenderPass;

@Mixin(TerrainRenderPass.class)
public class MixinBlockRenderPass {}

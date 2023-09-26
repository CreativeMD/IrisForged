package net.coderbot.batchedentityrendering.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.OutlineBufferSource;

@Mixin(OutlineBufferSource.class)
public interface OutlineBufferSourceAccessor {
	@Accessor
	MultiBufferSource.BufferSource getOutlineBufferSource();
}

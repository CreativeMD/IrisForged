package net.coderbot.batchedentityrendering.mixin;

import java.util.Map;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

import com.mojang.blaze3d.vertex.BufferBuilder;

import net.minecraft.client.renderer.ChunkBufferBuilderPack;
import net.minecraft.client.renderer.RenderType;

@Mixin(ChunkBufferBuilderPack.class)
public interface ChunkBufferBuilderPackAccessor {
    @Accessor
    Map<RenderType, BufferBuilder> getBuilders();
}

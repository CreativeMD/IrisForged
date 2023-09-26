package net.coderbot.iris.compat.sodium.mixin.separate_ao;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;

import me.jellysquid.mods.sodium.client.model.quad.ModelQuadView;
import me.jellysquid.mods.sodium.client.model.quad.properties.ModelQuadFacing;
import me.jellysquid.mods.sodium.client.render.chunk.compile.buffers.ChunkModelBuilder;
import me.jellysquid.mods.sodium.client.render.chunk.compile.pipeline.FluidRenderer;
import me.jellysquid.mods.sodium.client.render.chunk.terrain.material.Material;
import net.minecraft.core.BlockPos;

/** Basically the same as {@link MixinBlockRenderer}, but for fluid rendering. */
@Mixin(FluidRenderer.class)
public abstract class MixinFluidRenderer {
    private boolean flipNormal;
    
    @Shadow
    protected abstract void writeQuad(ChunkModelBuilder builder, Material material, BlockPos offset, ModelQuadView quad, ModelQuadFacing facing, boolean flip);
    
    @Unique
    private boolean useSeparateAo;
}

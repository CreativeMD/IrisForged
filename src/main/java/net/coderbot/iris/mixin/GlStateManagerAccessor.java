package net.coderbot.iris.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

import com.mojang.blaze3d.platform.GlStateManager;

@Mixin(GlStateManager.class)
public interface GlStateManagerAccessor {
    @Accessor("BLEND")
    static GlStateManager.BlendState getBLEND() {
        throw new UnsupportedOperationException("Not accessed");
    }
    
    @Accessor("COLOR_MASK")
    static GlStateManager.ColorMask getCOLOR_MASK() {
        throw new UnsupportedOperationException("Not accessed");
    }
    
    @Accessor("DEPTH")
    static GlStateManager.DepthState getDEPTH() {
        throw new UnsupportedOperationException("Not accessed");
    }
    
    @Accessor("activeTexture")
    static int getActiveTexture() {
        throw new UnsupportedOperationException("Not accessed");
    }
    
    @Accessor("TEXTURES")
    static GlStateManager.TextureState[] getTEXTURES() {
        throw new UnsupportedOperationException("Not accessed");
    }
}

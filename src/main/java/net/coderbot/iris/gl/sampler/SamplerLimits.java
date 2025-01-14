package net.coderbot.iris.gl.sampler;

import org.lwjgl.opengl.GL20C;
import org.lwjgl.opengl.GL45C;

import com.mojang.blaze3d.platform.GlStateManager;

import net.coderbot.iris.gl.IrisRenderSystem;

public class SamplerLimits {
    private final int maxTextureUnits;
    private final int maxDrawBuffers;
    private final int maxShaderStorageUnits;
    private static SamplerLimits instance;
    
    private SamplerLimits() {
        this.maxTextureUnits = GlStateManager._getInteger(GL20C.GL_MAX_TEXTURE_IMAGE_UNITS);
        this.maxDrawBuffers = GlStateManager._getInteger(GL20C.GL_MAX_DRAW_BUFFERS);
        this.maxShaderStorageUnits = IrisRenderSystem.supportsSSBO() ? GlStateManager._getInteger(GL45C.GL_MAX_SHADER_STORAGE_BUFFER_BINDINGS) : 0;
    }
    
    public int getMaxTextureUnits() {
        return maxTextureUnits;
    }
    
    public int getMaxDrawBuffers() {
        return maxDrawBuffers;
    }
    
    public int getMaxShaderStorageUnits() {
        return maxShaderStorageUnits;
    }
    
    public static SamplerLimits get() {
        if (instance == null) {
            instance = new SamplerLimits();
        }
        
        return instance;
    }
}

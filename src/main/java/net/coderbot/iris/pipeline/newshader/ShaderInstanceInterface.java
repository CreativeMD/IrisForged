package net.coderbot.iris.pipeline.newshader;

import java.io.IOException;

import net.minecraft.server.packs.resources.ResourceProvider;

public interface ShaderInstanceInterface {
    void iris$createGeometryShader(ResourceProvider factory, String name) throws IOException;
}

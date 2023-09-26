package net.coderbot.iris.mixin.texture;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

import net.minecraft.client.renderer.texture.SpriteContents;

@Mixin(SpriteContents.FrameInfo.class)
public interface SpriteContentsFrameInfoAccessor {
    @Accessor("index")
    int getIndex();
    
    @Accessor("time")
    int getTime();
}

package net.coderbot.iris.mixin.texture;

import java.util.List;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.gen.Invoker;

import net.minecraft.client.renderer.texture.SpriteContents;

@Mixin(SpriteContents.AnimatedTexture.class)
public interface SpriteContentsAnimatedTextureAccessor {
	@Accessor("frames")
	List<SpriteContents.FrameInfo> getFrames();

	@Invoker("uploadFrame")
	void invokeUploadFrame(int x, int y, int frameIndex);
}

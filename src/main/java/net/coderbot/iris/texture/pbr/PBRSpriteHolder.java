package net.coderbot.iris.texture.pbr;

import org.jetbrains.annotations.Nullable;

import net.minecraft.client.renderer.texture.TextureAtlasSprite;

public class PBRSpriteHolder {
	protected TextureAtlasSprite normalSprite;
	protected TextureAtlasSprite specularSprite;

	@Nullable
	public TextureAtlasSprite getNormalSprite() {
		return normalSprite;
	}

	@Nullable
	public TextureAtlasSprite getSpecularSprite() {
		return specularSprite;
	}

	public void setNormalSprite(TextureAtlasSprite sprite) {
		normalSprite = sprite;
	}

	public void setSpecularSprite(TextureAtlasSprite sprite) {
		specularSprite = sprite;
	}

	public void close() {
		if (normalSprite != null) {
			normalSprite.contents().close();

		}
		if (specularSprite != null) {
			specularSprite.contents().close();
		}
	}
}

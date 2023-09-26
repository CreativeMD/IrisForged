package net.coderbot.iris.uniforms.transforms;

import java.util.function.Supplier;

import org.joml.Vector2f;
import org.joml.Vector2i;

import net.coderbot.iris.uniforms.FrameUpdateNotifier;

public class SmoothedVec2f implements Supplier<Vector2f> {
	private final SmoothedFloat x;
	private final SmoothedFloat y;

	public SmoothedVec2f(float halfLifeUp, float halfLifeDown, Supplier<Vector2i> unsmoothed, FrameUpdateNotifier updateNotifier) {
		x = new SmoothedFloat(halfLifeUp, halfLifeDown, () -> unsmoothed.get().x, updateNotifier);
		y = new SmoothedFloat(halfLifeUp, halfLifeDown, () -> unsmoothed.get().y, updateNotifier);
	}

	@Override
	public Vector2f get() {
		return new Vector2f(x.getAsFloat(), y.getAsFloat());
	}
}

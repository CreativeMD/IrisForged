package net.coderbot.batchedentityrendering.impl.ordering;

import java.util.List;

import net.coderbot.batchedentityrendering.impl.TransparencyType;
import net.minecraft.client.renderer.RenderType;

public interface RenderOrderManager {
    void begin(RenderType type);
    void startGroup();
    boolean maybeStartGroup();
    void endGroup();
    void reset();

	void resetType(TransparencyType type);

	List<RenderType> getRenderOrder();
}

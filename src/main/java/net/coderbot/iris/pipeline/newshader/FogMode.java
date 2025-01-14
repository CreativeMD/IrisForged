package net.coderbot.iris.pipeline.newshader;

public enum FogMode {
    /** Fog is disabled. */
    OFF,
    
    /** Per-vertex fog, applicable to most geometry. */
    PER_VERTEX,
    
    /** Per-fragment fog, for extra-long geometry like beacon beams. */
    PER_FRAGMENT
}

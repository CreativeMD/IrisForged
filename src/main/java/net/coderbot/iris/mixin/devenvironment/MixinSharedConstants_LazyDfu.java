package net.coderbot.iris.mixin.devenvironment;

import org.spongepowered.asm.mixin.Mixin;

import net.minecraft.SharedConstants;

// use a higher priority to apply after LazyDFU, to avoid a conflict.
@Mixin(value = SharedConstants.class, priority = 1010)
public class MixinSharedConstants_LazyDfu {}

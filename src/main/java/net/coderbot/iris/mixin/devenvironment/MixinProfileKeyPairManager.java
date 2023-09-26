package net.coderbot.iris.mixin.devenvironment;

import org.spongepowered.asm.mixin.Mixin;

import net.minecraft.client.multiplayer.ProfileKeyPairManager;

@Mixin(ProfileKeyPairManager.class)
public interface MixinProfileKeyPairManager {
}

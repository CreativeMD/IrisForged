package net.coderbot.iris.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

import com.mojang.blaze3d.shaders.Program;

@Mixin(Program.Type.class)
public interface ProgramTypeAccessor {
    @Invoker(value = "<init>")
    static Program.Type createProgramType(String name, int ordinal, String typeName, String extension, int glId) {
        throw new AssertionError();
    }
}

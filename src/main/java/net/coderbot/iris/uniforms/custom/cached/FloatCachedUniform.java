package net.coderbot.iris.uniforms.custom.cached;

import org.lwjgl.opengl.GL21;

import kroppeb.stareval.function.FunctionReturn;
import kroppeb.stareval.function.Type;
import net.coderbot.iris.gl.uniform.FloatSupplier;
import net.coderbot.iris.gl.uniform.UniformUpdateFrequency;

public class FloatCachedUniform extends CachedUniform {
    
    final private FloatSupplier supplier;
    private float cached;
    
    public FloatCachedUniform(String name, UniformUpdateFrequency updateFrequency, FloatSupplier supplier) {
        super(name, updateFrequency);
        this.supplier = supplier;
    }
    
    @Override
    protected boolean doUpdate() {
        float prev = this.cached;
        this.cached = this.supplier.getAsFloat();
        return prev != cached;
    }
    
    @Override
    public void push(int location) {
        GL21.glUniform1f(location, this.cached);
    }
    
    @Override
    public void writeTo(FunctionReturn functionReturn) {
        functionReturn.floatReturn = this.cached;
    }
    
    @Override
    public Type getType() {
        return Type.Float;
    }
}

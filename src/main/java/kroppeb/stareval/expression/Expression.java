package kroppeb.stareval.expression;

import java.util.Collection;

import kroppeb.stareval.function.FunctionContext;
import kroppeb.stareval.function.FunctionReturn;

public interface Expression {
    void evaluateTo(FunctionContext context, FunctionReturn functionReturn);
    
    default Expression partialEval(FunctionContext context, FunctionReturn functionReturn) {
        return this;
    }
    
    void listVariables(Collection<? super VariableExpression> variables);
}

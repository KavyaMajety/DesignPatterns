package interpretorpattern;

public class InterpreterDriver {
	private InterpreterEngine engine;
    
    public InterpreterDriver(InterpreterEngine engine) {
        this.engine = engine;
    }
    
    public int interpret(String input) {
        Expression expression = null;
        
        if(input.contains("add")) {
            expression = new AddExpression(input);
        } else if(input.contains("multiply")) {
            expression = new MultiplyExpression(input);
        }
        
        int result = expression.interpret(engine);
        System.out.println(input);
        return result;
    }
    
    public static void main(String[] args) {
       InterpreterDriver main = new InterpreterDriver(new InterpreterEngine());
        
        System.out.println("Result: " + main .interpret("add 20 and 30"));
        System.out.println("Result: " + main .interpret("multiply " + main .interpret("add 10 and 18") + " and 25"));
    }
}

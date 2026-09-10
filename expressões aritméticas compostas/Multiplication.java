import java.util.ArrayList;

public class Multiplication extends Expression {

    private ArrayList<Expression> expressions;

    public Multiplication() {
        expressions = new ArrayList<>();
    }

    public void add(Expression expression) {
        expressions.add(expression);
    }

    public double evaluate() {
        if (expressions.isEmpty()) {
            return 0;
        }

        double total = 1;

        for (Expression expression : expressions) {
            total *= expression.evaluate();
        }

        return total;
    }
}
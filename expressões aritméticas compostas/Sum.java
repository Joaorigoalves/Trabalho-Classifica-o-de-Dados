import java.util.ArrayList;

public class Sum extends Expression {

    private ArrayList<Expression> expressions;

    public Sum() {
        expressions = new ArrayList<>();
    }

    public void add(Expression expression) {
        expressions.add(expression);
    }

    public double evaluate() {
        double total = 0;

        for (int i = 0; i < expressions.size(); i++) {
            total += expressions.get(i).evaluate();
        }

        return total;
    }
}
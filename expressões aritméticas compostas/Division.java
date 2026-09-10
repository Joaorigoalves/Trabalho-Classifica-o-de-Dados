import java.util.ArrayList;

public class Division extends Expression {

    private ArrayList<Expression> expressions;

    public Division() {
        expressions = new ArrayList<>();
    }

    public void add(Expression expression) {
        expressions.add(expression);
    }

    public double evaluate() {
        if (expressions.isEmpty()) {
            return 0;
        }

        double total = expressions.get(0).evaluate();

        for (int i = 1; i < expressions.size(); i++) {
            total /= expressions.get(i).evaluate();
        }

        return total;
    }
}
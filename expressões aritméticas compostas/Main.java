public class Main {

    public static void main(String[] args) {

        Sum expressao1 = new Sum();
        expressao1.add(new Number(10));
        expressao1.add(new Number(20));
        expressao1.add(new Number(30));

        System.out.println("10 + 20 + 30 = " + expressao1.evaluate());

        Sum soma = new Sum();
        soma.add(new Number(10));
        soma.add(new Number(20));

        Multiplication expressao2 = new Multiplication();
        expressao2.add(soma);
        expressao2.add(new Number(5));

        System.out.println("(10 + 20) * 5 = " + expressao2.evaluate());

        Subtraction subtracao = new Subtraction();
        subtracao.add(new Number(100));
        subtracao.add(new Number(20));

        Sum soma2 = new Sum();
        soma2.add(new Number(5));
        soma2.add(new Number(3));

        Division expressao3 = new Division();
        expressao3.add(subtracao);
        expressao3.add(soma2);

        System.out.println("(100 - 20) / (5 + 3) = " + expressao3.evaluate());

        Sum soma3 = new Sum();
        soma3.add(new Number(10));
        soma3.add(new Number(20));

        Multiplication multiplicacao = new Multiplication();
        multiplicacao.add(soma3);
        multiplicacao.add(new Number(5));

        Division divisao = new Division();
        divisao.add(new Number(100));
        divisao.add(new Number(4));

        Sum soma4 = new Sum();
        soma4.add(divisao);
        soma4.add(new Number(7));

        Subtraction expressao4 = new Subtraction();
        expressao4.add(multiplicacao);
        expressao4.add(soma4);

        System.out.println("((10 + 20) * 5) - ((100 / 4) + 7) = " + expressao4.evaluate());
    }
}
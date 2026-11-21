package calculadora;

public class Calculadora {

    public double calc(int a, int b, String op) {

        if (op == null) {
            return erroOperacao();
        }

        switch (op) {
            case "+":
                return somar(a, b);

            case "-":
                return subtrair(a, b);

            case "*":
                return multiplicar(a, b);

            case "/":
                return dividir(a, b);

            default:
                return erroOperacao();
        }
    }

    private double somar(int a, int b) {
        return a + b;
    }

    private double subtrair(int a, int b) {
        return a - b;
    }

    private double multiplicar(int a, int b) {
        return a * b;
    }

    private double dividir(int a, int b) {
        if (b == 0) {
            System.out.println("Erro: divisao por zero");
            return Double.NaN;
        }

        return (double) a / b;
    }

    private double erroOperacao() {
        System.out.println("Operacao invalida");
        return Double.NaN;
    }
}
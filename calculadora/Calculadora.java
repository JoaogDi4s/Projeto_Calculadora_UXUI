package calculadora;

public class Calculadora {

    public double calc(int a, int b, String op) {

        if (op == null) {
            System.out.println("Operacao invalida");
            return Double.NaN;
        }

        if (op.equals("+")) {
            return a + b;
        } else if (op.equals("-")) {
            return a - b;
        } else if (op.equals("*")) {
            return a * b;
        } else if (op.equals("/")) {
            if (b == 0) {
                System.out.println("Erro: divisao por zero");
                return Double.NaN;
            }
            return (double) a / b;
        } else {
            System.out.println("Operacao invalida");
            return Double.NaN;
        }
    }
}
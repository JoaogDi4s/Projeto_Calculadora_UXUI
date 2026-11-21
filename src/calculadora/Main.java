package calculadora;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        TesteCalculadora.testar(calculadora, 10, 5, "+", 15);
        TesteCalculadora.testar(calculadora, 10, 5, "-", 5);
        TesteCalculadora.testar(calculadora, 10, 5, "*", 50);
        TesteCalculadora.testar(calculadora, 10, 5, "/", 2);
        TesteCalculadora.testar(calculadora, 10, 0, "/", Double.NaN);
        TesteCalculadora.testar(calculadora, 10, 5, "%", Double.NaN);
    }
}

package calculadora;

public class TesteCalculadora {

    public static void testar(Calculadora calculadora, int a, int b, String op, double esperado) {
        double obtido = calculadora.calc(a, b, op);
        boolean passou;

        if (Double.isNaN(esperado)) {
            passou = Double.isNaN(obtido);
        } else {
            passou = Double.compare(esperado, obtido) == 0;
        }

        System.out.println("--------------------");
        System.out.println("Entrada: " + a + " " + op + " " + b);
        System.out.println("Esperado: " + esperado);
        System.out.println("Obtido: " + obtido);
        System.out.println(passou ? "PASSOU" : "FALHOU");

        if (!passou) {
            throw new AssertionError("Teste falhou");
        }
    }
}
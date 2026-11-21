package calculadora;

public class TesteCalculadora {

    private static Calculadora calculadora = new Calculadora();

    public static void main(String[] args) {
        executarTestes();
    }

    static void executarTestes() {

        testarSoma();
        testarSubtracao();
        testarMultiplicacao();
        testarDivisao();
        testarDivisaoPorZero();
        testarOperacaoInvalida();
    }

    private static void testarSoma() {
        verificarResultado(10, 5, "+", 15);
    }

    private static void testarSubtracao() {
        verificarResultado(10, 5, "-", 5);
    }

    private static void testarMultiplicacao() {
        verificarResultado(10, 5, "*", 50);
    }

    private static void testarDivisao() {
        verificarResultado(10, 5, "/", 2);
    }

    private static void testarDivisaoPorZero() {
        verificarResultado(10, 0, "/", Double.NaN);
    }

    private static void testarOperacaoInvalida() {
        verificarResultado(10, 5, "%", Double.NaN);
    }

    private static void verificarResultado(int primeiroNumero, int segundoNumero, String operador, double resultadoEsperado) {
        double resultadoObtido = calculadora.calc(primeiroNumero,segundoNumero,operador);

        boolean passou = Double.isNaN(resultadoEsperado) ? Double.isNaN(resultadoObtido) : Double.compare(resultadoEsperado, resultadoObtido) == 0;

        System.out.println("--------------------");
        System.out.println("Entrada: " + primeiroNumero + " " + operador + " " + segundoNumero);
        System.out.println("Esperado: " + resultadoEsperado);
        System.out.println("Obtido: " + resultadoObtido);
        System.out.println(passou ? "PASSOU" : "FALHOU");
        
        if (!passou) {
            throw new AssertionError("Teste falhou");
        }
    }
}
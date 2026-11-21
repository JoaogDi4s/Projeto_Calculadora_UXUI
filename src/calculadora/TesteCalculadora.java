package calculadora;

/**
 * Testa a calculadora pela sua interface pública e exibe o resultado de cada caso no console.
 */
public class TesteCalculadora {

    /**
     * Cria uma instância da classe que contém os casos de teste.
     */
    public TesteCalculadora() {
    }

    /**
     * Instância da calculadora usada por todos os casos de teste.
     */
    private static Calculadora calculadora = new Calculadora();

    /**
     * Permite executar a suíte diretamente pela classe de testes.
     *
     * @param args argumentos da linha de comando, ignorados pela suíte
     * @throws AssertionError se algum teste falhar
     */
    public static void main(String[] args) {
        executarTestes();
    }

    /**
     * Executa os seis casos de teste e interrompe a suíte na primeira falha.
     *
     * @throws AssertionError se algum teste falhar
     */
    static void executarTestes() {

        testarSoma();
        testarSubtracao();
        testarMultiplicacao();
        testarDivisao();
        testarDivisaoPorZero();
        testarOperacaoInvalida();
    }

    /**
     * Verifica se a soma de 10 e 5 resulta em 15.
     *
     * @throws AssertionError se a soma retornar um valor diferente de 15
     */
    private static void testarSoma() {
        verificarResultado(10, 5, "+", 15);
    }

    /**
     * Verifica se subtrair 5 de 10 resulta em 5.
     *
     * @throws AssertionError se a subtração retornar um valor diferente de 5
     */
    private static void testarSubtracao() {
        verificarResultado(10, 5, "-", 5);
    }

    /**
     * Verifica se multiplicar 10 por 5 resulta em 50.
     *
     * @throws AssertionError se o produto for diferente de 50
     */
    private static void testarMultiplicacao() {
        verificarResultado(10, 5, "*", 50);
    }

    /**
     * Verifica se dividir 10 por 5 resulta em 2.
     *
     * @throws AssertionError se o quociente for diferente de 2
     */
    private static void testarDivisao() {
        verificarResultado(10, 5, "/", 2);
    }

    /**
     * Verifica se dividir 10 por 5 resulta em 2.
     *
     * @throws AssertionError se o quociente for diferente de 2
     */
    /**
     * Verifica se a divisão por zero retorna {@link Double#NaN}.
     *
     * @throws AssertionError se a divisão por zero retornar um valor diferente de {@code NaN}
     */
    private static void testarDivisaoPorZero() {
        verificarResultado(10, 0, "/", Double.NaN);
    }

    /**
     * Verifica se o operador inválido {@code %} produz {@link Double#NaN}.
     *
     * @throws AssertionError se o operador inválido produzir um valor diferente de {@code NaN}
     */
    private static void testarOperacaoInvalida() {
        verificarResultado(10, 5, "%", Double.NaN);
    }

    /**
     * Executa um cálculo e exibe os valores esperado e obtido no console.
     *
     * @param primeiroNumero primeiro operando
     * @param segundoNumero segundo operando
     * @param operador operador enviado à calculadora
     * @param resultadoEsperado valor que o cálculo deve retornar, inclusive {@link Double#NaN} em casos de erro
     * @throws AssertionError se o resultado obtido divergir do esperado
     */
    private static void verificarResultado(int primeiroNumero, int segundoNumero, String operador, double resultadoEsperado) {
        double resultadoObtido = calculadora.calc(primeiroNumero,segundoNumero,operador);

        // A igualdade com == falha para NaN, mesmo quando os dois valores são NaN.
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
package calculadora;

/**
 * Executa operações aritméticas sobre dois operandos inteiros.
 */
public class Calculadora {

    /**
     * Cria uma calculadora para executar operações aritméticas.
     */
    public Calculadora() {
    }

    /**
     * Seleciona a operação aritmética e calcula o resultado.
     *
     * @param a primeiro operando
     * @param b segundo operando
     * @param op operador: {@code +}, {@code -}, {@code *} ou {@code /}
     * @return resultado da operação ou {@link Double#NaN} se o operador for nulo ou inválido ou se o divisor for zero
     */
    public double calc(int a, int b, String op) {

        // Trata o operador nulo antes do switch, que lançaria NullPointerException.
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

    /**
     * Soma dois inteiros.
     *
     * @param a primeira parcela
     * @param b segunda parcela
     * @return soma calculada com aritmética de {@code int} e convertida para {@code double}
     */
    private double somar(int a, int b) {
        return a + b;
    }

    /**
     * Subtrai o segundo operando do primeiro.
     *
     * @param a minuendo
     * @param b subtraendo
     * @return diferença calculada com aritmética de {@code int} e convertida para {@code double}
     */
    private double subtrair(int a, int b) {
        return a - b;
    }

    /**
     * Multiplica dois inteiros.
     *
     * @param a primeiro fator
     * @param b segundo fator
     * @return produto calculado com aritmética de {@code int} e convertido para {@code double}
     */
    private double multiplicar(int a, int b) {
        return a * b;
    }

    /**
     * Divide o primeiro operando pelo segundo em ponto flutuante.
     *
     * @param a dividendo
     * @param b divisor
     * @return quociente ou {@link Double#NaN} se o divisor for zero, caso em que é exibida uma mensagem de erro
     */
    private double dividir(int a, int b) {
        if (b == 0) {
            System.out.println("Erro: divisao por zero");
            return Double.NaN;
        }

        // Converte antes da divisão para preservar a parte fracionária.
        return (double) a / b;
    }

    /**
     * Exibe uma mensagem de erro para uma operação inválida.
     *
     * @return {@link Double#NaN} para indicar que o cálculo falhou
     */
    private double erroOperacao() {
        System.out.println("Operacao invalida");
        return Double.NaN;
    }
}
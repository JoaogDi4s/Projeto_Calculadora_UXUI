package calculadora;

/**
 * Ponto de entrada do projeto para executar a suíte de testes da calculadora.
 */
public class Main {

    /**
     * Cria uma instância da classe que contém o ponto de entrada do projeto.
     */
    public Main() {
    }
    /**
     * Executa a suíte de testes da calculadora.
     *
     * @param args argumentos da linha de comando, ignorados pela aplicação
     * @throws AssertionError se algum teste falhar
     */
    public static void main(String[] args) {
        TesteCalculadora.executarTestes();
    }
}

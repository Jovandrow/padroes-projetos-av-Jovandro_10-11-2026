package questao1;

public class Compras implements AreaInteressada {
    private static final int LIMITE_MINIMO = 5;

    @Override
    public void atualizar(String produto, int quantidade) {
        if (quantidade < LIMITE_MINIMO) {
            System.out.println("[Compras] ALERTA: " + produto + " com estoque baixo (" + quantidade + ")");
        }
    }
}

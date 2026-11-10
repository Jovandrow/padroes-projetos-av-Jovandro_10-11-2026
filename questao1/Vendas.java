package questao1;

import java.util.HashSet;
import java.util.Set;

public class Vendas implements AreaInteressada {
    private final Set<String> zerados = new HashSet<>();

    @Override
    public void atualizar(String produto, int quantidade) {
        if (quantidade == 0) {
            zerados.add(produto);
        } else if (zerados.remove(produto)) {
            System.out.println("[Vendas] ALERTA: " + produto + " voltou ao estoque (" + quantidade + ")");
        }
    }
}

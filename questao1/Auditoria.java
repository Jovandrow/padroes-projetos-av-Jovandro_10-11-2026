package questao1;

import java.util.ArrayList;
import java.util.List;

public class Auditoria implements AreaInteressada {
    private final List<String> registros = new ArrayList<>();

    @Override
    public void atualizar(String produto, int quantidade) {
        String registro = produto + " -> " + quantidade;
        registros.add(registro);
        System.out.println("[Auditoria] " + registro);
    }

    public List<String> getRegistros() {
        return registros;
    }
}

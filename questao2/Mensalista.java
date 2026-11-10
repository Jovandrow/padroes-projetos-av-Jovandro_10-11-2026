package questao2;

public class Mensalista implements PerfilCobranca {
    private static final double VALOR_FIXO = 300.00;

    @Override
    public String getNome() { return "Mensalista"; }

    @Override
    public double calcular(int minutos) {
        return VALOR_FIXO;
    }
}

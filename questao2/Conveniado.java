package questao2;

public class Conveniado implements PerfilCobranca {
    private static final int MINUTOS_GRATIS = 30;
    private static final double VALOR_HORA = 8.00;
    private static final double DESCONTO_PERCENTUAL = 20.0;

    @Override
    public String getNome() { return "Conveniado"; }

    @Override
    public double calcular(int minutos) {
        int minutosCobrados = Math.max(0, minutos - MINUTOS_GRATIS);
        int horasIniciadas = (minutosCobrados + 59) / 60;
        return horasIniciadas * VALOR_HORA * (1 - DESCONTO_PERCENTUAL / 100);
    }
}

package questao2;

import java.util.Locale;

public class Main {
    private static final Locale BR = Locale.forLanguageTag("pt-BR");

    private static void imprimir(Ticket ticket) {
        System.out.println(String.format(BR, "%s | %d min | %s | R$ %.2f",
                ticket.getPlaca(), ticket.getMinutos(), ticket.getPerfil().getNome(), ticket.valorAPagar()));
    }

    public static void main(String[] args) {
        int minutos = 135;

        System.out.println("--- Mesmo tempo (" + minutos + " min) nos tres perfis ---");
        Ticket rotativo = new Ticket("ABC-1234", minutos, new Rotativo());
        Ticket mensalista = new Ticket("DEF-5678", minutos, new Mensalista());
        Ticket conveniado = new Ticket("GHI-9012", minutos, new Conveniado());
        imprimir(rotativo);
        imprimir(mensalista);
        imprimir(conveniado);

        System.out.println("--- Troca de perfil no mesmo ticket (ABC-1234) ---");
        rotativo.setPerfil(new Mensalista());
        imprimir(rotativo);
        rotativo.setPerfil(new Conveniado());
        imprimir(rotativo);
        rotativo.setPerfil(new Rotativo());
        imprimir(rotativo);
    }
}

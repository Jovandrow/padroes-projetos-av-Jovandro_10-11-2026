package questao3;

import java.util.Locale;

public class Main {
    private static final Locale BR = Locale.forLanguageTag("pt-BR");

    private static void imprimir(Bebida pedido) {
        System.out.println(String.format(BR, "%s = R$ %.2f", pedido.getDescricao(), pedido.getPreco()));
    }

    public static void main(String[] args) {
        Bebida pedido1 = new Leite(new Espresso());
        Bebida pedido2 = new Calda(new Cha());
        Bebida pedido3 = new Calda(new Chantilly(new Chantilly(new Espresso())));
        Bebida pedido4 = new Chantilly(new Leite(new Cha()));

        imprimir(pedido1);
        imprimir(pedido2);
        imprimir(pedido3);
        imprimir(pedido4);
    }
}

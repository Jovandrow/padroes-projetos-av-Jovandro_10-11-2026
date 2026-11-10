package questao1;

public class Main {
    public static void main(String[] args) {
        Compras compras = new Compras();
        Vendas vendas = new Vendas();
        Auditoria auditoria = new Auditoria();

        Produto notebook = new Produto("Notebook", 10);
        notebook.adicionarArea(compras);
        notebook.adicionarArea(vendas);
        notebook.adicionarArea(auditoria);

        Produto mouse = new Produto("Mouse", 20);
        mouse.adicionarArea(auditoria);

        System.out.println("--- Notebook: 10 -> 7 ---");
        notebook.setQuantidade(7);
        System.out.println("--- Notebook: 7 -> 4 ---");
        notebook.setQuantidade(4);
        System.out.println("--- Notebook: 4 -> 4 (sem mudanca) ---");
        notebook.setQuantidade(4);
        System.out.println("--- Notebook: 4 -> 0 ---");
        notebook.setQuantidade(0);
        System.out.println("--- Notebook: 0 -> 8 ---");
        notebook.setQuantidade(8);
        System.out.println("--- Mouse: 20 -> 3 (so Auditoria acompanha) ---");
        mouse.setQuantidade(3);

        notebook.removerArea(compras);
        System.out.println("--- Compras removida | Notebook: 8 -> 2 ---");
        notebook.setQuantidade(2);

        System.out.println("--- Registros da Auditoria: " + auditoria.getRegistros().size() + " ---");
    }
}

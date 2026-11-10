# Avaliacao Pratica - Padroes de Projetos

Aluno: Jovandro Wawrzonkiewicz Junior;
Professor: Escobar.

Compilar e executar (na raiz do repositorio):

    javac -d out questao1/*.java questao2/*.java questao3/*.java
    java -cp out questao1.Main
    java -cp out questao2.Main
    java -cp out questao3.Main

| Questao                      | Padrao   | Motivo
|            ---               |   ----   |
| 1 - Monitor de Estoque       | Observer | Varias areas precisam ser avisadas quando o estoque muda, podendo entrar e sair em tempo de execucao, sem alterar `Produto`.

| 2 - Tarifa de Estacionamento | Strategy | A regra de cobranca varia por perfil, pode ser trocada no mesmo tiquete e novos perfis nao exigem alterar codigo existente.

| 3 - Pedido de Cafe           | Decorator| Complementos em qualquer combinacao e quantidade, sem classes de combinacoes prontas.

Valores da questao 2 (constantes nomeadas): Rotativo R$ 8,00 por hora iniciada; Mensalista R$ 300,00 fixo; Conveniado com 30 min gratis, depois R$ 8,00 por hora iniciada com 20% de desconto (as horas iniciadas contam apos os 30 min gratis).

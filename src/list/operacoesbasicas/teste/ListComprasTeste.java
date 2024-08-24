package list.operacoesbasicas.teste;

import list.operacoesbasicas.dominio.CarrinhoDeCompras;

public class ListComprasTeste {
    public static void main(String[] args) {

        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        carrinhoDeCompras.adicionarItem("Banana",12.50,20);
        carrinhoDeCompras.adicionarItem("Leite",6.50,2);
        carrinhoDeCompras.adicionarItem("Arroz",4.50,1);

        System.out.println("Total de Elementos no carrinho: "+carrinhoDeCompras.calcularValorTotal());
        carrinhoDeCompras.exibirItens();

        carrinhoDeCompras.removerItem("Banana");
        System.out.println("Total de Elementos no carrinho: "+carrinhoDeCompras.calcularValorTotal());

        carrinhoDeCompras.exibirItens();
    }
}

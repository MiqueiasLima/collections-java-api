package map.pesquisa.teste;

import map.pesquisa.dominio.EstoqueProdutos;

public class EstoqueProdutoTeste {
    public static void main(String[] args) {

        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();

        estoqueProdutos.exibirProduto();

        estoqueProdutos.adicionarProduto(1L,"Produto A",10,5.0);
        estoqueProdutos.adicionarProduto(2L,"Produto B",5,10.0);
        estoqueProdutos.adicionarProduto(3L,"Produto C",2,15.0);
        estoqueProdutos.adicionarProduto(4L,"Produto D",2,20.0);

        estoqueProdutos.exibirProduto();

        System.out.println("Valor Total do Estoque: R$ "+estoqueProdutos.calculaValorTotalEstoque());

        System.out.println("Produto Mais Caro: "+estoqueProdutos.obterProdutoMaisCaro());
        System.out.println("Produto Mais Barato: "+estoqueProdutos.obterProdutoMaisBarato());

    }
}

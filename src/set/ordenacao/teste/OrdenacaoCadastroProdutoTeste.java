package set.ordenacao.teste;

import set.ordenacao.dominio.CadastroProdutos;

public class OrdenacaoCadastroProdutoTeste {
    public static void main(String[] args) {

        CadastroProdutos cadastroProdutos = new CadastroProdutos();
        cadastroProdutos.adicionarProduto(1L,"Produto 5",15d,5);
        cadastroProdutos.adicionarProduto(2L,"Produto 0",20d,10);
        cadastroProdutos.adicionarProduto(1L,"Produto 3",10d,2);
        cadastroProdutos.adicionarProduto(9L,"Produto 9",2d,2);

        System.out.println(cadastroProdutos.produtoSet());

        System.out.println(cadastroProdutos.exibirProdutoPorNome());

        System.out.println(cadastroProdutos.exibirPorPreco());
    }
}

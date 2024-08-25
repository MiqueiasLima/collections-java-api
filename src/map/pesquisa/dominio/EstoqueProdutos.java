package map.pesquisa.dominio;

import java.nio.file.LinkOption;
import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

    private Map<Long,Produto> estoqueProdutoMap;

    public EstoqueProdutos() {
        this.estoqueProdutoMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco){
        this.estoqueProdutoMap.put(cod,new Produto(nome,quantidade,preco));
    }

    public void exibirProduto(){
        System.out.println(this.estoqueProdutoMap);
    }

    public double calculaValorTotalEstoque(){

        double valorTotalEstoque = 0d;

        if(!this.estoqueProdutoMap.isEmpty()){
            for(Produto produto : this.estoqueProdutoMap.values()){
                valorTotalEstoque += produto.getPreco() * produto.getQuantidade();
            }
        }
        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if(!this.estoqueProdutoMap.isEmpty()){
            for(Produto produto : this.estoqueProdutoMap.values()){
                if(produto.getPreco() > maiorPreco){
                    produtoMaisCaro = produto;
                }
            }
        }
        return produtoMaisCaro;
    }

    public Produto obterProdutoMaisBarato(){
        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;
        if(!this.estoqueProdutoMap.isEmpty()){
            for(Produto produto : this.estoqueProdutoMap.values()){
                if(produto.getPreco() < menorPreco){
                    produtoMaisBarato = produto;
                    menorPreco = produto.getPreco();
                }
            }
        }
        return produtoMaisBarato;
    }

}

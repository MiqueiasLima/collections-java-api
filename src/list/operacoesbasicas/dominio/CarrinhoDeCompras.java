package list.operacoesbasicas.dominio;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> itemList;

    public CarrinhoDeCompras(){
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        this.itemList.add(new Item(nome,preco,quantidade));
    }

    public void removerItem(String nome){

        List<Item> itensRemovidos = new ArrayList<>();

        for(Item item : this.itemList){
            if(item.getNome().equalsIgnoreCase(nome)){
                itensRemovidos.add(item);
            }
        }
        this.itemList.removeAll(itensRemovidos);
    }

    public int calcularValorTotal(){
        return this.itemList.size();
    }

    public void exibirItens(){
        System.out.println(this.itemList);
    }
}

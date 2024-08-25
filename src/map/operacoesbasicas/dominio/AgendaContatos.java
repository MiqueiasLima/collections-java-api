package map.operacoesbasicas.dominio;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    private Map<String,Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer numero){
        this.agendaContatoMap.put(nome,numero);
    }

    public void removerContato(String nome){
        if(!this.agendaContatoMap.isEmpty()){
            this.agendaContatoMap.remove(nome);
        }
    }

    public void exibirContato(){
        System.out.println(this.agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if(!this.agendaContatoMap.isEmpty()){
            numeroPorNome = this.agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }
}

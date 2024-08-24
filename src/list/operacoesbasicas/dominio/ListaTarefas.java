package list.operacoesbasicas.dominio;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {

    private List<Tarefa> listaTarefa;

    public ListaTarefas(){
        this.listaTarefa = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        this.listaTarefa.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa t : listaTarefa){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
        }
        listaTarefa.removeAll(tarefasParaRemover);
    }
    public int obterNumeroTotalTarefas(){
        return this.listaTarefa.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(listaTarefa);
    }
}

package list.operacoesbasicas.teste;

import list.operacoesbasicas.dominio.ListaTarefas;

public class ListTarefasTeste {
    public static void main(String[] args) {

        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.adicionarTarefa("Tarefa 1");
        listaTarefas.adicionarTarefa("Tarefa 1");
        listaTarefas.adicionarTarefa("Tarefa 2");

        System.out.println("Número total de elementos da lista: "+listaTarefas.obterNumeroTotalTarefas());

        listaTarefas.removerTarefa("Tarefa 2");
        System.out.println("Número total de elementos da lista: "+listaTarefas.obterNumeroTotalTarefas());

        listaTarefas.obterDescricoesTarefas();

    }
}

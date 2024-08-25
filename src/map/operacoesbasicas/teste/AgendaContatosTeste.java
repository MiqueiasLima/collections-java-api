package map.operacoesbasicas.teste;

import map.operacoesbasicas.dominio.AgendaContatos;

public class AgendaContatosTeste {
    public static void main(String[] args) {

        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Usuario",123456);
        agendaContatos.adicionarContato("Usuario",5665);
        agendaContatos.adicionarContato("Usuario Teste",111111);
        agendaContatos.adicionarContato("Usuario Alternado",654987);
        agendaContatos.adicionarContato("Usuario Altista",111111);
        agendaContatos.adicionarContato("Usuario",44444);

        agendaContatos.exibirContato();

        agendaContatos.removerContato("Usuario Alternado");
        agendaContatos.exibirContato();

        System.out.println("O número é: "+agendaContatos.pesquisarPorNome("Usuario Teste"));
    }
}

package set.operacoesbasicas.teste;

import set.operacoesbasicas.dominio.ConjuntoConvidados;

public class SetConjuntoConvidadosTeste {
    public static void main(String[] args) {

        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        System.out.println("Quantidade de Convidados no SET Convidados: "+conjuntoConvidados.contarConvidados());

        conjuntoConvidados.adicionarConvidado("Convidado1",1234);
        conjuntoConvidados.adicionarConvidado("Convidado2",1235);
        conjuntoConvidados.adicionarConvidado("Convidado3",1235);
        conjuntoConvidados.adicionarConvidado("Convidado4",1236);

        conjuntoConvidados.exibirConvidados();

        System.out.println("Quantidade de Convidados no SET Convidados: "+conjuntoConvidados.contarConvidados());

        conjuntoConvidados.removerConvidadoPorCodigoConvite(1234);
        System.out.println("Quantidade de Convidados no SET Convidados: "+conjuntoConvidados.contarConvidados());

        conjuntoConvidados.exibirConvidados();
    }
}

package set.operacoesbasicas.dominio;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        this.convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite) {

        Convidado convidadoParaRemover = null;
        for (Convidado c : this.convidadoSet) {
            if (c.getCodigoConvite() == codigoConvite) {
                convidadoParaRemover = c;
                break;
            }
        }
        this.convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados(){
        return this.convidadoSet.size();
    }

    public void exibirConvidados(){
        System.out.println(this.convidadoSet);
    }
}

package list.ordenacao.teste;

import list.ordenacao.dominio.OrdenacaoPessoas;

public class OrdenacaoPessoaTeste {
    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();

        ordenacaoPessoas.adicionarPessoa("Nome 1",28,1.75);
        ordenacaoPessoas.adicionarPessoa("Nome 2",30,1.56);
        ordenacaoPessoas.adicionarPessoa("Nome 3",25,1.68);
        ordenacaoPessoas.adicionarPessoa("Nome 4",17,1.76);

        System.out.println(ordenacaoPessoas.ordenaPorIdade());
        System.out.println(ordenacaoPessoas.ordenarPorAltura());
    }
}

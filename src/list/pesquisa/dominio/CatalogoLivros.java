package list.pesquisa.dominio;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    private List<Livro> livroList;

    public CatalogoLivros(){
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livroList.add(new Livro(titulo,autor,anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){

        List<Livro> livrosPorAutor = new ArrayList<>();

        if(!this.livroList.isEmpty()){
            for(Livro livro : this.livroList){
                if(livro.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(livro);
                }
            }

        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervalo(int anoInicial, int anoFinal){

        List<Livro> livrosPorIntervaloDeAno = new ArrayList<>();

        if(!this.livroList.isEmpty()){
            for(Livro livro : this.livroList){
                if(livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal){
                    livrosPorIntervaloDeAno.add(livro);
                }
            }
        }
        return livrosPorIntervaloDeAno;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if(!this.livroList.isEmpty()){
            for(Livro livro : this.livroList){
                if(livro.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = livro;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }
}

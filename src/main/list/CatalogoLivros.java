package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public abstract class CatalogoLivros {
    //ATRIBUTOS

    private List<Livro> livroList;

    public CatalogoLivros(List<Livro> livroList) {this.livroList = new ArrayList<>();}

    public CatalogoLivros() {

    }

    public abstract void adicionarLivro(String titulo, String autor, int anoPublicacao);{
        int titulo;
        livroList.add(new Livro(String titulo, String autor, int anoPublicacao));
    }
    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livroList.isEmpty()){
            for (Livro l : livroList ){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }
        }
    return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if (!livroList.isEmpty()){
            for (Livro l : livroList){
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal)
                    livrosPorIntervaloAnos.add(l);
            }
        }
    return livrosPorIntervaloAnos;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if (!livroList.isEmpty()) {
            for (Livro l : livroList){
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;
                    break;
                }
            }
        }
    return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros() {
            @Override
            public void adicionarLivro(String titulo, String autor, int anoPublicacao) {

            }
        };
        catalogoLivros.adicionarLivro("Peido maluco", "Kaike Maciel", 2013);
        catalogoLivros.adicionarLivro("Gabigol", "Lucas Chagas", 2010);
        catalogoLivros.adicionarLivro("Peido maluco: o retorno", "Kaike Maciel", 2020);
        catalogoLivros.adicionarLivro("Kwid: o inimigo agora é a revisao", "Rodrigo Santos", 2016);
        catalogoLivros.adicionarLivro("Matue", "Gabi Malveiras", 2002);


    }

}

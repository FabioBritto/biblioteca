package biblioteca;

import java.util.List;
import java.util.ArrayList;

public class CatalogoLivros {
    
    private List<Livro> listaLivros;
    
    public CatalogoLivros(){
        listaLivros = new ArrayList<>();
    }
    
    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        Livro livro = new Livro(titulo,autor,anoPublicacao);
        listaLivros.add(livro);
    }
    
    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!listaLivros.isEmpty()){
            for(Livro l : listaLivros){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }
        }
        else{
            informarListaVazia();
        }
        return livrosPorAutor;
    }
    
    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial,int anoFinal){
        List<Livro> livrosPorAno = new ArrayList<>();
        if(!listaLivros.isEmpty()){
            for(Livro l : listaLivros){
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    livrosPorAno.add(l);
                }
            }
        }
        else{
            informarListaVazia();
        }
        return livrosPorAno;
    }
    
    public Livro pesquisarPorTitulo(String titulo){
        if(!listaLivros.isEmpty()){
            for(Livro l : listaLivros){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    return l;
                }
            }
        }
        else{
            informarListaVazia();
        }
        return null;
    }
    
    public void informarListaVazia(){
        System.out.println("A lista de livros está vazia");
    }
}

package biblioteca;

public class MainClass {
    
    public static void main(String[]args){
        
        CatalogoLivros listaLivros = new CatalogoLivros();
        
        listaLivros.adicionarLivro("O Senhor dos Anéis", "J.R. Tolkien", 1950);
        listaLivros.adicionarLivro("Crônicas de Nárnia", "C.S. Lewis", 1960);
        listaLivros.adicionarLivro("Blade Runner", "P. Dick", 1970);
        listaLivros.adicionarLivro("UBIK", "P. Dick", 1980);
        
        System.out.println(listaLivros.pesquisarPorAutor("C.S. Lewis"));
        System.out.println(listaLivros.pesquisarPorIntervaloAnos(1955, 1975));
        System.out.println(listaLivros.pesquisarPorTitulo("O Senhor dos Anéis"));
    }
}

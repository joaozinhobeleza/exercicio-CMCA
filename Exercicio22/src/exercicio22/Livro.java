package exercicio22;

public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private String genero;

   
    public Livro(String titulo, String autor, int anoPublicacao, String genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.genero = genero;
    }

    
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public String getGenero() {
        return genero;
    }

    
    public boolean pertenceAoGenero(String generoDesejado) {
        return this.genero.equalsIgnoreCase(generoDesejado);
    }

    
    public void exibirInformacoes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano de Publicação: " + anoPublicacao);
        System.out.println("Gênero: " + genero);
    }
}
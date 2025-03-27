package biblioteca;

class Livro extends ItemBiblioteca {
    private String autor;
    private int numeroPaginas;
    private String isbn;

    public Livro(String titulo, int anoPublicacao, String autor, int numeroPaginas, String isbn) {
        super(titulo, anoPublicacao);
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.isbn = isbn;
    }

    public String detalhes() {
        return "Livro: " + titulo + " (" + anoPublicacao + "), Autor: " + autor + ", Páginas: " + numeroPaginas + ", ISBN: " + isbn;
    }
}

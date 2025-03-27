package biblioteca;

class Revista extends ItemBiblioteca {
    private int numero;
    private String periodicidade;
    private String editora;

    public Revista(String titulo, int anoPublicacao, int numero, String periodicidade, String editora) {
        super(titulo, anoPublicacao);
        this.numero = numero;
        this.periodicidade = periodicidade;
        this.editora = editora;
    }

    @Override
    public String detalhes() {
        return "Revista: " + titulo + " (" + anoPublicacao + "), Edição: " + numero + ", Periodicidade: " + periodicidade + ", Editora: " + editora;
    }
}

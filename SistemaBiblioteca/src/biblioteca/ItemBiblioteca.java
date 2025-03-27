package biblioteca;

abstract class ItemBiblioteca {
    protected String titulo;
    protected int anoPublicacao;
    protected boolean disponivel;

    public ItemBiblioteca(String titulo, int anoPublicacao) {
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
        this.disponivel = true;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void emprestar() {
        if (disponivel) {
            disponivel = false;
            System.out.println("O item '" + titulo + "' foi emprestado com sucesso.");
        } else {
            System.out.println("Item '" + titulo + "' não disponível para empréstimo.");
        }
    }

    public void devolver() {
        disponivel = true;
        System.out.println("O item '" + titulo + "' foi devolvido e está disponível para aluguel.");
    }

    public abstract String detalhes();
}

package biblioteca;

public class SistemaBiblioteca {
    public static void main(String[] args) {
        Livro livro1 = new Livro("O Senhor dos Anéis", 1954, "J.R.R. Tolkien", 1178, "978-0-261-10230-6");
        Livro livro2 = new Livro("1984", 1949, "George Orwell", 328, "978-0-452-28423-4");
        Livro livro3 = new Livro("Dom Quixote", 1605, "Miguel de Cervantes", 863, "978-84-376-0494-7");

        Revista revista1 = new Revista("National Geographic", 2023, 101, "Mensal", "NatGeo");
        Revista revista2 = new Revista("Superinteressante", 2023, 250, "Mensal", "Abril");
        Revista revista3 = new Revista("Veja", 2023, 3500, "Semanal", "Editora Abril");

        Usuario usuario1 = new Usuario("BIBLIOTECA", 1);
        String nomePessoa = "Guilherme Ribeiro";
        
        usuario1.emprestarItem(livro1, nomePessoa);
        usuario1.emprestarItem(livro2, nomePessoa);
        usuario1.emprestarItem(livro3, nomePessoa);
        usuario1.emprestarItem(revista1, nomePessoa);
        usuario1.emprestarItem(revista2, nomePessoa);
        usuario1.emprestarItem(revista3, nomePessoa);

        usuario1.listarItensEmprestados();
    }
}

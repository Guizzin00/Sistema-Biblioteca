package biblioteca;

import java.util.ArrayList;
import java.util.List;

class Usuario {
    private String nome;
    private List<ItemBiblioteca> itensEmprestados;

    public Usuario(String nome, int idUsuario) {
        this.nome = nome;
        this.itensEmprestados = new ArrayList<>();
        titulo();
    }

    public void titulo() {
        System.out.println("\r\n"
            + "██████╗░██╗██████╗░██╗░░░░░██╗░█████╗░████████╗███████╗░█████╗░░█████╗░\r\n"
            + "██╔══██╗██║██╔══██╗██║░░░░░██║██╔══██╗╚══██╔══╝██╔════╝██╔══██╗██╔══██╗\r\n"
            + "██████╦╝██║██████╦╝██║░░░░░██║██║░░██║░░░██║░░░█████╗░░██║░░╚═╝███████║\r\n"
            + "██╔══██╗██║██╔══██╗██║░░░░░██║██║░░██║░░░██║░░░██╔══╝░░██║░░██╗██╔══██║\r\n"
            + "██████╦╝██║██████╦╝███████╗██║╚█████╔╝░░░██║░░░███████╗╚█████╔╝██║░░██║\r\n"
            + "╚═════╝░╚═╝╚═════╝░╚══════╝╚═╝░╚════╝░░░░╚═╝░░░╚══════╝░╚════╝░╚═╝░░╚═╝\r\n"
            + "-----------------------------------------------------------------------");
    }

    public void emprestarItem(ItemBiblioteca item, String nomePessoa) {
        if (item.isDisponivel()) {
            item.emprestar();
            itensEmprestados.add(item);
            System.out.println("\n✅ " + nome + " emprestou para " + nomePessoa + ":");
            System.out.println("--------------------------------------------------");
            System.out.println(item.detalhes());
            System.out.println("--------------------------------------------------\n");
        } else {
            System.out.println("\n❌ O item " + item.detalhes() + " não está disponível.\n");
        }
    }

    public void listarItensEmprestados() {
        System.out.println("\n📚 Itens emprestados por " + nome + ":");
        System.out.println("==================================================");
        for (ItemBiblioteca item : itensEmprestados) {
            System.out.println("🔹 " + item.detalhes());
        }
        System.out.println("==================================================\n");
    }
}

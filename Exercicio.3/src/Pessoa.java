import java.util.Scanner;

public class Pessoa {
    private String nome;
    private String endereco;
    private String telefone;

    // Construtores, getters e setters

    public void lerDados() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome da pessoa: ");
        nome = scanner.nextLine();
        System.out.print("Digite o endereço da pessoa: ");
        endereco = scanner.nextLine();
        System.out.print("Digite o telefone da pessoa: ");
        telefone = scanner.nextLine();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\nEndereço: " + endereco + "\nTelefone: " + telefone;
    }
}

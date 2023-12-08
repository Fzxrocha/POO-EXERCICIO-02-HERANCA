import java.util.Scanner;

public class Animal {
    private String nome;
    private double peso;

    public void lerDados() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do animal: ");
        nome = scanner.nextLine();
        System.out.print("Digite o peso do animal: ");
        peso = scanner.nextDouble();
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\nPeso: " + peso;
    }
}

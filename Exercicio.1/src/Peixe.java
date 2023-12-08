import java.util.Scanner;

public class Peixe extends Animal {
    private String tipoHabitat;

    @Override
    public void lerDados() {
        super.lerDados();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o tipo de habitat do peixe: ");
        tipoHabitat = scanner.nextLine();
    }

    @Override
    public String toString() {
        return super.toString() + "\nTipo de Habitat: " + tipoHabitat;
    }
}

import java.util.Scanner;

public class Cachorro extends Animal {
    private String raca;

    @Override
    public void lerDados() {
        super.lerDados();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a raça do cachorro: ");
        raca = scanner.nextLine();
    }

    @Override
    public String toString() {
        return super.toString() + "\nRaça: " + raca;
    }
}

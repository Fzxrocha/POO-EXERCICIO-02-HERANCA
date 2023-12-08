
import java.util.Scanner;

public class Pessoa {
    private String nome;
    private int idade;
    private String sexo;

    public void lerDados() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome da pessoa: ");
        nome = scanner.next();
        System.out.print("Digite a idade da pessoa: ");
        idade = scanner.nextInt();
        System.out.print("Digite o sexo da pessoa: ");
        sexo = scanner.next();
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\nIdade: " + idade + "\nSexo: " + sexo;
    }
}

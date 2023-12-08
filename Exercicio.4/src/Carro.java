import java.util.Scanner;

public class Carro extends Veiculo {
    private int numeroPortas;
    private String cor;

    public Carro(String modelo, int numeroPortas, String cor) {
        super("", modelo);  // A marca é definida na classe base
        this.numeroPortas = numeroPortas;
        this.cor = cor;
    }

    public void ligarFarol() {
        System.out.println("Farol do carro ligado.");
    }

    public void abrirPorta() {
        System.out.println("Porta do carro aberta.");
    }

    @Override
    public void lerDados() {
        super.lerDados();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número de portas do carro: ");
        numeroPortas = scanner.nextInt();
        scanner.nextLine();  // Limpar o buffer do teclado
        System.out.print("Digite a cor do carro: ");
        cor = scanner.nextLine();
    }

    @Override
    public String toString() {
        return "Carro [" + getMarca() + " modelo=" + getModelo() +
               ", numeroPortas=" + numeroPortas + ", cor=" + cor + "]";
    }
}

import java.util.Scanner;

public class Aviao extends Veiculo {
    private String companhiaAerea;
    private int numeroPassageiros;

    public Aviao(String marca, String modelo, String companhiaAerea, int numeroPassageiros) {
        super(marca, modelo);
        this.companhiaAerea = companhiaAerea;
        this.numeroPassageiros = numeroPassageiros;
    }

    public void decolar() {
        System.out.println("Avião decolando.");
    }

    public void pousar() {
        System.out.println("Avião pousando.");
    }

    @Override
    public void lerDados() {
        super.lerDados();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a companhia aérea do avião: ");
        companhiaAerea = scanner.nextLine();
        System.out.print("Digite o número de passageiros do avião: ");
        numeroPassageiros = scanner.nextInt();
    }

    @Override
    public String toString() {
        return "Aviao [" + getMarca() + " modelo=" + getModelo() +
               ", companhiaAerea=" + companhiaAerea + ", numeroPassageiros=" + numeroPassageiros + "]";
    }
}

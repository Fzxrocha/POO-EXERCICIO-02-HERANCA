import java.util.Scanner;

public class Bicicleta extends Veiculo {
    private String tipo;
    private int numeroMarchas;

    public Bicicleta(String marca, String modelo, String tipo, int numeroMarchas) {
        super(marca, modelo);
        this.tipo = tipo;
        this.numeroMarchas = numeroMarchas;
    }

    public void pedalar() {
        System.out.println("Pedalando a bicicleta.");
    }

    public void trocarMarcha() {
        System.out.println("Troca de marcha na bicicleta.");
    }

    @Override
    public void lerDados() {
        super.lerDados();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o tipo da bicicleta: ");
        tipo = scanner.nextLine();
        System.out.print("Digite o número de marchas da bicicleta: ");
        numeroMarchas = scanner.nextInt();
    }

    @Override
    public String toString() {
        return "Bicicleta [" + getMarca() + " modelo=" + getModelo() +
               ", tipo=" + tipo + ", numeroMarchas=" + numeroMarchas + "]";
    }
}

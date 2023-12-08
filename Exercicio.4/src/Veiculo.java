import java.util.Scanner;

public class Veiculo {
    private final String marca;
    private String modelo;

    public Veiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void acelerar() {
        System.out.println("Veículo acelerando.");
    }

    public void frear() {
        System.out.println("Veículo freando.");
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void lerDados() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o modelo do veículo: ");
        modelo = scanner.nextLine();
    }

    @Override
    public String toString() {
        return "Veiculo [marca=" + marca + ", modelo=" + modelo + "]";
    }
}

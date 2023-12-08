
import java.util.Scanner;

public class Administrador extends Empregado {
    private double ajudaDeCusto;

    // Construtores, getters e setters

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + ajudaDeCusto;
    }

    @Override
    public void lerDados() {
        super.lerDados();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor da ajuda de custo do administrador: ");
        ajudaDeCusto = scanner.nextDouble();
    }

    public double getAjudaDeCusto() {
        return ajudaDeCusto;
    }

    public void setAjudaDeCusto(double ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }

    @Override
    public String toString() {
        return super.toString() + "\nAjuda de Custo: " + ajudaDeCusto;
    }
}

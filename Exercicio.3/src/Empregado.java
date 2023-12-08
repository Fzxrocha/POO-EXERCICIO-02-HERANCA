
import java.util.Scanner;

public class Empregado extends Pessoa {
    private int codigoSetor;
    private double salarioBase;
    private double imposto;

    // Construtores, getters e setters

    public double calcularSalario() {
        return salarioBase - (salarioBase * (imposto / 100));
    }

    @Override
    public void lerDados() {
        super.lerDados();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o código do setor do empregado: ");
        codigoSetor = scanner.nextInt();
        System.out.print("Digite o salário base do empregado: ");
        salarioBase = scanner.nextDouble();
        System.out.print("Digite a porcentagem de imposto retida: ");
        imposto = scanner.nextDouble();
    }

    public int getCodigoSetor() {
        return codigoSetor;
    }

    public void setCodigoSetor(int codigoSetor) {
        this.codigoSetor = codigoSetor;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCódigo do Setor: " + codigoSetor + "\nSalário Base: " + salarioBase
                + "\nImposto (%): " + imposto;
    }
}

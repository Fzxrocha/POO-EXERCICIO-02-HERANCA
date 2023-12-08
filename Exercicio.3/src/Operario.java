
import java.util.Scanner;

public class Operario extends Empregado {
    private double valorProducao;
    private double comissao;

    // Construtores, getters e setters

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + (valorProducao * (comissao / 100));
    }

    @Override
    public void lerDados() {
        super.lerDados();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor de produção do operário: ");
        valorProducao = scanner.nextDouble();
        System.out.print("Digite a porcentagem de comissão do operário: ");
        comissao = scanner.nextDouble();
    }

    public double getValorProducao() {
        return valorProducao;
    }

    public void setValorProducao(double valorProducao) {
        this.valorProducao = valorProducao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    @Override
    public String toString() {
        return super.toString() + "\nValor de Produção: " + valorProducao + "\nComissão (%): " + comissao;
    }
}

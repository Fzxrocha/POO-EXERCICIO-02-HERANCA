
import java.util.Scanner;

public class Vendedor extends Empregado {
    private double valorVendas;
    private double comissao;

    // Construtores, getters e setters

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + (valorVendas * (comissao / 100));
    }

    @Override
    public void lerDados() {
        super.lerDados();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor das vendas do vendedor: ");
        valorVendas = scanner.nextDouble();
        System.out.print("Digite a porcentagem de comissão do vendedor: ");
        comissao = scanner.nextDouble();
    }

    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    @Override
    public String toString() {
        return super.toString() + "\nValor das Vendas: " + valorVendas + "\nComissão (%): " + comissao;
    }
}

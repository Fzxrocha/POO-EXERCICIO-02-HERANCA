
import java.util.Scanner;

public class Fornecedor extends Pessoa {
    private double valorCredito;
    private double valorDivida;

    // Construtores, getters e setters

    public double obterSaldo() {
        return valorCredito - valorDivida;
    }

    @Override
    public void lerDados() {
        super.lerDados();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor de crédito do fornecedor: ");
        valorCredito = scanner.nextDouble();
        System.out.print("Digite o valor da dívida do fornecedor: ");
        valorDivida = scanner.nextDouble();
    }

    public double getValorCredito() {
        return valorCredito;
    }

    public void setValorCredito(double valorCredito) {
        this.valorCredito = valorCredito;
    }

    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }

    @Override
    public String toString() {
        return super.toString() + "\nValor de Crédito: " + valorCredito + "\nValor da Dívida: " + valorDivida;
    }
}

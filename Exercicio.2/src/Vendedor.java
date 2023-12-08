import java.util.Scanner;

public class Vendedor extends Empregado {
    private double valorVendas;
    private int qntVendas;

    @Override
    public void lerDados() {
        super.lerDados();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor das vendas do vendedor: ");
        valorVendas = scanner.nextDouble();
        System.out.print("Digite a quantidade de vendas do vendedor: ");
        qntVendas = scanner.nextInt();
    }

    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public int getQntVendas() {
        return qntVendas;
    }

    public void setQntVendas(int qntVendas) {
        this.qntVendas = qntVendas;
    }

    @Override
    public String toString() {
        return super.toString() + "\nValor das Vendas: " + valorVendas + "\nQuantidade de Vendas: " + qntVendas;
    }
}

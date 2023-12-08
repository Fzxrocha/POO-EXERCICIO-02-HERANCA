import java.util.Scanner;

public class Cliente extends Pessoa {
    private double valorDivida;
    private int anoNascimento;

    @Override
    public void lerDados() {
        super.lerDados();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor da dívida do cliente: ");
        valorDivida = scanner.nextDouble();
        System.out.print("Digite o ano de nascimento do cliente: ");
        anoNascimento = scanner.nextInt();
    }

    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    @Override
    public String toString() {
        return super.toString() + "\nValor da Dívida: " + valorDivida + "\nAno de Nascimento: " + anoNascimento;
    }
}

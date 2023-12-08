import java.util.Scanner;

public class Gerente extends Empregado {
    private String nomeGerencia;

    @Override
    public void lerDados() {
        super.lerDados();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome da gerência: ");
        nomeGerencia = scanner.next();
    }

    public String getNomeGerencia() {
        return nomeGerencia;
    }

    public void setNomeGerencia(String nomeGerencia) {
        this.nomeGerencia = nomeGerencia;
    }

    @Override
    public String toString() {
        return super.toString() + "\nNome da Gerência: " + nomeGerencia;
    }
}

import java.util.Scanner;

public class Empregado {
    private double salario;
    private String matricula;

    public void lerDados() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o salário do empregado: ");
        salario = scanner.nextDouble();
        System.out.print("Digite a matrícula do empregado: ");
        matricula = scanner.next();
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double valorInss() {
        return salario * 0.11;
    }

    @Override
    public String toString() {
        return "Salário: " + salario + "\nMatrícula: " + matricula;
    }
}

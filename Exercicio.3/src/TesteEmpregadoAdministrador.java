public class TesteEmpregadoAdministrador {
    public static void main(String[] args) {
        Empregado empregado = new Empregado();
        System.out.println("Digite os dados do empregado:");
        empregado.lerDados();

        Administrador administrador = new Administrador();
        System.out.println("\nDigite os dados do administrador:");
        administrador.lerDados();

        System.out.println("\nDados do Empregado:\n" + empregado.toString());
        System.out.println("Salário Líquido do Empregado: " + empregado.calcularSalario());

        System.out.println("\nDados do Administrador:\n" + administrador.toString());
        System.out.println("Salário Líquido do Administrador: " + administrador.calcularSalario());
    }
}

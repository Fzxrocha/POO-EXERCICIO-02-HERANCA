public class TesteOperario {
    public static void main(String[] args) {
        Operario operario = new Operario();
        System.out.println("Digite os dados do operário:");
        operario.lerDados();

        System.out.println("\nDados do Operário:\n" + operario.toString());
        System.out.println("Salário Líquido do Operário: " + operario.calcularSalario());
    }
}

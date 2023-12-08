public class TesteVendedor {
    public static void main(String[] args) {
        Vendedor vendedor = new Vendedor();
        System.out.println("Digite os dados do vendedor:");
        vendedor.lerDados();

        System.out.println("\nDados do Vendedor:\n" + vendedor.toString());
        System.out.println("Salário Líquido do Vendedor: " + vendedor.calcularSalario());
    }
}

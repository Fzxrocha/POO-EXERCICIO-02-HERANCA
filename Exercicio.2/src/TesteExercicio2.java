public class TesteExercicio2 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        System.out.println("Digite os dados do gerente:");
        gerente.lerDados();

        Cliente cliente = new Cliente();
        System.out.println("\nDigite os dados do cliente:");
        cliente.lerDados();

        Vendedor vendedor = new Vendedor();
        System.out.println("\nDigite os dados do vendedor:");
        vendedor.lerDados();

        System.out.println("\nDados do Gerente:\n" + gerente.toString());
        System.out.println("\nDados do Cliente:\n" + cliente.toString());
        System.out.println("\nDados do Vendedor:\n" + vendedor.toString());
    }
}

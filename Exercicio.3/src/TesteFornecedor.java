public class TesteFornecedor {
    public static void main(String[] args) {
        Fornecedor fornecedor = new Fornecedor();
        System.out.println("Digite os dados do fornecedor:");
        fornecedor.lerDados();

        System.out.println("\nDados do Fornecedor:\n" + fornecedor.toString());
        System.out.println("Saldo do Fornecedor: " + fornecedor.obterSaldo());
    }
}

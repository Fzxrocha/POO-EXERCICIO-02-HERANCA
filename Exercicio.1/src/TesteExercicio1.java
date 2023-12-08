public class TesteExercicio1 {
    public static void main(String[] args) {
        Peixe peixe = new Peixe();
        System.out.println("Digite os dados do peixe:");
        peixe.lerDados();

        Cachorro cachorro = new Cachorro();
        System.out.println("\nDigite os dados do cachorro:");
        cachorro.lerDados();

        System.out.println("\nDados do Peixe:\n" + peixe.toString());
        System.out.println("\nDados do Cachorro:\n" + cachorro.toString());
    }
}

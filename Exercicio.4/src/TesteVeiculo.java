public class TesteVeiculo {
    public static void main(String[] args) {
        Carro meuCarro = new Carro("Corolla", 0, "");
        Bicicleta minhaBicicleta = new Bicicleta("", "", "", 0);
        Aviao meuAviao = new Aviao("", "", "", 0);

        System.out.println("Digite os dados do Carro:");
        meuCarro.lerDados();
        System.out.println("\nDados do Carro:");
        System.out.println(meuCarro.toString());

        System.out.println("\nDigite os dados da Bicicleta:");
        minhaBicicleta.lerDados();
        System.out.println("\nDados da Bicicleta:");
        System.out.println(minhaBicicleta.toString());

        System.out.println("\nDigite os dados do Avião:");
        meuAviao.lerDados();
        System.out.println("\nDados do Avião:");
        System.out.println(meuAviao.toString());
    }
}

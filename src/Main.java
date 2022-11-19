public class Main {
    public static void main(String[] args) {
        Conta conta; // Declaração da variável do tipo conta
        conta = new Conta(); // Instância da classe Conta

        conta.setAgencia(123); // Configurando a agência;
        conta.setNumeroConta(456);
        conta.depositar(1000);
        conta.sacar(2000);
        System.out.println(conta.consultarSaldo());
    }
}
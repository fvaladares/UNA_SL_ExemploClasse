
// Declaração da classe
public class Conta {
    // Declaração dos atributos
    private int numeroConta;
    private int agencia;
    private double saldo;

    public boolean setAgencia(int agencia) {
        if (agencia < 0) {
            return false;
        } else {
            this.agencia = agencia;
            return true;
        }
    }

    public int getAgencia() {
        return this.agencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    // Declaração dos métodos
    public void sacar(double valor) {
        saldo = saldo - valor;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public double consultarSaldo() {
        return saldo;
    }
}



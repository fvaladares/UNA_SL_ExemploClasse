
// Declaração da classe
public class Conta {
    // Declaração dos atributos
    private int numeroConta;
    private int agencia;
    private double saldo;

    public Conta(int numeroConta, int agencia, int saldo) {
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.saldo = saldo;
    }

    public Conta() {
        this.numeroConta = 0;
        this.agencia = 0;
        this.saldo = 0;
    }

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



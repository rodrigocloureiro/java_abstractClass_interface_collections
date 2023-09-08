public class Conta {
    private double saldo;

    public void sacar(double valor) {
        if (valor <= this.saldo) this.saldo -= valor;
        else System.out.println("Saldo insuficiente..");
    }

    public void depositar(double valor) {
        if (valor > 0) this.saldo += valor;
        else System.out.println("Valor inválido..");
    }

    public double obterSaldo() {
        return this.saldo;
    }
}

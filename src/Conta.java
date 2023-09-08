public class Conta {
    private double saldo;
    private String nome;

    public Conta(double saldo,String nome) {
        this.saldo = saldo;
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

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

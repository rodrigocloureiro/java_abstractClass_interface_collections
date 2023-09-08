public class ContaCorrente extends Conta implements Tributavel{
    public ContaCorrente(double saldo) {
        super(saldo);
    }
    @Override
    public double calculaTributos() {
        return obterSaldo() * 0.01;
    }
}

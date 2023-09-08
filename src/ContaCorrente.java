public class ContaCorrente extends Conta implements Tributavel{
    public ContaCorrente(double saldo, String nome) {
        super(saldo, nome);
    }
    @Override
    public double calculaTributos() {
        return obterSaldo() * 0.01;
    }
}

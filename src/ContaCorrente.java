public class ContaCorrente extends Conta implements Tributavel{
    @Override
    public double calculaTributos() {
        return obterSaldo() * 0.01;
    }
}

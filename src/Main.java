import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Conta> contas = new ArrayList<>();
        ArrayList<SeguroDeVida> seguros = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            contas.add(new ContaCorrente(Math.floor(Math.random() * 1000) + 1000));
            contas.add(new ContaPoupanca(Math.floor(Math.random() * 1000) + 1000));
            seguros.add(new SeguroDeVida());
        }

        ArrayList<Tributavel> tributaveis = new ArrayList<>();
    }
}

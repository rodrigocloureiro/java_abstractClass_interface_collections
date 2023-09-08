import java.util.ArrayList;
import static java.util.Comparator.comparing;

public class Main {
    public static void main(String[] args) {
        ArrayList<Conta> contas = new ArrayList<>();
        ArrayList<SeguroDeVida> seguros = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            contas.add(new ContaCorrente(Math.floor(Math.random() * 2000) + 3000));
            contas.add(new ContaPoupanca(Math.floor(Math.random() * 2000) + 3000));
            seguros.add(new SeguroDeVida());
        }

        ArrayList<Tributavel> tributaveis = new ArrayList<>();
        tributaveis.addAll(
                contas.stream()
                        .filter(conta -> conta instanceof Tributavel)
                        .map(conta -> (Tributavel) conta)
                        .toList()
        );
        tributaveis.addAll(seguros);
        tributaveis.sort(comparing(Tributavel::calculaTributos).reversed());


    }
}

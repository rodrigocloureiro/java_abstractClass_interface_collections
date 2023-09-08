import java.util.ArrayList;
import static java.util.Comparator.comparing;

public class Main {
    public static void main(String[] args) {
        ArrayList<Conta> contas = new ArrayList<>();
        ArrayList<SeguroDeVida> seguros = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            contas.add(new ContaCorrente((Math.floor(Math.random() * 2000) + 3000), String.format("Nome%d", (int) Math.floor(Math.random() * 2000) + 3000)));
            contas.add(new ContaPoupanca((Math.floor(Math.random() * 2000) + 3000), String.format("Nome%d", (int) Math.floor(Math.random() * 2000) + 3000)));
            seguros.add(new SeguroDeVida(String.format("Nome%d", (int) Math.floor(Math.random() * 2000) + 3000)));
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

        for (Tributavel tributavel : tributaveis) {
            if (tributavel instanceof Conta) {
                System.out.printf("Nome: %s - Saldo: R$ %.2f - ", ((Conta)tributavel).getNome(), ((Conta)tributavel).obterSaldo());
            } else if (tributavel instanceof SeguroDeVida) {
                System.out.printf("Nome: %s - ", ((SeguroDeVida)tributavel).getNome());
            }
            System.out.printf("Tributo: R$ %.2f\n", tributavel.calculaTributos());
        }
    }
}

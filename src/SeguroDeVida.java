public class SeguroDeVida implements Tributavel {
    private final double TAXA = 42.00;
    private String nome;

    public SeguroDeVida(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    @Override
    public double calculaTributos() {
        return this.TAXA;
    }
}

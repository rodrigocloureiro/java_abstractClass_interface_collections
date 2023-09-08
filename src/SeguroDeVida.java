public class SeguroDeVida implements Tributavel {
    private final double taxa = 42.00;

    @Override
    public double calculaTributos() {
        return this.taxa;
    }
}

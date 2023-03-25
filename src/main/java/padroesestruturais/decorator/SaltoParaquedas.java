package padroesestruturais.decorator;

public class SaltoParaquedas extends PostoDecorator {
    public SaltoParaquedas(Posto posto) { super(posto); }
    public float getAcrescimoSalarial() { return 251.83f; }
}

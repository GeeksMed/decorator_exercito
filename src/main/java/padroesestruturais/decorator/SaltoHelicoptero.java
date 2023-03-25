package padroesestruturais.decorator;

public class SaltoHelicoptero extends PostoDecorator {
    public SaltoHelicoptero(Posto posto) { super(posto); }
    public float getAcrescimoSalarial() { return 399.08f; }
}

package padroesestruturais.decorator;

public class Voo extends PostoDecorator {
    public Voo(Posto posto) { super(posto); }
    public float getAcrescimoSalarial() { return 499.46f; }
}

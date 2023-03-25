package padroesestruturais.decorator;

public abstract class PostoDecorator implements Posto{
    private Posto posto;

    public PostoDecorator(Posto posto) { this.posto = posto; }

    public Posto getPosto() { return posto; }
    public void setPosto(Posto posto) { this.posto = posto; }

    public abstract float getAcrescimoSalarial();
    public float getSalario() {
        return this.posto.getSalario() + this.getAcrescimoSalarial();
    }
}

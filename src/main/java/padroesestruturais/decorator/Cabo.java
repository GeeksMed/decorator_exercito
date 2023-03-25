package padroesestruturais.decorator;

public class Cabo implements Posto {
    public float salario;

    public Cabo() {
    }

    public Cabo(float salario) { this.salario = salario; }
    public float getSalario() { return salario; }
}

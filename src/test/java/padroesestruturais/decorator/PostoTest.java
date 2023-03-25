package padroesestruturais.decorator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PostoTest {
    @Test
    void deveRetornarSalarioCabo() {
        Posto posto = new Cabo(2627.00f);
        assertEquals(2627.00f, posto.getSalario());
    }
    @Test
    void deveRetornarSalarioCaboComVoo() {
        Posto posto = new Voo(new Cabo(2627.00f));
        assertEquals(3126.46f, posto.getSalario());
    }
    @Test
    void deveRetornarSalarioCaboComSaltoHelicoptero() {
        Posto posto = new SaltoHelicoptero(new Cabo(2627.00f));
        assertEquals(3026.08f, posto.getSalario());
    }
    @Test
    void deveRetornarSalarioCaboComSaltoParaquedas() {
        Posto posto = new SaltoParaquedas(new Cabo(2627.00f));
        assertEquals(2878.83f, posto.getSalario());
    }
    @Test
    void deveRetornarSalarioCaboComVooSaltoHelicoptero() {
        Posto posto = new SaltoHelicoptero(new Voo(new Cabo(2627.00f)));
        assertEquals(3525.54f, posto.getSalario());
    }
    @Test
    void deveRetornarSalarioCaboComVooSaltoParaquedas() {
        Posto posto = new SaltoParaquedas(new Voo(new Cabo(2627.00f)));
        assertEquals(3378.29f, posto.getSalario());
    }
    @Test
    void deveRetornarSalarioCaboComSaltoHericopteroSaltoParaquedas() {
        Posto posto = new SaltoParaquedas(new SaltoHelicoptero(new Cabo(2627.00f)));
        assertEquals(3277.91f, posto.getSalario(), 0.01f);
    }
    @Test
    void deveRetornarSalarioCaboComVooSaltoHericopteroSaltoParaquedas() {
        Posto posto = new SaltoParaquedas(new SaltoHelicoptero(new Voo(new Cabo(2627.00f))));
        assertEquals(3777.37f, posto.getSalario());
    }

}
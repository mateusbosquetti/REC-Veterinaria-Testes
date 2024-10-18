import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProcedimentoTest {
    @Test
    void procedimentoInicializaCamposCorretamente() {
        Procedimento procedimento = new Procedimento("Vacinação", 50.0, true, true);
        assertEquals("Vacinação", procedimento.getNome());
        assertEquals(50.0, procedimento.getPreco());
        assertTrue(procedimento.isGato());
        assertTrue(procedimento.isCachorro());
    }

    @Test
    void procedimentoParaGatoApenas() {
        Procedimento procedimento = new Procedimento("Vacinação", 50.0, true, false);
        assertTrue(procedimento.isGato());
        assertFalse(procedimento.isCachorro());
    }

    @Test
    void procedimentoParaCachorroApenas() {
        Procedimento procedimento = new Procedimento("Vacinação", 50.0, false, true);
        assertFalse(procedimento.isGato());
        assertTrue(procedimento.isCachorro());
    }

    @Test
    void procedimentoParaNenhumAnimal() {
        Procedimento procedimento = new Procedimento("Vacinação", 50.0, false, false);
        assertFalse(procedimento.isGato());
        assertFalse(procedimento.isCachorro());
    }
}
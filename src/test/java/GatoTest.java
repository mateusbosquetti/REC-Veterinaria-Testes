import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GatoTest {
    @Test
    void getTipoPelagemReturnsCorrectTipoPelagem() {
        Gato gato = new Gato("Mimi", "2021-05-15", "Curta", true);
        assertEquals("Curta", gato.getTipoPelagem());
    }

    @Test
    void isAriscoReturnsTrueWhenArisco() {
        Gato gato = new Gato("Mimi", "2021-05-15", "Curta", true);
        assertTrue(gato.isArisco());
    }

    @Test
    void isAriscoReturnsFalseWhenNotArisco() {
        Gato gato = new Gato("Mimi", "2021-05-15", "Curta", false);
        assertFalse(gato.isArisco());
    }

    @Test
    void constructorInitializesFieldsCorrectly() {
        Gato gato = new Gato("Mimi", "2021-05-15", "Curta", true);
        assertEquals("Mimi", gato.getNome());
        assertEquals("2021-05-15", gato.getDataNascimento());
        assertEquals("Curta", gato.getTipoPelagem());
        assertTrue(gato.isArisco());
    }
}
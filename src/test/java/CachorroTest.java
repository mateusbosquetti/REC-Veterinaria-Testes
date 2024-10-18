import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CachorroTest {
    @Test
    void getRacaReturnsCorrectRaca() {
        Cachorro cachorro = new Cachorro("Rex", "2020-01-01", "Labrador", true);
        assertEquals("Labrador", cachorro.getRaca());
    }

    @Test
    void isAdestradoReturnsTrueWhenAdestrado() {
        Cachorro cachorro = new Cachorro("Rex", "2020-01-01", "Labrador", true);
        assertTrue(cachorro.isAdestrado());
    }

    @Test
    void isAdestradoReturnsFalseWhenNotAdestrado() {
        Cachorro cachorro = new Cachorro("Rex", "2020-01-01", "Labrador", false);
        assertFalse(cachorro.isAdestrado());
    }

    @Test
    void constructorInitializesFieldsCorrectly() {
        Cachorro cachorro = new Cachorro("Rex", "2020-01-01", "Labrador", true);
        assertEquals("Rex", cachorro.getNome());
        assertEquals("2020-01-01", cachorro.getDataNascimento());
        assertEquals("Labrador", cachorro.getRaca());
        assertTrue(cachorro.isAdestrado());
    }
}
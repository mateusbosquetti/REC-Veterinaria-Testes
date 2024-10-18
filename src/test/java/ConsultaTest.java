import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ConsultaTest {
    @Test
    void consultaInicializaCamposCorretamente() {
        Animal animal = new Cachorro("Rex", "2020-01-01", "Labrador", true);
        Veterinario veterinario = new Veterinario("Dr. Smith", "123.456.789-00", "99999-9999");
        Procedimento procedimento = new Procedimento("Vacinação", 50.0, true, true);
        Consulta consulta = new Consulta(animal, veterinario, "2023-10-10", procedimento);
        assertEquals(animal, consulta.getAnimal());
        assertEquals(veterinario, consulta.getVeterinario());
        assertEquals("2023-10-10", consulta.getData());
        assertEquals(procedimento, consulta.getProcedimento());
        assertFalse(consulta.isAtendida());
        assertFalse(consulta.isValidada());
    }

    @Test
    void consultaAtendidaComSucesso() {
        Animal animal = new Cachorro("Rex", "2020-01-01", "Labrador", true);
        Veterinario veterinario = new Veterinario("Dr. Smith", "123.456.789-00", "99999-9999");
        Procedimento procedimento = new Procedimento("Vacinação", 50.0, true, true);
        Consulta consulta = new Consulta(animal, veterinario, "2023-10-10", procedimento);
        consulta.validar();
        consulta.atender();
        assertTrue(consulta.isAtendida());
    }

    @Test
    void consultaNaoAtendidaSeNaoValidada() {
        Animal animal = new Cachorro("Rex", "2020-01-01", "Labrador", true);
        Veterinario veterinario = new Veterinario("Dr. Smith", "123.456.789-00", "99999-9999");
        Procedimento procedimento = new Procedimento("Vacinação", 50.0, true, true);
        Consulta consulta = new Consulta(animal, veterinario, "2023-10-10", procedimento);
        consulta.atender();
        assertFalse(consulta.isAtendida());
    }

    @Test
    void consultaValidadaComSucesso() {
        Animal animal = new Cachorro("Rex", "2020-01-01", "Labrador", true);
        Veterinario veterinario = new Veterinario("Dr. Smith", "123.456.789-00", "99999-9999");
        Procedimento procedimento = new Procedimento("Vacinação", 50.0, true, true);
        Consulta consulta = new Consulta(animal, veterinario, "2023-10-10", procedimento);
        assertTrue(consulta.validar());
    }

    @Test
    void consultaNaoValidadaSeJaAtendida() {
        Animal animal = new Cachorro("Rex", "2020-01-01", "Labrador", true);
        Veterinario veterinario = new Veterinario("Dr. Smith", "123.456.789-00", "99999-9999");
        Procedimento procedimento = new Procedimento("Vacinação", 50.0, true, true);
        Consulta consulta = new Consulta(animal, veterinario, "2023-10-10", procedimento);
        consulta.validar();
        consulta.atender();
        assertFalse(consulta.validar());
    }
}
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VeterinarioTest {
    @Test
    void adicionarProcedimentoComSucesso() {
        Veterinario veterinario = new Veterinario("Dr. Smith", "123.456.789-00", "99999-9999");
        Procedimento procedimento = new Procedimento("Vacinação", 50.0, true, true);
        String resultado = veterinario.adicionarProcedimento(procedimento);
        assertEquals("Procedimento cadastrado com sucesso", resultado);
        assertTrue(veterinario.getProcedimentos().contains(procedimento));
    }

    @Test
    void adicionarProcedimentoJaCadastrado() {
        Veterinario veterinario = new Veterinario("Dr. Smith", "123.456.789-00", "99999-9999");
        Procedimento procedimento = new Procedimento("Vacinação", 50.0, true, true);
        veterinario.adicionarProcedimento(procedimento);
        String resultado = veterinario.adicionarProcedimento(procedimento);
        assertEquals("Procedimento já cadastrado", resultado);
    }

    @Test
    void adicionarProcedimentoInvalido() {
        Veterinario veterinario = new Veterinario("Dr. Smith", "123.456.789-00", "99999-9999");
        String resultado = veterinario.adicionarProcedimento(null);
        assertEquals("Procedimento inválido", resultado);
    }

    @Test
    void removerProcedimentoComSucesso() {
        Veterinario veterinario = new Veterinario("Dr. Smith", "123.456.789-00", "99999-9999");
        Procedimento procedimento = new Procedimento("Vacinação", 50.0, true, true);
        veterinario.adicionarProcedimento(procedimento);
        String resultado = veterinario.removerProcedimento(procedimento);
        assertEquals("Procedimento removido com sucesso", resultado);
        assertFalse(veterinario.getProcedimentos().contains(procedimento));
    }

    @Test
    void removerProcedimentoNaoCadastrado() {
        Veterinario veterinario = new Veterinario("Dr. Smith", "123.456.789-00", "99999-9999");
        Procedimento procedimento = new Procedimento("Vacinação", 50.0, true, true);
        String resultado = veterinario.removerProcedimento(procedimento);
        assertEquals("Procedimento não cadastrado", resultado);
    }

    @Test
    void removerProcedimentoInvalido() {
        Veterinario veterinario = new Veterinario("Dr. Smith", "123.456.789-00", "99999-9999");
        String resultado = veterinario.removerProcedimento(null);
        assertEquals("Procedimento inválido", resultado);
    }

    @Test
    void adicionarConsultaComSucesso() {
        Animal animal = new Cachorro("Rex", "01/01/2010", "Rotweiller", true);
        Veterinario veterinario = new Veterinario("Dr. Smith", "123.456.789-00", "99999-9999");
        Procedimento procedimento = new Procedimento("Vacinação", 50.0, true, true);
        veterinario.adicionarProcedimento(procedimento);
        Consulta consulta = new Consulta(animal, veterinario, "01/01/2021", procedimento);
        boolean resultado = veterinario.adicionarConsulta(consulta);
        assertTrue(resultado);
        assertTrue(veterinario.getConsultas().contains(consulta));
    }

    @Test
    void adicionarConsultaInvalida() {
        Veterinario veterinario = new Veterinario("Dr. Smith", "123.456.789-00", "99999-9999");
        boolean resultado = veterinario.adicionarConsulta(null);
        assertFalse(resultado);
    }

    @Test
    void atenderConsultaComSucesso() {
        Animal animal = new Cachorro("Rex", "01/01/2010", "Rotweiller", true);
        Veterinario veterinario = new Veterinario("Dr. Smith", "123.456.789-00", "99999-9999");
        Procedimento procedimento = new Procedimento("Vacinação", 50.0, true, true);
        veterinario.adicionarProcedimento(procedimento);
        Consulta consulta = new Consulta(animal, veterinario, "01/01/2021", procedimento);
        veterinario.adicionarConsulta(consulta);
        String resultado = veterinario.atenderConsulta(consulta);
        assertEquals("Consulta atendida com sucesso", resultado);
    }

    @Test
    void atenderConsultaNaoEncontrada() {
        Animal animal = new Cachorro("Rex", "01/01/2010", "Rotweiller", true);
        Veterinario veterinario = new Veterinario("Dr. Smith", "123.456.789-00", "99999-9999");
        Procedimento procedimento = new Procedimento("Vacinação", 50.0, true, true);
        Consulta consulta = new Consulta(animal, veterinario, "01/01/2021", procedimento);
        String resultado = veterinario.atenderConsulta(consulta);
        assertEquals("Consulta não encontrada", resultado);
    }

    @Test
    void atenderConsultaNaoPertenceAoVeterinario() {
        Animal animal = new Cachorro("Rex", "01/01/2010", "Rotweiller", true);
        Veterinario veterinario1 = new Veterinario("Dr. Smith", "123.456.789-00", "99999-9999");
        Veterinario veterinario2 = new Veterinario("Dr. John", "987.654.321-00", "88888-8888");
        Procedimento procedimento = new Procedimento("Vacinação", 50.0, true, true);
        veterinario1.adicionarProcedimento(procedimento);
        Consulta consulta = new Consulta(animal, veterinario2, "01/01/2021", procedimento);
        veterinario1.adicionarConsulta(consulta);
        String resultado = veterinario1.atenderConsulta(consulta);
        assertEquals("Consulta não pertence a este veterinário", resultado);
    }
}
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    private Animal animal;
    private Cliente cliente;
    private Consulta consulta;

    @BeforeEach
    void setUp() {
        animal = new Cachorro("Rex", "01/01/2020", "Labrador", true);
        cliente = new Cliente("João", "123.456.789-00", "99999-9999");
        consulta = new Consulta(animal, new Veterinario("Dr. Silva", "1234", "1234"), "10/10/2023", new Procedimento("Vacinação", 100.0, true, true));
    }

    @Test
    void adicionarConsultaComSucesso() {
        String resultado = animal.adicionarConsulta(consulta);
        assertEquals("Consulta cadastrada com sucesso", resultado);
    }

    @Test
    void adicionarConsultaJaCadastrada() {
        animal.adicionarConsulta(consulta);
        String resultado = animal.adicionarConsulta(consulta);
        assertEquals("Consulta já cadastrada", resultado);
    }

    @Test
    void adicionarConsultaInvalida() {
        String resultado = animal.adicionarConsulta(null);
        assertEquals("Consulta inválida", resultado);
    }

    @Test
    void adicionarDonoComSucesso() {
        String resultado = animal.adicionarDono(cliente);
        assertEquals("Dono cadastrado com sucesso", resultado);
        assertEquals(cliente, animal.getDono());
    }

    @Test
    void adicionarDonoJaCadastrado() {
        animal.adicionarDono(cliente);
        String resultado = animal.adicionarDono(cliente);
        assertEquals("Dono já cadastrado", resultado);
    }

    @Test
    void adicionarDonoInvalido() {
        String resultado = animal.adicionarDono(null);
        assertEquals("Dono inválido", resultado);
    }

    @Test
    void removerDono() {
        animal.adicionarDono(cliente);
        assertNotNull(animal.getDono());
        animal.removerDono();
        assertNull(animal.getDono());
    }

    @Test
    void getNomeRetornaNomeCorreto() {
        assertEquals("Rex", animal.getNome());
    }

    @Test
    void getDataNascimentoRetornaDataCorreta() {
        assertEquals("01/01/2020", animal.getDataNascimento());
    }

    @Test
    void getConsultasRetornaListaVaziaInicialmente() {
        assertTrue(animal.getConsultas().isEmpty());
    }

    @Test
    void getConsultasRetornaListaComConsultas() {
        animal.adicionarConsulta(consulta);
        assertFalse(animal.getConsultas().isEmpty());
        assertEquals(1, animal.getConsultas().size());
        assertEquals(consulta, animal.getConsultas().get(0));
    }
}
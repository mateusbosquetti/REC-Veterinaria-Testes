import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class VeterinariaTest {

    private Veterinaria veterinaria;
    private Cliente cliente;
    private Animal cachorro;
    private Animal gato;
    private Consulta consulta;
    private Veterinario veterinario;
    private Procedimento procedimento;

    @BeforeEach
    public void setUp() {
        veterinaria = new Veterinaria();
        cliente = new Cliente("John Doe", "12345678900", "123456789");
        cachorro = new Cachorro("Rex", "2020-01-01", "Rotweiller", true);
        gato = new Gato("Felix", "2019-01-01", "Siames", true);
        consulta = new Consulta(cachorro, veterinario, "2023-10-10", procedimento);
        veterinario = new Veterinario("Dr. Smith", "98765432100", "123456789");
        procedimento = new Procedimento("Vaccination", 50.0, true, true);
    }

    @Test
    public void testAdicionarCliente() throws IllegalAccessException, NoSuchFieldException {
        assertEquals("Cliente cadastrado com sucesso", veterinaria.adicionarCliente(cliente));
        assertEquals("Cliente já cadastrado", veterinaria.adicionarCliente(cliente));
        Field field = veterinaria.getClass().getDeclaredField("clientes");
        field.setAccessible(true);
        field.set(veterinaria, null);
        assertEquals("Cliente inválido", veterinaria.adicionarCliente(cliente));
    }

    @Test
    public void testRemoverCliente() throws IllegalAccessException, NoSuchFieldException {
        veterinaria.adicionarCliente(cliente);
        assertEquals("Cliente removido com sucesso", veterinaria.removerCliente(cliente));
        assertEquals("Cliente não cadastrado", veterinaria.removerCliente(cliente));
        Field field = veterinaria.getClass().getDeclaredField("clientes");
        field.setAccessible(true);
        field.set(veterinaria, null);
        assertEquals("Cliente inválido", veterinaria.removerCliente(cliente));
    }

    @Test
    public void testBuscarCliente() {
        veterinaria.adicionarCliente(cliente);
        assertEquals(cliente, veterinaria.buscarCliente("12345678900"));
        assertNull(veterinaria.buscarCliente("00000000000"));
    }

    @Test
    public void testAdicionarAnimal() throws IllegalAccessException, NoSuchFieldException {
        assertEquals("Animal cadastrado com sucesso", veterinaria.adicionarAnimal(cachorro));
        assertEquals("Animal já cadastrado", veterinaria.adicionarAnimal(cachorro));
        Field field = veterinaria.getClass().getDeclaredField("pets");
        field.setAccessible(true);
        field.set(veterinaria, null);
        assertEquals("Animal inválido", veterinaria.adicionarAnimal(cachorro));
    }

    @Test
    public void testRemoverAnimal() throws IllegalAccessException, NoSuchFieldException {
        veterinaria.adicionarAnimal(cachorro);
        assertEquals("Animal removido com sucesso", veterinaria.removerAnimal(cachorro));
        assertEquals("Animal não cadastrado", veterinaria.removerAnimal(cachorro));
        Field field = veterinaria.getClass().getDeclaredField("pets");
        field.setAccessible(true);
        field.set(veterinaria, null);
        assertEquals("Animal inválido", veterinaria.removerAnimal(cachorro));
    }

    @Test
    public void testBuscarAnimal() {
        veterinaria.adicionarAnimal(cachorro);
        assertEquals(cachorro, veterinaria.buscarAnimal("Rex"));
        assertNull(veterinaria.buscarAnimal("Unknown"));
    }

    @Test
    public void testAdicionarConsulta() throws IllegalAccessException, NoSuchFieldException {
        assertEquals("Consulta cadastrada com sucesso", veterinaria.adicionarConsulta(consulta));
        assertEquals("Consulta já cadastrada", veterinaria.adicionarConsulta(consulta));
        Field field = veterinaria.getClass().getDeclaredField("consultas");
        field.setAccessible(true);
        field.set(veterinaria, null);
        assertEquals("Consulta inválida", veterinaria.adicionarConsulta(consulta));
    }

    @Test
    public void testRemoverConsulta() throws IllegalAccessException, NoSuchFieldException {
        veterinaria.adicionarConsulta(consulta);
        assertEquals("Consulta removida com sucesso", veterinaria.removerConsulta(consulta));
        assertEquals("Consulta não cadastrada", veterinaria.removerConsulta(consulta));
        Field field = veterinaria.getClass().getDeclaredField("consultas");
        field.setAccessible(true);
        field.set(veterinaria, null);
        assertEquals("Consulta inválida", veterinaria.removerConsulta(consulta));
    }

    @Test
    public void testBuscarConsulta() {
        veterinaria.adicionarConsulta(consulta);
        assertEquals(consulta, veterinaria.buscarConsulta(consulta.getId()));
        assertNull(veterinaria.buscarConsulta(999));
    }

    @Test
    public void testAdicionarVeterinario() throws IllegalAccessException, NoSuchFieldException {
        assertEquals("Veterinário cadastrado com sucesso", veterinaria.adicionarVeterinario(veterinario));
        assertEquals("Veterinário já cadastrado", veterinaria.adicionarVeterinario(veterinario));
        Field field = veterinaria.getClass().getDeclaredField("veterinarios");
        field.setAccessible(true);
        field.set(veterinaria, null);
        assertEquals("Veterinário inválido", veterinaria.adicionarVeterinario(veterinario));
    }

    @Test
    public void testRemoverVeterinario() throws IllegalAccessException, NoSuchFieldException {
        veterinaria.adicionarVeterinario(veterinario);
        assertEquals("Veterinário removido com sucesso", veterinaria.removerVeterinario(veterinario));
        assertEquals("Veterinário não cadastrado", veterinaria.removerVeterinario(veterinario));
        Field field = veterinaria.getClass().getDeclaredField("veterinarios");
        field.setAccessible(true);
        field.set(veterinaria, null);
        assertEquals("Veterinário inválido", veterinaria.removerVeterinario(veterinario));
    }

    @Test
    public void testBuscarVeterinario() {
        veterinaria.adicionarVeterinario(veterinario);
        assertEquals(veterinario, veterinaria.buscarVeterinario("98765432100"));
        assertNull(veterinaria.buscarVeterinario("00000000000"));
    }

    @Test
    public void testAdicionarProcedimento() throws IllegalAccessException, NoSuchFieldException {
        assertEquals("Procedimento cadastrado com sucesso", veterinaria.adicionarProcedimento(procedimento));
        assertEquals("Procedimento já cadastrado", veterinaria.adicionarProcedimento(procedimento));
        Field field = veterinaria.getClass().getDeclaredField("procedimentos");
        field.setAccessible(true);
        field.set(veterinaria, null);
        assertEquals("Procedimento inválido", veterinaria.adicionarProcedimento(procedimento));
    }

    @Test
    public void testRemoverProcedimento() throws IllegalAccessException, NoSuchFieldException {
        veterinaria.adicionarProcedimento(procedimento);
        assertEquals("Procedimento removido com sucesso", veterinaria.removerProcedimento(procedimento));
        assertEquals("Procedimento não cadastrado", veterinaria.removerProcedimento(procedimento));
        Field field = veterinaria.getClass().getDeclaredField("procedimentos");
        field.setAccessible(true);
        field.set(veterinaria, null);
        assertEquals("Procedimento inválido", veterinaria.removerProcedimento(procedimento));
    }

    @Test
    public void testBuscarProcedimento() {
        veterinaria.adicionarProcedimento(procedimento);
        assertEquals(procedimento, veterinaria.buscarProcedimento("Vaccination"));
        assertNull(veterinaria.buscarProcedimento("Unknown"));
    }
}
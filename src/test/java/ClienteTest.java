import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.*;

public class ClienteTest {
    @Test
    void adicionarPetComSucesso() {
        Cliente cliente = new Cliente("João", "123.456.789-00", "99999-9999");
        Animal pet = new Cachorro("Rex", "2020-01-01", "Labrador", true);
        String resultado = cliente.adicionarPet(pet);
        assertEquals("Pet cadastrado com sucesso", resultado);
        assertTrue(cliente.getPets().contains(pet));
        assertEquals(cliente, pet.getDono());
    }

    @Test
    void adicionarPetJaCadastrado() {
        Cliente cliente = new Cliente("João", "123.456.789-00", "99999-9999");
        Animal pet = new Cachorro("Rex", "2020-01-01", "Labrador", true);
        cliente.adicionarPet(pet);
        String resultado = cliente.adicionarPet(pet);
        assertEquals("Pet já cadastrado", resultado);
    }

    @Test
    void adicionarPetInvalido() throws IllegalAccessException, NoSuchFieldException {
        Cliente cliente = new Cliente("João", "123.456.789-00", "99999-9999");
        Field pets = cliente.getClass().getDeclaredField("pets");
        pets.setAccessible(true);
        pets.set(cliente, null);
        String resultado = cliente.adicionarPet(null);
        assertEquals("Pet inválido", resultado);
    }

    @Test
    void removerPetComSucesso() {
        Cliente cliente = new Cliente("João", "123.456.789-00", "99999-9999");
        Animal pet = new Cachorro("Rex", "2020-01-01", "Labrador", true);
        cliente.adicionarPet(pet);
        String resultado = cliente.removerPet(pet);
        assertEquals("Pet removido com sucesso", resultado);
        assertFalse(cliente.getPets().contains(pet));
        assertNull(pet.getDono());
    }

    @Test
    void removerPetNaoCadastrado() {
        Cliente cliente = new Cliente("João", "123.456.789-00", "99999-9999");
        Animal pet = new Cachorro("Rex", "2020-01-01", "Labrador", true);
        String resultado = cliente.removerPet(pet);
        assertEquals("Pet não cadastrado", resultado);
    }

    @Test
    void removerPetInvalido() throws IllegalAccessException, NoSuchFieldException {
        Cliente cliente = new Cliente("João", "123.456.789-00", "99999-9999");
        Field pets = cliente.getClass().getDeclaredField("pets");
        pets.setAccessible(true);
        pets.set(cliente, null);
        String resultado = cliente.removerPet(null);
        assertEquals("Pet inválido", resultado);
    }

    @Test
    void getPetsRetornaListaVaziaInicialmente() {
        Cliente cliente = new Cliente("João", "123.456.789-00", "99999-9999");
        assertTrue(cliente.getPets().isEmpty());
    }

    @Test
    void getPetsRetornaListaComPets() {
        Cliente cliente = new Cliente("João", "123.456.789-00", "99999-9999");
        Animal pet = new Cachorro("Rex", "2020-01-01", "Labrador", true);
        cliente.adicionarPet(pet);
        assertFalse(cliente.getPets().isEmpty());
        assertEquals(1, cliente.getPets().size());
        assertEquals(pet, cliente.getPets().get(0));
    }
}
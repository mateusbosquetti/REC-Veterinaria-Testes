import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PessoaTest {
    @Test
    void getCpfReturnsCorrectCpf() {
        Pessoa pessoa = new Cliente("João", "123.456.789-00", "99999-9999");
        assertEquals("123.456.789-00", pessoa.getCpf());
    }

    @Test
    void getNomeReturnsCorrectNome() {
        Pessoa pessoa = new Cliente("João", "123.456.789-00", "99999-9999");
        assertEquals("João", pessoa.getNome());
    }

    @Test
    void getTelefoneReturnsCorrectTelefone() {
        Pessoa pessoa = new Cliente("João", "123.456.789-00", "99999-9999");
        assertEquals("99999-9999", pessoa.getTelefone());
    }

    @Test
    void constructorInitializesFieldsCorrectly() {
        Pessoa pessoa = new Cliente("João", "123.456.789-00", "99999-9999");
        assertEquals("João", pessoa.getNome());
        assertEquals("123.456.789-00", pessoa.getCpf());
        assertEquals("99999-9999", pessoa.getTelefone());
    }
}
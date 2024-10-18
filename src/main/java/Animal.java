import java.util.ArrayList;
import java.util.List;

public abstract class Animal {

    private ArrayList<Consulta> consultas;
    private String nome;
    private Cliente dono;
    private String dataNascimento;

    public Animal(String nome, String dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        consultas = new ArrayList<>();
    }

    public String adicionarConsulta(Consulta consulta) {
        if (consulta == null) {
            return "Consulta inválida";
        } else if (consultas.contains(consulta)) {
            return "Consulta já cadastrada";
        } else {
            consultas.add(consulta);
            return "Consulta cadastrada com sucesso";
        }
    }

    public String adicionarDono(Cliente cliente) {
        if (cliente == null) {
            return "Dono inválido";
        } else if (dono == cliente) {
            return "Dono já cadastrado";
        } else {
            this.dono = cliente;
            return "Dono cadastrado com sucesso";
        }
    }

    public void removerDono() {
        this.dono = null;
    }

    public ArrayList<Consulta> getConsultas() {
        return consultas;
    }

    public String getNome() {
        return nome;
    }

    public Cliente getDono() {
        return dono;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "consultas=" + consultas +
                ", nome='" + nome + '\'' +
                ", dono=" + dono +
                ", dataNascimento='" + dataNascimento + '\'' +
                '}';
    }
}

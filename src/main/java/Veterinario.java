import java.util.ArrayList;
import java.util.List;

public class Veterinario extends Pessoa {

    public Veterinario(String nome, String cpf, String telefone) {
        super(nome, cpf, telefone);
        this.procedimentos = new ArrayList<>();
        this.consultas = new ArrayList<>();
    }

    ArrayList<Procedimento> procedimentos;
    ArrayList<Consulta> consultas;

    public String adicionarProcedimento(Procedimento procedimento) {
        if (procedimento == null) {
            return "Procedimento inválido";
        } else if (procedimentos.contains(procedimento)) {
            return "Procedimento já cadastrado";
        } else {
            procedimentos.add(procedimento);
            return "Procedimento cadastrado com sucesso";
        }
    }

    public String removerProcedimento(Procedimento procedimento) {
        if (procedimento == null) {
            return "Procedimento inválido";
        } else if (!procedimentos.contains(procedimento)) {
            return "Procedimento não cadastrado";
        } else {
            procedimentos.remove(procedimento);
            return "Procedimento removido com sucesso";
        }
    }

    /* ANTIGO METODO
        public boolean adicionarConsulta(Consulta consulta) {
            if (consulta == null) {
                return false;
            } else if (consultas.contains(consulta)) {
                return false;
            } else if (!procedimentos.contains(consulta.getProcedimento())){
                return false;
            } else if (consulta.getVeterinario() != this) {
                return false;
            } else {
                consultas.add(consulta);
                return true;
            }
        }

     */
    public boolean adicionarConsulta(Consulta consulta) {
        if (consulta == null) {
            return false;
        } else if (consultas.contains(consulta)) {
            return false;
        } else if (!procedimentos.contains(consulta.getProcedimento())) {
            return false;
        } else if (consulta.getVeterinario() != this) {
            Veterinario veterinario = this;
            veterinario.getConsultas().add(consulta);
            return false;
        } else {
            consultas.add(consulta);
            return true;
        }
    }

    public String atenderConsulta(Consulta consulta) {
        if (!consultas.contains(consulta)) {
            return "Consulta não encontrada";
        } else if (consulta.getVeterinario() != this) {
            return "Consulta não pertence a este veterinário";
        } else {
            consulta.atender();
            return "Consulta atendida com sucesso";
        }
    }

    public ArrayList<Procedimento> getProcedimentos() {
        return procedimentos;
    }

    public ArrayList<Consulta> getConsultas() {
        return consultas;
    }

    @Override
    public String toString() {
        return super.toString() + "Veterinario{" +
                "procedimentos=" + procedimentos +
                ", consultas=" + consultas +
                '}';
    }
}

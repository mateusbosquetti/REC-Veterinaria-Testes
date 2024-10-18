import java.util.ArrayList;

public class Veterinaria {

    private ArrayList<Cliente> clientes;
    private ArrayList<Consulta> consultas;
    private ArrayList<Animal> pets;
    private ArrayList<Procedimento> procedimentos;
    private ArrayList<Veterinario> veterinarios;

    public Veterinaria(){
        this.clientes = new ArrayList<>();
        this.consultas = new ArrayList<>();
        this.pets = new ArrayList<>();
        this.procedimentos = new ArrayList<>();
        this.veterinarios = new ArrayList<>();
    }

    //ADICIONAR
    public String adicionarAnimal(Animal animal) {
        if (pets == null) {
            return "Animal inválido";
        } else if (pets.contains(animal)) {
            return "Animal já cadastrado";
        } else {
            pets.add(animal);
            return "Animal cadastrado com sucesso";
        }
    }

    public String adicionarCliente(Cliente cliente) {
        if (clientes == null) {
            return "Cliente inválido";
        } else if (clientes.contains(cliente)) {
            return "Cliente já cadastrado";
        } else {
            clientes.add(cliente);
            return "Cliente cadastrado com sucesso";
        }
    }

    public String adicionarConsulta(Consulta consulta) {
        if (consultas == null) {
            return "Consulta inválida";
        } else if (consultas.contains(consulta)) {
            return "Consulta já cadastrada";
        } else {
            consultas.add(consulta);
            return "Consulta cadastrada com sucesso";
        }
    }

    public String adicionarProcedimento(Procedimento procedimento) {
        if (procedimentos == null) {
            return "Procedimento inválido";
        } else if (procedimentos.contains(procedimento)) {
            return "Procedimento já cadastrado";
        } else {
            procedimentos.add(procedimento);
            return "Procedimento cadastrado com sucesso";
        }
    }

    public String adicionarVeterinario(Veterinario veterinario) {
        if (veterinarios == null) {
            return "Veterinário inválido";
        } else if (veterinarios.contains(veterinario)) {
            return "Veterinário já cadastrado";
        } else {
            veterinarios.add(veterinario);
            return "Veterinário cadastrado com sucesso";
        }
    }

    public Animal buscarAnimal(String nome) {
        for (Animal animal : pets) {
            if (animal.getNome().equals(nome)) {
                return animal;
            }
        }
        return null;
    }

    public Cliente buscarCliente(String cpf) {
        for (Cliente cliente : clientes) {
            if (cliente.getCpf().equals(cpf)) {
                return cliente;
            }
        }
        return null;
    }

    public Consulta buscarConsulta(int id) {
        for (Consulta consulta : consultas) {
            if (consulta.getId() == id) {
                return consulta;
            }
        }
        return null;
    }

    public Procedimento buscarProcedimento(String nome) {
        for (Procedimento procedimento : procedimentos) {
            if (procedimento.getNome().equals(nome)) {
                return procedimento;
            }
        }
        return null;
    }

    public Veterinario buscarVeterinario(String cpf) {
        for (Veterinario veterinario : veterinarios){
            if (veterinario.getCpf().equals(cpf)){
                return veterinario;
            }
        }
        return null;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }


    public ArrayList<Consulta> getConsultas() {
        return consultas;
    }


    public ArrayList<Animal> getPets() {
        return pets;
    }

    public ArrayList<Procedimento> getProcedimentos() {
        return procedimentos;
    }


    public ArrayList<Veterinario> getVeterinarios() {
        return veterinarios;
    }

    public String removerAnimal(Animal animal) {
        if (pets == null) {
            return "Animal inválido";
        } else if (!pets.contains(animal)) {
            return "Animal não cadastrado";
        } else {
            pets.remove(animal);
            return "Animal removido com sucesso";
        }
    }

    public String removerCliente(Cliente cliente) {
        if (clientes == null) {
            return "Cliente inválido";
        } else if (!clientes.contains(cliente)) {
            return "Cliente não cadastrado";
        } else {
            clientes.remove(cliente);
            return "Cliente removido com sucesso";
        }
    }

    public String removerConsulta(Consulta consulta) {
        if (consultas == null) {
            return "Consulta inválida";
        } else if (!consultas.contains(consulta)) {
            return "Consulta não cadastrada";
        } else {
            consultas.remove(consulta);
            return "Consulta removida com sucesso";
        }
    }

    public String removerProcedimento(Procedimento procedimento) {
        if (procedimentos == null) {
            return "Procedimento inválido";
        } else if (!procedimentos.contains(procedimento)) {
            return "Procedimento não cadastrado";
        } else {
            procedimentos.remove(procedimento);
            return "Procedimento removido com sucesso";
        }
    }

    public String removerVeterinario(Veterinario veterinario) {
        if (veterinarios == null) {
            return "Veterinário inválido";
        } else if (!veterinarios.contains(veterinario)) {
            return "Veterinário não cadastrado";
        } else {
            veterinarios.remove(veterinario);
            return "Veterinário removido com sucesso";
        }
    }

    @Override
    public String toString() {
        return "Veterinaria{" +
                "clientes=" + clientes +
                ", consultas=" + consultas +
                ", pets=" + pets +
                ", procedimentos=" + procedimentos +
                ", veterinarios=" + veterinarios +
                '}';
    }
}

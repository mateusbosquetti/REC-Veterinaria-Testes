public class Consulta {

    private Animal animal;
    private boolean atendida;
    private static int contador = 0;
    private String data;
    private int id;
    private Procedimento procedimento;
    private boolean validada;
    private Veterinario veterinario;

    public Consulta(Animal animal, Veterinario veterinario, String data, Procedimento procedimento) {
        this.animal = animal;
        this.data = data;
        this.procedimento = procedimento;
        this.veterinario = veterinario;
        contador++;
        this.id = contador;
    }

    public void atender() {
        if (validada) {
            atendida = true;
        }
    }

    public boolean validar() {
        if (!atendida) {
            return validada = true;
        }
        return validada = false;
    }

    public Animal getAnimal() {
        return animal;
    }

    public boolean isAtendida() {
        return atendida;
    }

    public static int getContador() {
        return contador;
    }

    public String getData() {
        return data;
    }

    public int getId() {
        return id;
    }

    public Procedimento getProcedimento() {
        return procedimento;
    }

    public boolean isValidada() {
        return validada;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    @Override
    public String toString() {
        return "Consulta{" +
                "animal=" + animal +
                ", atendida=" + atendida +
                ", data='" + data + '\'' +
                ", id=" + id +
                ", procedimento=" + procedimento +
                ", validada=" + validada +
                ", veterinario=" + veterinario +
                '}';
    }
}

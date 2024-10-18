public class Gato extends Animal{

    private boolean arisco;
    private String tipoPelagem;

    public Gato(String nome, String dataNascimento,  String tipoPelagem, boolean arisco) {
        super(nome, dataNascimento);
        this.arisco = arisco;
        this.tipoPelagem = tipoPelagem;
    }

    public boolean isArisco() {
        return arisco;
    }

    public String getTipoPelagem() {
        return tipoPelagem;
    }

    @Override
    public String toString() {
        return super.toString() + "Gato{" +
                "arisco=" + arisco +
                ", tipoPelagem='" + tipoPelagem + '\'' +
                '}';
    }
}

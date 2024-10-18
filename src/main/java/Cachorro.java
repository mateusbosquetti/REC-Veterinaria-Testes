public class Cachorro extends Animal{

    private boolean adestrado;
    private String raca;

    public Cachorro(String nome, String dataNascimento, String raca, boolean adestrado) {
        super(nome, dataNascimento);
        this.adestrado = adestrado;
        this.raca = raca;
    }

    public boolean isAdestrado() {
        return adestrado;
    }

    public String getRaca() {
        return raca;
    }

    @Override
    public String toString() {
        return super.toString() + "Cachorro{" +
                "adestrado=" + adestrado +
                ", raca='" + raca + '\'' +
                '}';
    }
}

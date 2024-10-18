public class Procedimento {

    private boolean cachorro;
    private boolean gato;
    private String nome;
    private double preco;

    public Procedimento( String nome, double preco, boolean gato, boolean cachorro) {
        this.cachorro = cachorro;
        this.gato = gato;
        this.nome = nome;
        this.preco = preco;
    }

    public boolean isCachorro() {
        return cachorro;
    }

    public boolean isGato() {
        return gato;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Procedimento{" +
                "cachorro=" + cachorro +
                ", gato=" + gato +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }
}

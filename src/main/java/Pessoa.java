public abstract class Pessoa {

    private String cpf;
    private String telefone;
    private String nome;

    public Pessoa(String nome, String cpf, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "cpf='" + cpf + '\'' +
                ", telefone='" + telefone + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }
}

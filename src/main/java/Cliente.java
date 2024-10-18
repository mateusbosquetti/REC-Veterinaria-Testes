import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa {

    private ArrayList<Animal> pets;

    public Cliente(String nome, String cpf, String telefone) {
        super(nome, cpf, telefone);
        pets = new ArrayList<>();
    }

    public String adicionarPet(Animal animal){
        if (pets == null) {
            return "Pet inválido";
        } else if (pets.contains(animal)) {
            return "Pet já cadastrado";
        } else {
            pets.add(animal);
            animal.adicionarDono(this);
            return "Pet cadastrado com sucesso";
        }
    }

    public String removerPet(Animal animal){
        if (pets == null) {
            return "Pet inválido";
        } else if (!pets.contains(animal)) {
            return "Pet não cadastrado";
        } else {
            pets.remove(animal);
            animal.removerDono();
            return "Pet removido com sucesso";
        }
    }

    public ArrayList<Animal> getPets() {
        return pets;
    }

    @Override
    public String toString() {
        return super.toString() + "Cliente{" +
                "pets=" + pets +
                '}';
    }
}

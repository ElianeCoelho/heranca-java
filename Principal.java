// Classe mãe (Abstração)
class Personagem {
    protected String nome;

    public Personagem(String nome) {
        this.nome = nome;
    }

    public void atacar() {
        System.out.println(nome + " está atacando.");
    }
}

// Classes filhas (Herança)
class Guerreiro extends Personagem {
    public Guerreiro(String nome) {
        super(nome);
    }

    @Override
    public void atacar() {
        System.out.println(nome + " ataca com espada!");
    }
}

class Mago extends Personagem {
    public Mago(String nome) {
        super(nome);
    }

    @Override
    public void atacar() {
        System.out.println(nome + " lança um feitiço!");
    }
}

// Classe principal para execução (Polimorfismo)
public class Principal {
    public static void main(String[] args) {
        Personagem[] personagens = {
            new Guerreiro("Arthur"),
            new Mago("Merlin")
            // Adicionar novo personagem criado aqui
        };

        for (Personagem p : personagens) {
            p.atacar();
        }
    }
}

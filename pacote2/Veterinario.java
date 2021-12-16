package pacote2;

public class Veterinario {
    private String nome;

    public Veterinario(String nome) {
        this.nome = nome;
    }

    public void examinar(Animal animal) {
        System.out.println("Examinando...");
        animal.emitirSom();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static void main(String[] args) {
        Veterinario veterinario = new Veterinario("Dr. Dolittle");
        Preguica preguica = new Preguica("Sid",10);

        veterinario.examinar(preguica);
    }
}

package pacote2;

public class Preguica extends Animal {
    public Preguica(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Ah, que preguiça!");
    }

    @Override
    public void movimentar() {
        System.out.println("Subindo na árvore!");
    }
}

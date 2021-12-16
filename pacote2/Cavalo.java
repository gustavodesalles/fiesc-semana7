package pacote2;

public class Cavalo extends Animal {
    public Cavalo(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Iiiiiirrrríííí!");
    }

    @Override
    public void movimentar() {
        super.movimentar();
    }
}

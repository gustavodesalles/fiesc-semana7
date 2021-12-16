package pacote2;

public class Teste {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Pluto", 7);
        Cavalo cavalo = new Cavalo("BoJack", 23);
        Preguica preguica = new Preguica("Sid",10);

        cachorro.emitirSom();
        cavalo.emitirSom();
        preguica.emitirSom();

        cachorro.movimentar();
        cavalo.movimentar();
        preguica.movimentar();
    }
}

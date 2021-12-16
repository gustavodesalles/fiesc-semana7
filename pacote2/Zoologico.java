package pacote2;

import java.util.ArrayList;

public class Zoologico {
    private static ArrayList<Animal> jaulas = new ArrayList<>();

    public static void main(String[] args) {

        for (int i = 0; i < 9; i += 3) {
            Cachorro cachorro = new Cachorro("Pluto", 7);
            Cavalo cavalo = new Cavalo("BoJack", 23);
            Preguica preguica = new Preguica("Sid",10);
            jaulas.add(cachorro);
            jaulas.add(cavalo);
            jaulas.add(preguica);
        }
        Cachorro ultimo = new Cachorro("Último", 12);
        jaulas.add(ultimo);

        for (Animal j : jaulas) {
            j.emitirSom();
            if (j instanceof Cachorro || j instanceof Cavalo) j.movimentar();
        }
    }

}

package Lab2;
import Lab2.MyPokemons.*;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;

public class Program {

    //https://pokemondb.net/pokedex/jirachi
    //https://pokemondb.net/pokedex/koffing
    //https://pokemondb.net/pokedex/weezing
    //https://pokemondb.net/pokedex/chimchar
    //https://pokemondb.net/pokedex/monferno
    //https://pokemondb.net/pokedex/infernape

    public static void main(String[] args) {
        Start();
    }

    private static void Start() {
        Battle b =new Battle();

        Jirachi p1 = new Jirachi("Apple",1);
        Koffing p2 = new Koffing("lemon",1);
        Weezing p3 = new Weezing("tomato",1);
        Chimchar p4 = new Chimchar("cucumber",1);
        Monferno p5 = new Monferno("watermelon",1);
        Infernape p6 = new Infernape("cherry",1);

        b.addAlly(p1);
        b.addAlly(p3);
        b.addAlly(p5);

        b.addFoe(p2);
        b.addFoe(p4);
        b.addFoe(p6);

        b.go();

    }
}

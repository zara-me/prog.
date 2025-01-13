package Lab2.MyPokemons;

import Lab2.MyMoves.Koffing.ClearSmog;
import Lab2.MyMoves.Koffing.DoubleHit;
import Lab2.MyMoves.Koffing.Facade;
import Lab2.MyMoves.Koffing.Smokescreen;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Weezing extends Pokemon {

    public Weezing(String name, int level) {
        super(name, level);

        super.setType(Type.POISON);
        super.setStats(65, 90, 120, 85, 70, 60);

        Facade facade = new Facade(70, 100);
        ClearSmog clearSmog = new ClearSmog(50,0);
        Smokescreen smokescreen = new Smokescreen(0,100);
        DoubleHit doubleHit = new DoubleHit(35, 90);

        super.setMove(facade,clearSmog,smokescreen,doubleHit);

    }
}

package Lab2.MyPokemons;

import Lab2.MyMoves.Koffing.ClearSmog;
import Lab2.MyMoves.Koffing.Facade;
import Lab2.MyMoves.Koffing.Smokescreen;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Koffing extends Pokemon {

    public Koffing(String name, int level) {
        super(name, level);

        super.setType(Type.POISON);
        super.setStats(40,65,95,60,45,35);

        Facade facade = new Facade(70, 100);
        ClearSmog clearSmog = new ClearSmog(50,0);
        Smokescreen smokescreen = new Smokescreen(0,100);

        super.setMove(facade,clearSmog,smokescreen);

    }
}


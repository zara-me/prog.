package Lab2.MyPokemons;

import Lab2.MyMoves.Chimchar.Leer;
import Lab2.MyMoves.Chimchar.ShadowClaw;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Chimchar extends Pokemon {

    public Chimchar(String name, int level) {
        super(name, level);

        super.setType(Type.FIRE);
        super.setStats(44, 58, 44, 58, 44, 61);
        Leer leer = new Leer(0,100);
        ShadowClaw shadowClaw = new ShadowClaw(70,100);
        super.setMove(leer,shadowClaw);

    }
}
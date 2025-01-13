package Lab2.MyPokemons;

import Lab2.MyMoves.Chimchar.Leer;
import Lab2.MyMoves.Chimchar.ShadowClaw;
import Lab2.MyMoves.Chimchar.SlackOff;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Monferno extends Pokemon {
    public Monferno(String name, int level) {
        super(name, level);

        super.setType(Type.FIRE,Type.FIGHTING);
        super.setStats(64,78,52,78,52,81);
        Leer leer = new Leer(0, 100);
        ShadowClaw shadowClaw = new ShadowClaw(70, 100);
        SlackOff slackOff = new SlackOff(0,0);
        super.setMove(leer, shadowClaw,slackOff);
    }
}

package Lab2.MyPokemons;

import Lab2.MyMoves.Chimchar.Leer;
import Lab2.MyMoves.Chimchar.LowSweep;
import Lab2.MyMoves.Chimchar.ShadowClaw;
import Lab2.MyMoves.Chimchar.SlackOff;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Infernape extends Pokemon {
    public Infernape(String name, int level) {
        super(name, level);

        super.setType(Type.FIRE,Type.FIGHTING);
        super.setStats(76,104,71,104,71,108);
        Leer leer = new Leer(0, 100);
        ShadowClaw shadowClaw = new ShadowClaw(70, 100);
        SlackOff slackOff = new SlackOff(0,0);
        LowSweep lowSweep = new LowSweep(65,100);

        super.setMove(leer, shadowClaw,slackOff,lowSweep);
    }

}

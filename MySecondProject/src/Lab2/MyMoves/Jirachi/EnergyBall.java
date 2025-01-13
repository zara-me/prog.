package Lab2.MyMoves.Jirachi;

import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Stat;

public class EnergyBall extends SpecialMove {
    public EnergyBall(double pow, double acc) {
        super(Type.GRASS, pow, acc);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);

        if (Math.random() < 0.1) {
            Effect lowerSpecialDefense = new Effect().stat(Stat.SPECIAL_DEFENSE, -1);
            p.addEffect(lowerSpecialDefense);
        }
    }

    @Override
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return "does" + pieces[pieces.length - 1];
    }
}

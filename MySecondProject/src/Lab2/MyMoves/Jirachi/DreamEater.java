package Lab2.MyMoves.Jirachi;

import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Status;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Stat;

public class DreamEater extends SpecialMove {
    public DreamEater(double pow, double acc) {
        super(Type.PSYCHIC, pow, acc);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        if (p.getCondition() != Status.SLEEP) {
            p.setMod(Stat.HP, 0);
        }
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        Effect healEffect = new Effect().stat(Stat.HP, (int) (this.power * 0.5));
        p.addEffect(healEffect);
    }

    @Override
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return "does" + pieces[pieces.length - 1];
    }
}
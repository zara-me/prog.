package Lab2.MyMoves.Koffing;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class ClearSmog extends SpecialMove {

    public ClearSmog(double pow , double acc){
        super(Type.POISON,pow,acc);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);
        for (Stat stat : Stat.values()) {
            p.setMod(stat, 0);
        }
    }

    @Override
    protected String describe(){
        //class.pokemon.SampleMove
        String[] pieces = this.getClass().toString().split("\\.");
        return "does" + pieces[pieces.length-1];
    }
}

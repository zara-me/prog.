package Lab2.MyMoves.Jirachi;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Effect;

public class Thunderbolt extends SpecialMove {
    public Thunderbolt(double pow , double acc){
        super(Type.ELECTRIC,pow,acc);

    }
    @Override

    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);

        if (Math.random() < 0.1) {
            Effect.paralyze(p);
        }
    }

    @Override
    protected String describe(){
        //class.pokemon.SampleMove
        String[] pieces = this.getClass().toString().split("\\.");
        return "does" + pieces[pieces.length-1];
    }
}

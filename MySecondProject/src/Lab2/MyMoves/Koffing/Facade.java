package Lab2.MyMoves.Koffing;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Status;
import ru.ifmo.se.pokemon.Type;

public class Facade extends PhysicalMove {
    public Facade(double pow , double acc){
        super(Type.NORMAL,pow,acc);

    }
    @Override
    protected void applyOppEffects(Pokemon def) {

        if (def.getCondition() == Status.BURN || def.getCondition() == Status.PARALYZE || def.getCondition() == Status.POISON) {
            power *= 2;
        }
    }
    @Override
    protected String describe(){
        //class.pokemon.SampleMove
        String[] pieces = this.getClass().toString().split("\\.");
        return "does" + pieces[pieces.length-1];
    }
}

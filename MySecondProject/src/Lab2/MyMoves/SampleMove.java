package Lab2.MyMoves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class SampleMove extends PhysicalMove {
    public SampleMove(double pow , double acc){
        super(Type.NORMAL,pow,acc);

    }

   @Override

    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        super.applySelfEffects(p);
    }

    @Override
    protected String describe(){
        //class.pokemon.SampleMove
        String[] pieces = this.getClass().toString().split("\\.");
        return "does" + pieces[pieces.length-1];
    }
}
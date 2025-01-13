package Lab2.MyMoves.Chimchar;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Stat;

public class LowSweep extends PhysicalMove {
    public LowSweep(double pow , double acc){
        super(Type.FIGHTING,pow,acc);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);

        Effect lowerSpeed = new Effect().stat(Stat.SPEED, -1);
        p.addEffect(lowerSpeed);
    }

    @Override
    protected String describe(){
        //class.pokemon.SampleMove
        String[] pieces = this.getClass().toString().split("\\.");
        return "does" + pieces[pieces.length-1];
    }

}

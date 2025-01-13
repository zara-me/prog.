package Lab2.MyMoves.Chimchar;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Stat;

public class SlackOff extends StatusMove {
    public SlackOff(double pow , double acc){
        super(Type.NORMAL,pow,acc);

    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        super.applySelfEffects(p);

        Effect heal = new Effect().stat(Stat.HP, (int) (p.getStat(Stat.HP) * 0.5));
        p.addEffect(heal);
    }

    @Override
    protected String describe(){
        //class.pokemon.SampleMove
        String[] pieces = this.getClass().toString().split("\\.");
        return "does" + pieces[pieces.length-1];
    }


}

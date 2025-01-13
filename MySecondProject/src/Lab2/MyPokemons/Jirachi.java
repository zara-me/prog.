package Lab2.MyPokemons;

import Lab2.MyMoves.Jirachi.CosmicPower;
import Lab2.MyMoves.Jirachi.DreamEater;
import Lab2.MyMoves.Jirachi.EnergyBall;
import Lab2.MyMoves.Jirachi.Thunderbolt;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Jirachi extends Pokemon {

    public Jirachi(String name, int level) {
        super(name, level);

        super.setType(Type.STEEL,Type.PSYCHIC);
        super.setStats(100, 100, 100, 100, 100, 100);
        CosmicPower cosmicPower = new CosmicPower(0,0);
        DreamEater dreamEater = new DreamEater(100,100);
        EnergyBall energyBall = new EnergyBall(90,100);
        Thunderbolt thunderbolt = new Thunderbolt(90,100);

        super.setMove(cosmicPower,dreamEater,energyBall,thunderbolt);
    }
}

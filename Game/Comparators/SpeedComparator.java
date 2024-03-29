package Game.Comparators;

import java.util.Comparator;
import Game.Units.BaseUnit;

/**
 * SpeedComp
 */
public class SpeedComparator implements Comparator<BaseUnit> {

    @Override
    public int compare(BaseUnit unit1, BaseUnit unit2) {
        return (unit2.getSpeed() - unit1.getSpeed());

    }

}
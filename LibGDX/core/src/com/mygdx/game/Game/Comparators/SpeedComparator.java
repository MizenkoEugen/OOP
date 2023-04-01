package com.mygdx.game.Game.Comparators;

import com.mygdx.game.Game.Units.BaseUnit;
import java.util.Comparator;

public class SpeedComparator implements Comparator<BaseUnit> {

    @Override
    public int compare(BaseUnit unit1, BaseUnit unit2) {
        return (unit2.getSpeed() - unit1.getSpeed());

    }

}
package Game.Interface;

import java.util.ArrayList;

import Game.Units.BaseUnit;

public interface StepInfo {

    /**
     * @param step    шаг
     * @param getInfo информация о классе
     * 
     */

    public void step(ArrayList<BaseUnit> friends, ArrayList<BaseUnit> enemies);

    public String getInfo();

}
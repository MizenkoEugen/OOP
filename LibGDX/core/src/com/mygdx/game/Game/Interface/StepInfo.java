package com.mygdx.game.Game.Interface;

import com.mygdx.game.Game.Units.BaseUnit;

import java.util.ArrayList;

public interface StepInfo {

    /**
     * @param step    шаг
     * @param getInfo информация о классе
     * 
     */

    public void step(ArrayList<BaseUnit> friends, ArrayList<BaseUnit> enemies);

    public String getInfo();

}
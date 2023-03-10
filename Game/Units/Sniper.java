package Homework.Game.Units;

import Homework.Game.Names;

public class Sniper extends Shooter {

    public Sniper(String name, int hp) {
        super(name, hp);
        this.dexterity = 16;
        this.speed = 9;
        this.className = "Sniper";
        this.arrival();
    }

    public Sniper() {
        this(Names.getRandName(), 100);
    }

}
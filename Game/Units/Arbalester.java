package Homework.Game.Units;

import Homework.Game.Names;

public class Arbalester extends Shooter {

    public Arbalester(String name, int hp) {
        super(name, hp);
        this.dexterity = 12;
        this.speed = 4;
        this.className = "Arbalester";
        this.arrival();
    }

    public Arbalester() {
        this(Names.getRandName(), 150);
    }

}
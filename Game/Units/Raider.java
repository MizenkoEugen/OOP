package Homework.Game.Units;

import Homework.Game.Names;

public class Raider extends Unit{

    public Raider(String name, int hp) {
        super(name, hp);
        this.strength=12;
        this.dexterity=14;
        this.viability=10;
        this.speed=6;
        this.wisdom=10;
        this.charisma=10;
        this.className="Raider"; 
        this.arrival();
    }

    public Raider() {
        this(Names.getRandName(), 120);
    }

    public void daggerStrike(Unit target){
        float damade=10+(float)this.dexterity/10*(float)this.strength/10*Unit.diceRoll();
        System.out.println(this.name+" удар кинжалом "+target.getName());
        target.getDamage((int)damade);
    }
    
}
package Homework.Game.Units;

import Homework.Game.Names;

public class Spearman extends Unit{

    public Spearman(String name, int hp) {
        super(name, hp);
        this.strength=16;
        this.dexterity=10;
        this.viability=10;
        this.intelligence=10;
        this.wisdom=10;
        this.charisma=10;
        this.className="Spearman"; 
        this.arrival();
    }

    public Spearman() {
        this(Names.getRandName(), 130);
    }

    public void step(Unit target){
        float damade=15+(float)this.strength/10*Unit.diceRoll();
        System.out.println(this.name+" удар копьем "+target.getName());
        target.getDamage((int)damade);
    }

    @Override
    public void step() {
        throw new UnsupportedOperationException("Unimplemented method 'step'");
    }


    
}
package Homework.Seminar_01.Units;

import Homework.Seminar_01.Names;

public class Monk extends BaseUnit {

    public Monk(String name, int hp) {
        super(name, hp);
        this.strength=10;
        this.dexterity=8;
        this.viability=10;
        this.intelligence=12;
        this.wisdom=14;
        this.charisma=10;
        this.className="Monk";
        this.arrival();
    }

    public Monk() {
        this(Names.getRandName(), 100);
    }

    public void Healing(BaseUnit unit){
        unit.hp=unit.maxHp;
        System.out.println(this.name+ " исцеляет "+ unit.name);
    }
    
}
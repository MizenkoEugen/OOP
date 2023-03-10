package Homework.Game.Units;

import Homework.Game.Names;

public class Farmer extends Unit {

    public Farmer(String name, int hp) {
        super(name, hp);
        this.strength=10;
        this.dexterity=8;
        this.viability=10;
        this.speed=3;
        this.wisdom=8;
        this.charisma=8;
        this.className="Farmer";
        this.arrival();
    }
    public Farmer() {
        this(Names.getRandName(),100);
    }
    
    public void step(){
        System.out.println(this.className+" "+this.name+" пашет...");
       }
    }
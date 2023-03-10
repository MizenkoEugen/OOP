package Homework.Game.Units;

import Homework.Game.Names;

public class Wizard extends Unit {
    private int mana;
    private int maxMana;

    public Wizard(String name, int hp) {
        super(name, hp);
        this.strength = 8;
        this.dexterity = 10;
        this.viability = 8;
        this.intelligence = 14;
        this.wisdom = 10;
        this.charisma = 10;
        this.maxMana = 100;
        this.mana = this.maxMana;
        this.className = "Wizard";
        this.arrival();
    }

    public Wizard() {
        this(Names.getRandName(), 100);
    }

    public void step(Unit target) {
        if (this.mana > 0) {
            this.mana -= 5;
            float damade = 12 + (float) this.dexterity / 10 * Unit.diceRoll();
            System.out.println(this.name + " применяет заклинание на " + target.getName());
            target.getDamage((int) damade);
        } else
            System.out.println("Манна закончилась!");
    }

    @Override
    public String getInfo() {
        String str = super.getInfo() + " manna " + this.mana;
        return str;
    }

}
package Game.Units;

import Game.Additional.Names;

public class Wizard extends BaseUnit {
    public Wizard(String name, int x, int y) {

        super(name, x, y);
        this.attack = 17;
        this.defence = 12;
        this.damage[0] = -5;
        this.damage[1] = -5;
        this.hp = 30;
        this.maxHp = 30;
        this.speed = 9;
        this.className = "Колдун";

    }

    public Wizard(int x, int y) {
        this(Names.getRandName(), x, y);
    }

}
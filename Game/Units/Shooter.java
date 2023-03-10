package Homework.Game.Units;

public abstract class Shooter extends Unit {
    protected int arrows;

    public Shooter(String name, int hp) {
        super(name, hp);
        this.strength = 10;
        this.dexterity = 12;
        this.viability = 10;
        this.wisdom = 10;
        this.charisma = 8;
        this.arrows = 20;
    }


    public void shooting(Unit target) {
        if (this.arrows > 0) {
            this.arrows--;
            float damade = 12 + (float) this.dexterity / 10 * Unit.diceRoll();
            System.out.println(this.name + " стреляет в " + target.getName());
            target.getDamage((int) damade);
        } else
            System.out.println("Стрелы закончились!");
    }

    @Override
    public String getInfo() {
        String str = super.getInfo() + " arrows " + this.arrows;
        return str;
    }

}

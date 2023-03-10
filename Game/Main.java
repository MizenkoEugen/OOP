package Homework.Game;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

import Homework.Game.Units.*;

/**
* Создать в основной программе два списка. Положить в них по 10 случайных персонажей.
* В первом только крестьянин, разбойник, снайпер или колдун.
* Во втором крестьянин, копейщик, арбалетчик, монах.
* Вывести в консоль информацию обо всех персонажах не зависимо от списка, очередь должна определяться скоростью каждого персонажа.
*/

public class Main {
    public static void main(String[] args) {

        ArrayList<Unit> list1 = new ArrayList<>();
        ArrayList<Unit> list2 = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            switch (new Random().nextInt(4)) {
                case 0:
                    list1.add(new Farmer());
                    break;
                case 1:
                    list1.add(new Raider());
                    break;
                case 2:
                    list1.add(new Sniper());
                    break;
                default:
                    list1.add(new Wizard());
                    break;
            }
        }

        for (int i = 0; i < 10; i++) {
            switch (new Random().nextInt(4)) {
                case 0:
                    list2.add(new Farmer());
                    break;
                case 1:
                    list2.add(new Spearman());
                    break;
                case 2:
                    list2.add(new Arbalester());
                    break;
                default:
                    list2.add(new Monk());
                    break;
            }
        }
        // System.out.println();
        // list1.forEach(t -> System.out.println(t.getInfo()));
        // System.out.println();
        // list2.forEach(u -> System.out.println(u.getInfo()));

        ArrayList<Unit> allUnits = new ArrayList<>();
        allUnits.addAll(list1);
        allUnits.addAll(list2);
        allUnits.sort(new Comparator<Unit>() {
            @Override
            public int compare(Unit u1, Unit u2) {
                if (u1.getSpeed() == u2.getSpeed())
                    return 0;
                else if (u1.getSpeed() < u2.getSpeed())
                    return 1;
                else
                    return -1;
            }
        });

        System.out.println();
        allUnits.forEach(u -> System.out.println(u.getInfo()));

        // raider1.step(sniper1);
        // System.out.println(sniper1.getInfo());
        // monk1.step(sniper1);
        // System.out.println(sniper1.getInfo());
        // arb1.step(sniper1);
        // System.out.println(sniper1.getInfo());
        // wiz1.step(sniper1);
        // System.out.println(arb1.getInfo());
        // System.out.println(spearman1.getInfo());
        // System.out.println(wiz1.getInfo());
    }

}
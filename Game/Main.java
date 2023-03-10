package Homework.Game;

import java.util.ArrayList;
import java.util.Random;

import Homework.Game.Units.*;

/**
 * Крестьянин, разбойник, снайпер, колдун, копейщик, арбалетчик, монах.
 * Для каждого сформировать список свойств и возможных действий.
 * Например свойство скорость, действие нанести удар.
 * Проанализировать получившиеся свойства и действия персонажей и создать
 * Обобщённый класс
 * описывающий свойства и действия имеющиеся у всех персонажей.
 * Создать этот класс.
 * Создать классы для каждого типа персонажей наследующие и расширяющие
 * абстрактный(обобщённый) класс.
 * В основной программе создать по одному экземпляру каждого типа персонажей.
 */

/**
 * Добавить файл с описанием интерфейса. В котором описать два метода, void step();
 * и String getInfo(); Реализовать интерфейсs в абстрактном классе и в наследниках так,
 * чтобы getInfo возвращал тип персонажа. Создать два списка в классе main. В
 * кждый из
 * списков добавить по десять экземнляров наследников BaseHero. Удалить ненужные
 * методы
 * из абстрактного класса, если такие есть. В main пройти по спискам и вызвать у
 * всех персонажей getInfo.
 */

public class Main {
    public static void main(String[] args) {

        // Farmer farm1 = new Farmer();
        // Arbalester arb1 = new Arbalester();
        // Sniper sniper1 = new Sniper();
        // Monk monk1 = new Monk();
        // Raider raider1 = new Raider();
        // Spearman spearman1 = new Spearman();
        // Wizard wiz1 = new Wizard();

        ArrayList<Unit> list1 = new ArrayList<>();
        ArrayList<Unit> list2 = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            switch (new Random().nextInt(7)) {
                case 0:
                    list1.add(new Farmer());
                    break;
                case 1:
                    list1.add(new Monk());
                    break;
                case 2:
                    list1.add(new Raider());
                    break;
                case 3:
                    list1.add(new Arbalester());
                    break;
                case 4:
                    list1.add(new Sniper());
                    break;
                case 5:
                    list1.add(new Spearman());
                    break;
                default:
                    list1.add(new Wizard());
                    break;
            }
        }

        for (int i = 0; i < 10; i++) {
            switch (new Random().nextInt(7)) {
                case 0:
                    list2.add(new Farmer());
                    break;
                case 1:
                    list2.add(new Monk());
                    break;
                case 2:
                    list2.add(new Raider());
                    break;
                case 3:
                    list2.add(new Arbalester());
                    break;
                case 4:
                    list2.add(new Sniper());
                    break;
                case 5:
                    list2.add(new Spearman());
                    break;
                default:
                    list2.add(new Wizard());
                    break;
            }
        }
        System.out.println();
        list1.forEach(t -> System.out.println(t.getInfo()));
        System.out.println();
        list2.forEach(u -> System.out.println(u.getInfo()));

        // farm1.waiting();
        // list1[2].step(list2[1]);

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
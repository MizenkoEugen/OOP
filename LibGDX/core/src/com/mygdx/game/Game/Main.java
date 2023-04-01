package com.mygdx.game.Game;

import com.mygdx.game.Game.Additional.BattleField;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      int n = 0;
      BattleField.start();
      ConsoleView.view();
      while (n == 0) {
        String command = sc.nextLine();
        if (command.equals("q"))
          return;
        n = BattleField.nextStep();
        ConsoleView.view();
        if (n != 0)
          System.out.println("Победила команда " + n);
      }
    }
  }
}
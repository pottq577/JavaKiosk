package com.sparta.kiosk.app;

import java.util.List;
import java.util.Scanner;

public class Kiosk {

  List<MenuItem> menuItems;
  Scanner scanner = new Scanner(System.in);

  public void start() {
    while (true) {
      System.out.println("[ SHAKESHACK MENU ]");
      for (int i = 0; i < menuItems.size(); i++) {
        System.out.println(
            i + 1 + ". "
                + menuItems.get(i).menuName + " | "
                + "W " + menuItems.get(i).menuPrice
                + " | " + menuItems.get(i).menuDesc);
      }
      System.out.println("0. 종료\n");

      System.out.print("선택: ");
      int userMenuChoice = scanner.nextInt();

      if (userMenuChoice == 0) {
        System.out.println("\n프로그램을 종료합니다.");
        break;
      } else {
        System.out.println("선택한 메뉴: " +
            menuItems.get(userMenuChoice - 1).menuName + ", " +
            menuItems.get(userMenuChoice - 1).menuPrice + ", " +
            menuItems.get(userMenuChoice - 1).menuDesc + "\n");
      }
    }

  }
}

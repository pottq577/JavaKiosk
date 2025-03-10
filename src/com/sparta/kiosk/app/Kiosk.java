package com.sparta.kiosk.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk {

  Menu menu;
  List<Menu> menuList = new ArrayList<>();
  Scanner scanner = new Scanner(System.in);

  public Kiosk(Menu menu) {
    this.menu = menu;
  }

  public void start() {

    System.out.println("[ MAIN MENU ]");
    for (int i = 0; i < menu.getCategory().length; i++) {
      System.out.println(i + 1 + ". " + menu.getCategory(i));
    }

//    menu.printMenuItems();

//    while (true) {
//      System.out.println("[ SHAKESHACK MENU ]");
//      menu.printMenuItems();
//      System.out.println("0. 종료\n");
//
//      System.out.print("선택: ");
//      int userMenuChoice = scanner.nextInt();
//
//      if (userMenuChoice == 0) {
//        System.out.println("\n프로그램을 종료합니다.");
//        break;
//      } else {
////        System.out.println("선택한 메뉴: " +
////            menuItems.get(userMenuChoice - 1).menuName + ", " +
////            menuItems.get(userMenuChoice - 1).menuPrice + ", " +
////            menuItems.get(userMenuChoice - 1).menuDesc + "\n");
//      }
//    }

  }
}

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
//    카테고리 출력
    System.out.println("[ MAIN MENU ]");
    for (int i = 0; i < menu.getCategory().length; i++) {
      System.out.println(i + 1 + ". " + menu.getCategory(i));
    }
    System.out.println("0. 종료");
//    카테고리 선택
    System.out.print("\n선택: ");
    int userCategoryChoice = scanner.nextInt();

//    선택된 카테고리 메뉴 출력
    System.out.println();
    System.out.println("[ " + menu.getCategory(userCategoryChoice - 1) + " MENU ]");
    menu.printMenuItems();

//    메뉴 선택
    System.out.print("\n선택: ");
    int userMenuChoice = scanner.nextInt();
    System.out.println("선택한 메뉴: " +
        menu.getMenuItems().get(userMenuChoice - 1).menuName + ", " +
        menu.getMenuItems().get(userMenuChoice - 1).menuPrice + ", " +
        menu.getMenuItems().get(userMenuChoice - 1).menuDesc
    );

//    while (true) {
//      if (userCategoryChoice == 0) {
//        System.out.println("\n프로그램을 종료합니다.");
//        break;
//      } else {
//        System.out.println("선택한 메뉴: " +
//            menuItems.get(userMenuChoice - 1).menuName + ", " +
//            menuItems.get(userMenuChoice - 1).menuPrice + ", " +
//            menuItems.get(userMenuChoice - 1).menuDesc + "\n");
//      }
//    }

  }
}

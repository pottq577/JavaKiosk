package com.sparta.kiosk.app;

import java.util.Scanner;

public class Kiosk {

  private final Menu menu;

  public Kiosk(Menu menu) {
    this.menu = menu;
  }

  public void start() {
    Scanner scanner = new Scanner(System.in);
    while (true) {
//      카테고리 선택
      printCategory();
      int userCategoryChoice = scanner.nextInt();
      if (userCategoryChoice == 0) {
        System.out.println("\n프로그램을 종료합니다.");
        break;
      }

//      카테고리 내 메뉴 선택
      printMenu(userCategoryChoice);
      int userMenuChoice = scanner.nextInt();
      if (userMenuChoice == 0) {
        System.out.println("\n메인 메뉴로 돌아갑니다.");
        System.out.println();
        continue;
      }

//      선택한 메뉴 출력
      printUserMenu(userMenuChoice, menu.getCategory(userCategoryChoice - 1));
    }
    scanner.close();
  }

  private void printCategory() {
    System.out.println("[ MAIN MENU ]");
    for (int i = 0; i < menu.getCategory().length; i++) {
      System.out.println(i + 1 + ". " + menu.getCategory(i));
    }
    System.out.println("0. 종료");
    System.out.print("\n선택: ");
  }

  private void printMenu(int userCategoryChoice) {
    String selectedCategory = menu.getCategory(userCategoryChoice - 1);
    System.out.println("\n[ " + selectedCategory + " MENU ]");
    menu.printMenuItems(selectedCategory);
    System.out.println("0. 뒤로가기");
    System.out.print("\n선택: ");
  }

  private void printUserMenu(int userMenuChoice, String category) {
    MenuItem selectedMenu = menu.getMenuItems(category).get(userMenuChoice - 1);

    System.out.println("선택한 메뉴: " +
        selectedMenu.getMenuName() + " | " +
        "W " + selectedMenu.getMenuPrice() + " | " +
        selectedMenu.getMenuDesc() + "\n"
    );
  }
}

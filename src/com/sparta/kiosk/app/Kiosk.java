package com.sparta.kiosk.app;

import java.util.Scanner;

public class Kiosk {

//  속성
  private final Menu menu;

//  생성자
  public Kiosk(Menu menu) {
    this.menu = menu;
  }

//  기능
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

  // 카테고리를 출력하는 메소드
  private void printCategory() {
    System.out.println("[ MAIN MENU ]");
    for (int i = 0; i < menu.getCategory().length; i++) {
      System.out.println(i + 1 + ". " + menu.getCategory(i));
    }
    System.out.println("0. 종료");
    System.out.print("\n선택: ");
  }

  /**
   * 사용자가 선택한 카테고리의 메뉴를 출력하는 메소드
   * @param userCategoryChoice 사용자가 선택한 카테고리
   */
  private void printMenu(int userCategoryChoice) {
    String selectedCategory = menu.getCategory(userCategoryChoice - 1);
    System.out.println("\n[ " + selectedCategory + " MENU ]");
    menu.printMenuItems(selectedCategory);
    System.out.println("0. 뒤로가기");
    System.out.print("\n선택: ");
  }

  /**
   * 사용자가 선택한 메뉴를 출력하는 메소드
   * @param userMenuChoice 사용자가 선택한 메뉴
   * @param category 사용자가 선택한 카테고리
   */
  private void printUserMenu(int userMenuChoice, String category) {
    MenuItem selectedMenu = menu.getMenuItems(category).get(userMenuChoice - 1);

    System.out.println("선택한 메뉴: " +
        selectedMenu.getMenuName() + " | " +
        "W " + selectedMenu.getMenuPrice() + " | " +
        selectedMenu.getMenuDesc() + "\n"
    );
  }
}

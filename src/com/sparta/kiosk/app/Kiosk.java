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
      printUserMenu(userMenuChoice);
    }
  }

  public void printCategory(){
    System.out.println("[ MAIN MENU ]");
    for (int i = 0; i < menu.getCategory().length; i++) {
      System.out.println(i + 1 + ". " + menu.getCategory(i));
    }
    System.out.println("0. 종료");
    System.out.print("\n선택: ");
  }

  public void printMenu(int userCategoryChoice){
    System.out.println("\n[ " + menu.getCategory(userCategoryChoice - 1) + " MENU ]");
    menu.printMenuItems();
    System.out.println("0. 뒤로가기");

    System.out.print("\n선택: ");
  }

  public void printUserMenu(int userMenuChoice){
    System.out.println("선택한 메뉴: " +
        menu.getMenuItems().get(userMenuChoice - 1).menuName + " | " +
        "W " + menu.getMenuItems().get(userMenuChoice - 1).menuPrice + " | " +
        menu.getMenuItems().get(userMenuChoice - 1).menuDesc + "\n"
    );
  }
}

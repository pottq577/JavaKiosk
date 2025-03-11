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
      menu.printCategory();
      int userCategoryChoice = scanner.nextInt();
      if (userCategoryChoice == 0) {
        System.out.println("\n프로그램을 종료합니다.");
        break;
      }

//      카테고리 내 메뉴 선택
      menu.printMenu(userCategoryChoice);
      int userMenuChoice = scanner.nextInt();
      if (userMenuChoice == 0) {
        System.out.println("\n메인 메뉴로 돌아갑니다.");
        System.out.println();
        continue;
      }

//      선택한 메뉴 출력
      menu.printUserMenu(userMenuChoice);
    }
    scanner.close();
  }

}

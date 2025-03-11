package com.sparta.kiosk.app;

import java.util.Scanner;

public class Kiosk {
  private final static String EXIT_PROGRAM_MESSAGE = "\n프로그램을 종료합니다.";
  private final static String RETURN_TO_MAIN_MENU_MESSAGE = "\n메인 메뉴로 돌아갑니다.\n";

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
        System.out.println(EXIT_PROGRAM_MESSAGE);
        break;
      }

//      카테고리 내 메뉴 선택
      menu.printMenu(userCategoryChoice);
      int userMenuChoice = scanner.nextInt();
      if (userMenuChoice == 0) {
        System.out.println(RETURN_TO_MAIN_MENU_MESSAGE);
        continue;
      }

//      선택한 메뉴 출력
      menu.printUserMenu(userMenuChoice);
    }
    scanner.close();
  }

}

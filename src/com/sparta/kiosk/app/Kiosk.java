package com.sparta.kiosk.app;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Kiosk {

  private static final String EXIT_PROGRAM_MESSAGE = "\n프로그램을 종료합니다.";
  private static final String RETURN_TO_MAIN_MENU_MESSAGE = "\n메인 메뉴로 돌아갑니다.\n";

  private static final String INPUT_TYPE_ERROR = "\n입력 형식이 잘못되었습니다.\n숫자로 입력해주세요.\n";
  private static final String MENU_NUMBER_ERROR = "\n숫자를 잘못 입력하셨습니다.\n메뉴 번호를 확인해주세요.\n";


  //  속성
  private final Menu menu;
  private final Scanner scanner = new Scanner(System.in);
  private int userCategoryChoice;
  private int userMenuChoice;

  //  생성자
  public Kiosk(Menu menu) {
    this.menu = menu;
  }

  //  기능
  public void start() {
    while (true) {
      menu.printCategory();

      try {
        if (selectCategory()) {
          break;
        }
        if (selectMenu()) {
          continue;
        }
        menu.printUserMenu(userMenuChoice);

      } catch (InputMismatchException e) {
        System.out.println(INPUT_TYPE_ERROR);
        scanner.nextLine();
      } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println(MENU_NUMBER_ERROR);
        scanner.nextLine();
      }
    }
  }


  private boolean selectCategory() throws InputMismatchException {
    userCategoryChoice = scanner.nextInt();

    if (userCategoryChoice == 0) {
      System.out.println(EXIT_PROGRAM_MESSAGE);
      return true;
    }
    return false;
  }

  private boolean selectMenu() throws ArrayIndexOutOfBoundsException {
    menu.printMenu(userCategoryChoice);
    userMenuChoice = scanner.nextInt();

    if (userMenuChoice == 0) {
      System.out.println(RETURN_TO_MAIN_MENU_MESSAGE);
      return true;
    }
    return false;
  }

}

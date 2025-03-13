package com.sparta.kiosk.app;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Kiosk {

  private static final String EXIT_PROGRAM_MESSAGE = "\n프로그램을 종료합니다.";
  private static final String RETURN_TO_MAIN_MENU_MESSAGE = "\n메인 메뉴로 돌아갑니다.\n";

  private static final String INPUT_TYPE_ERROR = "\n입력 형식이 잘못되었습니다.\n숫자로 입력해주세요.\n";
  private static final String MENU_NUMBER_ERROR = "\n숫자를 잘못 입력하셨습니다.\n메뉴 번호를 확인해주세요.\n";

  private static final String CHOICE_PROMPT = "\n선택: ";

  //  속성
  private final Menu menu;
  private final Order order;
  private final Scanner scanner = new Scanner(System.in);
  private int userCategoryChoice;
  private int userMenuChoice;

  //  생성자
  public Kiosk(Menu menu) {
    this.menu = menu;
    this.order = new Order(menu);
  }

  //  기능
  public void start() {

    while (true) {
      boolean isCartNotEmpty = order.getAddedToCart();
      // 카테고리 출력
      menu.printCategory();

      if (isCartNotEmpty) {
        order.printOrderMenu();
      }

      try {
        // 카테고리 선택
        if (selectCategory()) {
          break;
        }
        // 카테고리의 메뉴 선택
        if (selectMenu()) {
          continue;
        }

        // 선택한 메뉴 출력
        menu.printUserMenu(userMenuChoice);

        // 장바구니에 넣을거임?
        order.askAddToCart(scanner, userCategoryChoice, userMenuChoice);

        if (order.getAddedToCart()) {
          order.printMenuAddedToCart();
        } else {
          System.out.println("ㄴㄴ 안삼");
        }

      } catch (InputMismatchException e) {
        System.out.println(INPUT_TYPE_ERROR);
        scanner.nextLine();
      } catch (IndexOutOfBoundsException e) {
        System.out.println(MENU_NUMBER_ERROR);
        scanner.nextLine();
      }
    }
  }

  private boolean selectCategory() throws InputMismatchException {
    System.out.print(CHOICE_PROMPT);
    userCategoryChoice = scanner.nextInt();

    if (userCategoryChoice == 0) {
      System.out.println(EXIT_PROGRAM_MESSAGE);
      return true;
    }
    return false;
  }

  private boolean selectMenu() throws IndexOutOfBoundsException {
    switch (userCategoryChoice) {
      case 1, 2, 3 -> menu.printMenu(userCategoryChoice);
      case 4, 5 -> System.out.println("주문 선택");
      default -> {
        System.out.println("잘못된 선택입니다.");
      }
    }
    System.out.print(CHOICE_PROMPT);
    userMenuChoice = scanner.nextInt();

    if (userMenuChoice == 0) {
      System.out.println(RETURN_TO_MAIN_MENU_MESSAGE);
      return true;
    }
    return false;
  }

}

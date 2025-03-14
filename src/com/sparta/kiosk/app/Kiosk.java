package com.sparta.kiosk.app;

import java.util.InputMismatchException;
import java.util.List;
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
  private String selectedCategory;
  private int userMenuChoice;
  private List<MenuItem> menuCategory;

  private boolean isAddToCart;

  //  생성자
  public Kiosk(Menu menu) {
    this.menu = menu;
    this.order = new Order(menu);
  }

  //  기능
  public void start() {

    while (true) {
      boolean isCartEmpty = order.getMenuCart().isEmpty();
      // 카테고리 출력
      System.out.println("[ MAIN MENU ]");
      for (int i = 0; i < menu.getCategory().length; i++) {
        System.out.println(i + 1 + ". " + menu.getCategory(i));
      }
      System.out.println("0. 종료");
      if (!isCartEmpty) {
        System.out.println("\n[ ORDER MENU ]");
        System.out.println("4. Orders");
        System.out.println("5. Cancel");
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
        System.out.println("\n🍽️ 선택한 메뉴");
        printForm(menuCategory.get(userMenuChoice - 1));

        // 장바구니에 넣을건지 확인
        isAddToCart = askAddToCart();

        if (isAddToCart) {
          order.addToCart(userCategoryChoice, userMenuChoice);
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
    this.userCategoryChoice = scanner.nextInt();

    if (userCategoryChoice == 0) {
      System.out.println(EXIT_PROGRAM_MESSAGE);
      return true;
    }

    if (userCategoryChoice >= 1 && userCategoryChoice <= 3) {
      selectedCategory = menu.getCategory(userCategoryChoice - 1);
    } else if (userCategoryChoice == 4) {
      if (isAddToCart) {
        askOrderConfirm();
      }
    } else if (userCategoryChoice == 5) {
      System.out.println("ㄴㄴ 고민좀 해봄");
    }

    return false;
  }

  private boolean selectMenu() throws IndexOutOfBoundsException {
    System.out.println("\n[ " + selectedCategory + " MENU ]");
    menuCategory = menu.getCategoryMenuItem(selectedCategory);
    printForm(menuCategory);

    System.out.print(CHOICE_PROMPT);
    this.userMenuChoice = scanner.nextInt();

    if (userMenuChoice == 0) {
      System.out.println(RETURN_TO_MAIN_MENU_MESSAGE);
      return true;
    }

    return false;
  }

  private boolean askAddToCart() throws IndexOutOfBoundsException {
    System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
    System.out.println("1. 확인       2. 취소");
    System.out.print(CHOICE_PROMPT);
    int addCheck = scanner.nextInt();

    switch (addCheck) {
      case 1 -> {
        System.out.println(menuCategory.get(userMenuChoice - 1).getMenuName()
            + " 이(가) 장바구니에 추가되었습니다.\n");
      }
      case 2 -> {
        System.out.println("장바구니에 메뉴를 담지 않았습니다. 메인 메뉴로 돌아갑니다.\n");
      }
    }

    return addCheck == 1;
  }

  private void askOrderConfirm() throws IndexOutOfBoundsException {
    double totalPrice = 0;
    List<MenuItem> menuCart = order.getMenuCart();

    System.out.println("아래와 같이 주문하시겠습니까?\n");
    System.out.println("[ Orders ]");
    for (MenuItem menuItem : menuCart) {
      printForm(menuItem);
      totalPrice += menuItem.getMenuPrice();
    }

    System.out.println("[ Total ]");
    System.out.println("총 금액: " + totalPrice + " W");

    System.out.println("\n1. 주문        2. 메뉴판");
    System.out.print(CHOICE_PROMPT);
    int orderCheck = scanner.nextInt();

    switch (orderCheck) {
      case 1 -> {
        System.out.println("주문이 완료되었습니다. 금액은 " + totalPrice + " W 입니다.\n");
        menuCart.clear();
      }
      case 2 -> {
        System.out.println("주문을 취소했습니다. 메뉴판으로 돌아갑니다.\n");
      }
      default -> System.out.println("잘못된 입력");
    }
  }

  private void printForm(List<MenuItem> menuCategory) {
    for (int i = 0; i < menuCategory.size(); i++) {
      System.out.printf("%d. %-13s | W %.1f | %s\n", i + 1,
          menuCategory.get(i).getMenuName(),
          menuCategory.get(i).getMenuPrice(),
          menuCategory.get(i).getMenuDesc());
    }
  }

  private void printForm(MenuItem selectedMenu) {
    System.out.printf("☞ %-14s | W %.1f | %s\n\n",
        selectedMenu.getMenuName(),
        selectedMenu.getMenuPrice(),
        selectedMenu.getMenuDesc());
  }
}

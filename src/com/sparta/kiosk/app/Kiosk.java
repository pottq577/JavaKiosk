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
      System.out.println("[ MAIN MENU ]");
      for (int i = 0; i < menu.getCategory().length; i++) {
        System.out.println(i + 1 + ". " + menu.getCategory(i));
      }
      System.out.println("0. 종료");
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
        System.out.println("\n🍽️ 선택한 메뉴");
        printForm(menuCategory.get(userMenuChoice - 1));

        // 장바구니에 넣을건지 확인
        System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
        System.out.println("1. 확인       2. 취소");
        order.askAddToCart(userCategoryChoice, userMenuChoice);
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
    selectedCategory = menu.getCategory(this.userCategoryChoice - 1);
    return false;
  }

  private boolean selectMenu() throws IndexOutOfBoundsException {
    switch (userCategoryChoice) {
      case 1, 2, 3 -> {
        System.out.println("\n[ " + selectedCategory + " MENU ]");
        menuCategory = menu.getCategoryMenuItem(selectedCategory);
        printForm(menuCategory);
      }
      case 4 -> {
        order.addToCart();
      }
      case 5 -> System.out.println("주문을 취소했습니다. 메인 메뉴로 돌아갑니다.\n");
      default -> {
        System.out.println("잘못된 선택입니다.");
      }
    }
    System.out.print(CHOICE_PROMPT);
    this.userMenuChoice = scanner.nextInt();

    if (userMenuChoice == 0) {
      System.out.println(RETURN_TO_MAIN_MENU_MESSAGE);
      return true;
    }
    return false;
  }

  private boolean askAddToCart(){
    System.out.println(CHOICE_PROMPT);
    int addCheck = scanner.nextInt();
    switch (addCheck){
      case 1 -> {

        return true;
      }
      case 2 -> {
        System.out.println("장바구니에 메뉴를 담지 않았습니다. 메인 메뉴로 돌아갑니다.\n");
        return false;
      }
      default -> System.out.println("잘못된 입력");
    }
    return false;
  }

  public void printForm(List<MenuItem> menuCategory){
    for (int i = 0; i < menuCategory.size(); i++) {
      System.out.printf("%d. %-13s | W %.1f | %s\n", i + 1,
          menuCategory.get(i).getMenuName(),
          menuCategory.get(i).getMenuPrice(),
          menuCategory.get(i).getMenuDesc());
    }
  }

  public void printForm(MenuItem selectedMenu){
    System.out.printf("☞ %-14s | W %.1f | %s\n\n",
        selectedMenu.getMenuName(),
        selectedMenu.getMenuPrice(),
        selectedMenu.getMenuDesc());
  }
}

package com.sparta.kiosk.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Order {

  private static final String CHOICE_PROMPT = "\n선택: ";

  //  속성
  private final Menu menu;
  private int userCategoryChoice;
  private int userMenuChoice;
  private boolean isAddedToCart;
  private String selectedCategory;
  private List<MenuItem> menuCategory;
  private List<MenuItem> menuCart = new ArrayList<>();
  private Scanner scanner = new Scanner(System.in);

  //  생성자
  public Order(Menu menu) {
    this.menu = menu;
  }

  //  기능
  public void askAddToCart(int userCategoryChoice, int userMenuChoice) {
    int addCheck = scanner.nextInt();
    this.selectedCategory = menu.getCategory(userCategoryChoice - 1);

    switch (addCheck) {
      case 1 -> {
        menuCategory = menu.getCategoryMenuItem(selectedCategory);
        menuCart.add(menuCategory.get(userMenuChoice - 1));

        setAddedToCart(true);
        System.out.println(menuCategory.get(userMenuChoice - 1).getMenuName() + " 이(가) 장바구니에 추가되었습니다.\n");
      }
      case 2 -> {
        System.out.println("장바구니에 메뉴를 담지 않았습니다. 메인 메뉴로 돌아갑니다.\n");
        setAddedToCart(false);
      }
      default -> System.out.println("잘못된 입력");
    }
  }

  public void addToCart() {
    if (menuCart.isEmpty()) {
      System.out.println("장바구니가 비어있습니다.\n");
      return;
    }

    double totalPrice = 0;
    System.out.println("아래와 같이 주문하시겠습니까?\n");
    System.out.println("[ Orders ]");
    for (int i = 0; i < menuCart.size(); i++) {
      MenuItem menuItem = menuCart.get(i);
      System.out.printf("%d. %-13s | W %.1f | %s\n", i + 1,
          menuItem.getMenuName(),
          menuItem.getMenuPrice(),
          menuItem.getMenuDesc());
      totalPrice += menuItem.getMenuPrice();
    }

    System.out.println("\n[ Total ]");
    System.out.println("총 금액: " + totalPrice);

    System.out.println("\n1. 주문        2. 메뉴판");
    System.out.print(CHOICE_PROMPT);
    int orderCheck = scanner.nextInt();

    switch (orderCheck) {
      case 1 -> {
        System.out.println("주문이 완료되었습니다. 금액은 " + totalPrice + " W 입니다.");
        menuCart.clear();
      }
      case 2 -> {
        System.out.println("주문을 취소했습니다. 메뉴판으로 돌아갑니다.");
      }
      default -> System.out.println("잘못된 입력");
    }
  }

  public void printOrderMenu() {
    System.out.println("\n[ ORDER MENU ]");
    System.out.println("4. Orders");
    System.out.println("5. Cancel");
  }

  public void setUserCategoryChoice(int userCategoryChoice) {
    this.userCategoryChoice = userCategoryChoice - 1;
  }

  public void setUserMenuChoice(int userMenuChoice) {
    this.userMenuChoice = userMenuChoice - 1;
  }

  public boolean getAddedToCart() {
    return isAddedToCart;
  }

  public void setAddedToCart(boolean isAddedToCart) {
    this.isAddedToCart = isAddedToCart;
  }
}

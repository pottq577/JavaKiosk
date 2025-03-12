package com.sparta.kiosk.app;

import java.util.Scanner;

public class Order {

  private static final String CHOICE_PROMPT = "\n선택: ";

//  속성
  private Menu menu;
  private int userCategoryChoice;
  private int userMenuChoice;
  private boolean isAddedToCart;

//  생성자
  public Order(Menu menu){
    this.menu = menu;
  }

//  기능
  public void printOrderMenu(){
    System.out.println("[ ORDER MENU ]");
    System.out.println("4. Orders");
    System.out.println("5. Cancel");
  }

  public boolean askAddToCart(Scanner scanner) {
    System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
    System.out.println("1. 확인       2. 취소");
    System.out.print(CHOICE_PROMPT);

    int addcart = scanner.nextInt();

    if (addcart == 1) {
      return true;
    } else if (addcart == 2) {
      return false;
    }

    return false;
  }

  public void setUserCategoryChoice(int userCategoryChoice) {
    this.userCategoryChoice = userCategoryChoice;
  }

  public void setUserMenuChoice(int userMenuChoice) {
    this.userMenuChoice = userMenuChoice;
  }
}

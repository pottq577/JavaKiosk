package com.sparta.kiosk.app;

import java.util.List;
import java.util.Scanner;

public class Order {

  private static final String CHOICE_PROMPT = "\n선택: ";

//  속성
  private Menu menu;
  private int userCategoryChoice;
  private int userMenuChoice;
  private boolean isAddedToCart;
  private List<MenuItem> menuInCart;

//  생성자
  public Order(Menu menu){
    this.menu = menu;
  }

//  기능

  public void askAddToCart(Scanner scanner, int userCategoryChoice, int userMenuChoice) {
    System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
    System.out.println("1. 확인       2. 취소");
    System.out.print(CHOICE_PROMPT);

    int addcart = scanner.nextInt();
    scanner.nextLine();

    if (addcart == 1) {
      setAddedToCart(true);

      setUserCategoryChoice(userCategoryChoice);
      setUserMenuChoice(userMenuChoice);

      String category = menu.getCategory(this.userCategoryChoice);
      MenuItem menuName = menu.getMenuItems(category).get(this.userMenuChoice);

      // TODO
      // 사용자가 선택한 메뉴를 장바구니 리스트에 추가
    } else if (addcart == 2) {
      setAddedToCart(false);
    } else {
      System.out.println("잘못된 입력");
      scanner.nextLine();
    }
  }

  public void printMenuAddedToCart(){
    String category = menu.getCategory(userCategoryChoice);
    String menuName = menu.getMenuItems(category).get(userMenuChoice).getMenuName();
    System.out.println(menuName + " 이(가) 장바구니에 추가되었습니다.\n");
  }

  public void printOrderMenu(){
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

  public boolean getAddedToCart(){
    return isAddedToCart;
  }

  public void setAddedToCart(boolean isAddedToCart){
    this.isAddedToCart = isAddedToCart;
  }
}

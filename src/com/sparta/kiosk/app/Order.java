package com.sparta.kiosk.app;

import java.util.ArrayList;
import java.util.List;

public class Order {

  //  속성
  private final Menu menu;
  private boolean isAddedToCart;
  private final List<MenuItem> menuCart = new ArrayList<>();

  //  생성자
  public Order(Menu menu) {
    this.menu = menu;
  }

  //  기능
  public void addToCart(int userCategoryChoice, int userMenuChoice) {
    String category = menu.getCategory(userCategoryChoice - 1);
    MenuItem menuItem = menu.getCategoryMenuItem(category).get(userMenuChoice - 1);

    menuCart.add(menuItem);

    setAddedToCart(true);
    System.out.println("메뉴 추가 완료");
    for (MenuItem mi : menuCart) {
      System.out.println(mi.getMenuName());
      System.out.println(mi.getMenuPrice());
      System.out.println(mi.getMenuDesc());
    }
  }

  public List<MenuItem> getMenuCart() {
    return menuCart;
  }

  public boolean getAddedToCart() {
    return isAddedToCart;
  }

  public void setAddedToCart(boolean isAddedToCart) {
    this.isAddedToCart = isAddedToCart;
  }
}

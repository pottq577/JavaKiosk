package com.sparta.kiosk.app;

import java.util.ArrayList;
import java.util.List;

public class Order {

  //  속성
  private final Menu menu;
  private final List<MenuItem> menuCart = new ArrayList<>();
  private boolean isAddedToCart;

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

package com.sparta.kiosk.app;

public class MenuItem {
  private final String menuName;
  private final Double menuPrice;
  private final String menuDesc;

  public MenuItem(String menuName, Double menuPrice, String menuDesc){
    this.menuName = menuName;
    this.menuPrice = menuPrice;
    this.menuDesc = menuDesc;
  }

  public String getMenuName() {
    return menuName;
  }

  public Double getMenuPrice() {
    return menuPrice;
  }

  public String getMenuDesc() {
    return menuDesc;
  }
}
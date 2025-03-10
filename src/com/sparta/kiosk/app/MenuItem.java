package com.sparta.kiosk.app;

public class MenuItem {
  public String menuName;
  public Double menuPrice;
  public String menuDesc;

  public MenuItem(String menuName, Double menuPrice, String menuDesc){
    this.menuName = menuName;
    this.menuPrice = menuPrice;
    this.menuDesc = menuDesc;
  }
}
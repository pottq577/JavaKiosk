package com.sparta.kiosk.app;

import java.util.List;

public class Menu {

  public String category;
  public List<MenuItem> menuItems;

  public Menu(List<MenuItem> menuItems) {
    this.menuItems = menuItems;
  }
}

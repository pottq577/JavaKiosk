package com.sparta.kiosk.app;

import java.util.ArrayList;
import java.util.List;

public class Menu {

  public String[] category = new String[3];
  public List<MenuItem> menuItems = new ArrayList<>();

  public Menu(String[] category) {
    this.category[0] = category[0];
    this.category[1] = category[1];
    this.category[2] = category[2];
    addMenu();
  }

  public void addMenu(){
    menuItems.add(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
    menuItems.add(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
    menuItems.add(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
    menuItems.add(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));

  }

  public void printMenuItems(){
    for (int i = 0; i < menuItems.size(); i++) {
      System.out.println(
          i + 1 + ". "
              + menuItems.get(i).menuName + " | "
              + "W " + menuItems.get(i).menuPrice
              + " | " + menuItems.get(i).menuDesc);
    }
  }

  public List<MenuItem> getMenuItems() {
    return menuItems;
  }

  public String getCategory(int index) {
    return category[index];
  }

  public String[] getCategory() {
    return category;
  }
}

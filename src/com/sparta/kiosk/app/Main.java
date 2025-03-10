package com.sparta.kiosk.app;

public class Main {

  public static void main(String[] args) {
    Menu menu = new Menu(new String[]{"Burger", "Beverage", "Dessert"});
    Kiosk kiosk = new Kiosk(menu);

    kiosk.start();
  }
}
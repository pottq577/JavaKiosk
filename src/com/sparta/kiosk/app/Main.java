package com.sparta.kiosk.app;

public class Main {

  public static void main(String[] args) {
    Menu menu = new Menu(new String[]{"Burger", "Beverage", "Desserts"});
    Kiosk kiosk = new Kiosk(menu);


    kiosk.start();
  }
}
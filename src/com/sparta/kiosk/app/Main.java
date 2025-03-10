package com.sparta.kiosk.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    List<MenuItem> menuItems = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    menuItems.add(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
    menuItems.add(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
    menuItems.add(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
    menuItems.add(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));

    while (true) {
      System.out.println("[ SHAKESHACK MENU ]");
      for (int i = 0; i < menuItems.size(); i++) {
        System.out.println(
            i + 1 + ". "
                + menuItems.get(i).menuName + " | "
                + "W " + menuItems.get(i).menuPrice
                + " | " + menuItems.get(i).menuDesc);
      }
      System.out.println("0. 종료\n");

      System.out.print("선택: ");
      int userMenuChoice = scanner.nextInt();

      if (userMenuChoice == 0) {
        System.out.println("\n프로그램을 종료합니다.");
        break;
      } else {
        System.out.println("선택한 메뉴: " +
            menuItems.get(userMenuChoice - 1).menuName + ", " +
            menuItems.get(userMenuChoice - 1).menuPrice + ", " +
            menuItems.get(userMenuChoice - 1).menuDesc + "\n");
      }
    }


  }
}
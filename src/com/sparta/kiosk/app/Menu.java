package com.sparta.kiosk.app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Menu {

  //  속성
  private final Map<String, List<MenuItem>> categoryMenuMap = new HashMap<>();
  private final String[] category;
  private int userCategoryChoiceIndex;
  private String selectedCategory;
  private int userMenuChoiceIndex;

  //  생성자
  public Menu(String[] category) {
    this.category = category;
    addMenuItem();
  }

  //  기능
  // 카테고리별로 메뉴를 등록하는 메소드
  public void addMenuItem() {
    List<MenuItem> burgers = new ArrayList<>();
    burgers.add(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
    burgers.add(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
    burgers.add(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
    burgers.add(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));
    categoryMenuMap.put("Burger", burgers);

    List<MenuItem> beverages = new ArrayList<>();
    beverages.add(new MenuItem("Coke", 2.0, "캔 콜라 355ml"));
    beverages.add(new MenuItem("Soda", 2.0, "캔 사이다 355ml"));
    beverages.add(new MenuItem("Plain Water", 1.0, "생수 500ml"));
    categoryMenuMap.put("Beverage", beverages);

    List<MenuItem> desserts = new ArrayList<>();
    desserts.add(new MenuItem("French Fries", 2.5, "감자의 바삭함이 일품인 감자튀김"));
    desserts.add(new MenuItem("Corn Salad", 2.5, "달콤하고 고소한 맛의 콘 샐러드"));
    desserts.add(new MenuItem("Chicken Salad", 3.5, "담백한 닭가슴살과 함께 즐기는 샐러드"));
    desserts.add(new MenuItem("Green Salad", 2.5, "가볍게 즐길 수 있는 채소 샐러드"));
    categoryMenuMap.put("Dessert", desserts);
  }

  // 카테고리를 출력하는 메소드
  public void printCategory() {
    System.out.println("[ MAIN MENU ]");
    for (int i = 0; i < getCategory().length; i++) {
      System.out.println(i + 1 + ". " + getCategory(i));
    }
    System.out.println("0. 종료");
  }

  /**
   * 사용자가 선택한 카테고리의 메뉴를 출력하는 메소드
   *
   * @param userCategoryChoice 사용자가 선택한 카테고리 index
   */
  public void printMenu(int userCategoryChoice) {
    setUserCategoryChoiceIndex(userCategoryChoice);

    System.out.println("\n[ " + selectedCategory + " MENU ]");

    List<MenuItem> menus = categoryMenuMap.get(selectedCategory);
    for (int i = 0; i < menus.size(); i++) {
      MenuItem menu = menus.get(i);
      System.out.printf("%d. %-13s | W %.1f | %s\n", i + 1, menu.getMenuName(), menu.getMenuPrice(),
          menu.getMenuDesc());
    }

    System.out.println("0. 뒤로가기");
  }

  /**
   * 사용자가 선택한 메뉴를 출력하는 메소드
   *
   * @param userMenuChoice 사용자가 선택한 메뉴
   */
  public void printUserMenu(int userMenuChoice) throws IndexOutOfBoundsException {
    setUserMenuChoiceIndex(userMenuChoice);

    MenuItem selectedMenu = getMenuItems(selectedCategory).get(this.userMenuChoiceIndex);

    System.out.println("\n🍽️ 선택한 메뉴");
    System.out.printf("☞ %-14s | W %.1f | %s\n\n", selectedMenu.getMenuName(),
        selectedMenu.getMenuPrice(), selectedMenu.getMenuDesc());
  }

  /**
   * 사용자가 선택한 카테고리의 메뉴 아이템을 가져오는 Getter
   *
   * @param category 사용자가 선택한 카테고리
   * @return 새로운 카테고리의 메뉴 리스트
   */
  public List<MenuItem> getMenuItems(String category) {
    return new ArrayList<>(categoryMenuMap.get(category));
  }

  /**
   * 카테고리 배열을 가져오는 Getter
   *
   * @param index 배열의 index
   * @return index번째 카테고리 문자열
   */
  public String getCategory(int index) {
    return category[index];
  }

  /**
   * 카테고리 배열을 가져오는 Getter
   *
   * @return 카테고리 배열의 clone
   */
  public String[] getCategory() {
    return category.clone();
  }

  /**
   * 사용자가 선택한 카테고리 배열의 index를 설정하는 Setter selectedCategory도 동시에 초기화 진행
   *
   * @param userCategoryChoice 사용자가 선택한 배열의 index
   */
  private void setUserCategoryChoiceIndex(int userCategoryChoice) {
    this.userCategoryChoiceIndex = userCategoryChoice - 1;
    this.selectedCategory = getCategory(this.userCategoryChoiceIndex);
  }

  /**
   * 사용자가 선택한 메뉴 배열의 index를 설정하는 Setter
   *
   * @param userMenuChoice 사용자가 선택한 메뉴의 index
   */
  private void setUserMenuChoiceIndex(int userMenuChoice) {
    this.userMenuChoiceIndex = userMenuChoice - 1;
  }
}

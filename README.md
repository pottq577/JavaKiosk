![header](https://capsule-render.vercel.app/api?type=Waving&color=auto&height=300&section=header&text=JavaCalculator&fontSize=90&fontAlignY=35&desc=자바의%20객체지향적%20설계를%20중심으로%20점진적으로%20발전하는%20키오스크%20프로젝트입니다.&descAlignY=60&theme=gruvbox_light)

<br/>

## 🔗 목차
1. [🍔 프로젝트 소개](#-프로젝트-소개)
2. [🕰️ 개발 기간](#%EF%B8%8F-개발-기간)
3. [📚 개발 환경](#-개발-환경)
4. [🌳 디렉토리 구조](#-디렉토리-구조)
5. [👨🏻‍💻 개발 과정](#-개발-과정)
6. [🛠️ 주요 기능](#%EF%B8%8F-주요-기능)

   6-1. [프로그램 초기 화면](#-프로그램-초기-화면-)

   6-2. [도움말 출력](#-도움말-출력-)

   6-3. [계산 기능](#-계산-기능-)

   6-4. [명령어](#-명령어-)
7. [💭 마무리](#-마무리)

<br/>

## 🧮 프로젝트 소개


간단한 주문을 처리할 수 있는 키오스크 프로그램입니다.

이 프로그램은 다음과 같은 [개발 과정](#-개발-과정)을 거쳐 완성되었습니다.

1️⃣ 기본적인 키오스크를 프로그래밍해보자
<br/>
2️⃣ 메뉴를 클래스로 관리하기
<br/>
3️⃣ 순서 제어를 클래스로 관리하기
<br/>
4️⃣ 음식 메뉴와 주문 내역을 클래스로 관리하기
<br/>
5️⃣ 캡슐화 적용하기
<br/>
🆙 장바구니 및 구매하기 기능 추가하기
<br/>
~~🆙 Enum, 람다 & 스트림을 활용한 주문 및 장바구니 관리~~


위 단계에 걸쳐서 계산기 프로젝트를 발전시켜 나갑니다.

각 단계는 `develop` 브랜치에서 확인할 수 있습니다.

<br/>

## 🕰️ 개발 기간
- 2025.03.07 ~ 2025.03.14 (총 6일)

<br/>

## 📚 개발 환경

### Environment
[![My Skills](https://skillicons.dev/icons?i=idea)](https://skillicons.dev)
### Develop
[![My Skills](https://skillicons.dev/icons?i=java)](https://skillicons.dev)

![Static Badge](https://img.shields.io/badge/JDK-18.0.1-blue?logo=openjdk)

### SCM
[![My Skills](https://skillicons.dev/icons?i=git,github)](https://skillicons.dev)

<br/>

## 🌳 디렉토리 구조
```java
JavaKiosk/
├── src/
│   ├── main/com/Sparta/Calculator/
│   │   ├── App/
│   │   │   ├── Kiosk.java
│   │   │   ├── Main.java
│   │   │   ├── Menu.java
│   │   │   ├── MenuItem.java
│   │   │   └── Order.java
└── README.md
```

<br/>

## 👨🏻‍💻 개발 과정

### 1️⃣ 기본적인 키오스크를 프로그래밍해보자
- 사용자는 `CLI` 를 이용하여 메뉴를 볼 수 있습니다.
- 사용자가 특정 메뉴를 선택하면 프로그램이 종료됩니다.

### 2️⃣ 메뉴를 클래스로 관리하기
- 1️⃣ 에서 관리하던 메뉴를 `MenuItem` 클래스로 관리합니다.

### 3️⃣ 순서 제어를 클래스로 관리하기
- 프로그램의 전체 흐름을 `Kiosk` 클래스에서 관리합니다.

### 4️⃣ 음식 메뉴와 주문 내역을 클래스로 관리하기
- `MenuItem` 클래스를 `Menu` 클래스로 관리합니다.
- 메뉴의 상위 개념인 `카테고리 이름` 을 추가로 관리합니다.

### 5️⃣ 캡슐화 적용하기
- 1️⃣ ~ 4️⃣ 단계의 코드를 캡슐화합니다.

### 🆙 장바구니 및 구매하기 기능 추가하기
- `Order` 클래스를 생성해 장바구니와 주문을 관리합니다.
- `장바구니 담기`, `장바구니 출력과 금액 계산` , `주문` 기능을 제공합니다.

### ~~🆙 Enum, 람다 & 스트림을 활용한 주문 및 장바구니 관리~~
- 개발 중입니다.

### 자세한 개발 과정은 아래 블로그를 참조해주세요.

<a href="https://velog.io/@pottq577/TIL-29%EC%9D%BC%EC%B0%A8-%ED%82%A4%EC%98%A4%EC%8A%A4%ED%81%AC-%EA%B3%BC%EC%A0%9C-day-1"><img src="https://img.shields.io/badge/키오스크 과제 day1-20C997?style=for-the-badge&logo=Velog&logoColor=white"/></a>

<a href="https://velog.io/@pottq577/TIL-30%EC%9D%BC%EC%B0%A8-%ED%82%A4%EC%98%A4%EC%8A%A4%ED%81%AC-%EA%B3%BC%EC%A0%9C-day-2"><img src="https://img.shields.io/badge/키오스크 과제 day2-20C997?style=for-the-badge&logo=Velog&logoColor=white"/></a>

<a href="https://velog.io/@pottq577/TIL-32%EC%9D%BC%EC%B0%A8-%ED%82%A4%EC%98%A4%EC%8A%A4%ED%81%AC-%EA%B3%BC%EC%A0%9C-day-3"><img src="https://img.shields.io/badge/키오스크 과제 day3-20C997?style=for-the-badge&logo=Velog&logoColor=white"/></a>

<a href="https://velog.io/@pottq577/TIL-33%EC%9D%BC%EC%B0%A8-%ED%82%A4%EC%98%A4%EC%8A%A4%ED%81%AC-%EA%B3%BC%EC%A0%9C-day-4"><img src="https://img.shields.io/badge/키오스크 과제 day4-20C997?style=for-the-badge&logo=Velog&logoColor=white"/></a>

<a href="https://velog.io/@pottq577/TIL-34%EC%9D%BC%EC%B0%A8-%ED%82%A4%EC%98%A4%EC%8A%A4%ED%81%AC-%EA%B3%BC%EC%A0%9C-day-5"><img src="https://img.shields.io/badge/키오스크 과제 day5-20C997?style=for-the-badge&logo=Velog&logoColor=white"/></a>


<br/>

## 🛠️ 주요 기능

### [ 메인 메뉴 ]
```java
[ MAIN MENU ]
1. Burger
2. Beverage
3. Dessert
0. 종료

선택: 
```
프로그램을 처음 실행하면 출력되는 화면입니다.

### [ 메뉴 선택 ]
```java
[ MAIN MENU ]
1. Burger
2. Beverage
3. Dessert
0. 종료

선택: 1

[ Burger MENU ]
1. ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거
2. SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거
3. Cheeseburger  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거
4. Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거
0. 뒤로가기

선택: 1

🍽️ 선택한 메뉴
☞ ShackBurger    | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거
```
카테고리의 메뉴를 선택하면 사용자가 선택한 메뉴를 출력합니다.

### [ 장바구니 추가 ]
```java

🍽️ 선택한 메뉴
☞ ShackBurger    | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거

위 메뉴를 장바구니에 추가하시겠습니까?
1. 확인       2. 취소

선택: 1
ShackBurger 이(가) 장바구니에 추가되었습니다.
```

사용자가 메뉴를 선택하면 장바구니에 담을지 선택합니다.
```java
[ MAIN MENU ]
1. Burger
2. Beverage
3. Dessert
0. 종료

[ ORDER MENU ]
4. Orders  |  장바구니 목록을 조회합니다.
5. Cancel  |  장바구니를 비웁니다.
```

만약 장바구니에 담았다면, 주문에 관련된 메뉴가 추가로 출력됩니다.

### [ 주문 기능 ]
```java
[ MAIN MENU ]
1. Burger
2. Beverage
3. Dessert
0. 종료

[ ORDER MENU ]
4. Orders  |  장바구니 목록을 조회합니다.
5. Cancel  |  장바구니를 비웁니다.

선택: 4
아래와 같이 주문하시겠습니까?

[ Orders ]
☞ ShackBurger    | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거

[ Total ]
총 금액: 6.9 W

1. 주문하기        2. 메뉴판

선택: 1
주문이 완료되었습니다. 금액은 6.9 W 입니다.

[ Burger MENU ]
1. ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거
2. SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거
3. Cheeseburger  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거
4. Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거
0. 뒤로가기

선택: 
```

여러 메뉴를 장바구니에 담고, 주문하기를 선택하면 주문이 완료됩니다.

이후 메인 메뉴로 돌아가고, 처음부터 다시 반복합니다.

<br/>

## 💭 마무리

### 느낀 점
- 설계에 대해서 다시 한 번 고민해봐야겠다.
- 불필요하게 어렵고 복잡하게 코드를 작성하는 경향이 있다.
  - 설계를 잘못한 것이 영향을 미친 것 같다.
  - 전체적인 프로세스를 잡고 개발을 진행해야겠다.

### 아쉬운 점
- 로직 관리의 실패로 흐름 제어가 원활하게 이루어지지 않았다.
- ENUM, 람다, 스트림을 활용하기 좋은 프로젝트였는데, 시간이 부족해 완성하지 못해서 아쉬웠다.

<br/>

## 🙋🏻‍♂️ 정보

[![Velog's GitHub stats](https://velog-readme-stats.vercel.app/api/badge?name=pottq577)](https://velog.io/@pottq577)

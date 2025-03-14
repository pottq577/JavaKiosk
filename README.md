![header](https://capsule-render.vercel.app/api?type=Waving&color=auto&height=300&section=header&text=JavaKiosk&fontSize=90&fontAlignY=35&desc=자바의%20객체지향적%20설계를%20중심으로%20점진적으로%20발전하는%20키오스크%20프로젝트입니다.&descAlignY=60&theme=gruvbox_light)

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

<br/>

## 💭 마무리

### 느낀 점


### 아쉬운 점

<br/>

## 🙋🏻‍♂️ 정보

[![Velog's GitHub stats](https://velog-readme-stats.vercel.app/api/badge?name=pottq577)](https://velog.io/@pottq577)

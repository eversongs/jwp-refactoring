# 키친포스

## 요구 사항
### 상품
1. 상품을 등록한다.
    * 상품은 다음과 같은 속성을 가진다
        * 이름
        * 가격
    * 상품의 가격이 올바르지 않으면 등록할 수 없다.
        * 상품의 가격은 0 원 이상이어야 한다.
2. 등록된 전체 상품을 조회한다.

### 메뉴 그룹
1. 메뉴 그룹을 등록한다.
2. 등록된 전체 메뉴 그룹을 조회한다.

### 메뉴
1. 메뉴를 등록한다.
    * 메뉴는 다음과 같은 속성을 가진다
        * 이름
        * 금액
        * 메뉴 그룹 ID
        * 메뉴 상품(들)
            * 메뉴 상품들은 다음과 같은 속성을 지닌다
                * 상품 ID
                * 수량
    * 메뉴는 다음과 같은 경우에 등록 불가능 하다.
        * 금액이 0보다 작거나 올바르지 않은 경우
        * 메뉴 그룹 ID가 올바르지 않은 경우
        * 상품의 ID가 올바르지 않은 경우
        * 메뉴의 가격이 상품의 가격의 합보다 큰 경우
2. 등록된 전체 메뉴를 조회한다.

### 테이블
1. 테이블을 추가한다.
    * 테이블을 다음과 같은 속성을 가진다
        * 방문한 손님 수
        * 비어있는지 여부
2. 등록된 전체 테이블을 조회한다.
3. 테이블의 방문한 손님 수를 변경한다.
    * 테이블의 손님 수를 변경할 수 없는 경우
        * 손님 수가 유효하지 않은 경우
        * 테이블이 비어있는 상태인 경우
        * 테이블의 ID가 잘못된 경우
4. 테이블의 비어있는지 여부를 변경한다
    * 테이블의 비어있는지 여부를 변경할 수 없는 경우
        * 테이블의 ID가 잘못된 경우
        * 테이블이 테이블 그룹에 속해있는 경우
        * 테이블이 다음과 같은 상태인 경우 상태 변경이 불가능 하다
            * 요리중
            * 식사중

### 주문
1. 주문을 등록한다.
    * 주문은 다음과 같은 속성을 가진다.
        * 주문 테이블 ID 
        * 주문 항목(들)
            * 주문 항목은 다음과 같은 속성을 가진다.
                * 메뉴 ID
                * 수량
    * 주문 등록 불가능한 케이스
        * 주문내역이 없는 경우
        * 중복된 메뉴의 주문이 있는 경우
        * 주문 테이블이 유효하지 않은 경우
        * 비어있는 테이블에 대한 주문인 경우
2. 전체 주문 내역을 조회한다.
3. 주문의 상태를 변경한다.
    * 주문의 상태는 다음과 같다.
        * 조리
        * 식사
        * 계산 완료
    * 주문의 상태 변경이 불가능 한 경우
        * 주문이 유효하지 않은 경우
        * 이미 계산 완료된 주문인 경우

### 단체 지정
1. 계산을 위해 테이블들을 그룹화 한다.
2. 그룹화된 테이블을 해제 한다.


## 용어 사전

| 한글명 | 영문명 | 설명 |
| --- | --- | --- |
| 상품 | product | 메뉴를 관리하는 기준이 되는 데이터 |
| 메뉴 그룹 | menu group | 메뉴 묶음, 분류 |
| 메뉴 | menu | 메뉴 그룹에 속하는 실제 주문 가능 단위 |
| 메뉴 상품 | menu product | 메뉴에 속하는 수량이 있는 상품 |
| 금액 | amount | 가격 * 수량 |
| 주문 테이블 | order table | 매장에서 주문이 발생하는 영역 |
| 빈 테이블 | empty table | 주문을 등록할 수 없는 주문 테이블 |
| 주문 | order | 매장에서 발생하는 주문 |
| 주문 상태 | order status | 주문은 조리 ➜ 식사 ➜ 계산 완료 순서로 진행된다. |
| 방문한 손님 수 | number of guests | 필수 사항은 아니며 주문은 0명으로 등록할 수 있다. |
| 단체 지정 | table group | 통합 계산을 위해 개별 주문 테이블을 그룹화하는 기능 |
| 주문 항목 | order line item | 주문에 속하는 수량이 있는 메뉴 |
| 매장 식사 | eat in | 포장하지 않고 매장에서 식사하는 것 |

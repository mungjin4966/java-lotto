### 우아한 테크코스 3주차 lotto

----

1. 로또 구입 금액을 입력 받는다.
    - 입력 받은 로또 금액 만큼 로또를 발행한다.
    - 로또 한장의 가격은 1000원이다
    - 1,000원 단위로 입력 받으며 1,000원으로 나누어 지지 않으면 예외 처리
    - EX) 8000 = 로또 8장


2. 로또 구매시 로또 번호를 발행한다.
   - 로또를 발행시 중복되지 않는 6개 숫자를 뽑는다.
   - 로또 번호는 오름차 순으로 정렬해서 보여
   
3. 당첨 번호와 보너스 번호를 입력 받는다.
    - 당첨 번호를 입력받고 쉼표로 구분을 한다.
      - 1,2,3,4,5,6
    - 보너스 번호를 입력 받는다.
    - 당첨 번호는 1 ~ 45 까지의 수이다.
      - 사용자가 잘못된 값을 입력할 경우 IllegalArgumentException를 발생시키고, [ERROR]로 시작하는 에러 메세지를 출력 후 종료한다.
   
4. 사용자가 구매한 로또 번호와 담청 번호를 비교하여 담청 내역 및 수익률을 출력하고 로또 게임을 종료한다.
   - 3개 일치 (5,000원) - 1개
   - 4개 일치 (50,000원) - 0개
   - 5개 일치 (1,500,000원) - 0개q
   - 5개 일치, 보너스 볼 일치 (30,000,000원) - 0개
   - 6개 일치 (2,000,000,000원) - 0개

5. 금액 대비 수익률을 보여준다.
   - 수익률은 소수점 둘째 자리에서 반올림한다.
package lotto;

import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Application {
    public static void main(String[] args) {
        int lottoCount = lottoPurchase();
        List<Lotto> lotto = new ArrayList<Lotto>();

        for (int i = 0; i < lottoCount; i++) {
            lotto.add(new Lotto(issueLottoNumber()));
            System.out.println(lotto.get(i).getNumbers());
        }

        System.out.println(enterScore());

    }

    public static int lottoPurchase(){
        System.out.println("구입금액을 입력해주세요.");
        int money = Integer.parseInt(Console.readLine());

        if(money%1000 != 0){
            throw new IllegalArgumentException("[ERROR] 금액은 1,000원 단위로 입력해야 합니다.");
        }

        int value = money/1000;
        System.out.println();
        System.out.println(value+ "개를 구매했습니다.");

        return value;
    }

    public static List<Integer> issueLottoNumber(){
        List<Integer> issueLottoList = Randoms.pickUniqueNumbersInRange(1,45,6);


        if(issueLottoList.size() != issueLottoList.stream().distinct().count()){
           throw new IllegalArgumentException("[ERROR] 로또 값이 중복되어 프로그램을 종료합니다.");
        }

        Collections.sort(issueLottoList);

        return issueLottoList;
    }


    public static List<Integer> enterScore(){
        System.out.println("당첨 번호를 입력해 주세요.");

        String readNumber = Console.readLine();
        String[] valueNumber = readNumber.split(",");

        int[] intArray = Arrays.stream(valueNumber).mapToInt(Integer::parseInt).toArray();
        List<Integer> resultArray = Arrays.stream(intArray).boxed().collect(Collectors.toList());
        System.out.println("");
        System.out.println("보너스 번호를 입력해 주세요.");
        resultArray.add(Integer.parseInt(Console.readLine()));

        return resultArray;
    }
}

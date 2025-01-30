// 3주차 1번

package third_week;

import java.util.Random;

public class random {
    // 0~9 사이의 숫자 50개를 랜덤 생성하여 카운트
    public static int[] count(int[] numbers){
        int[] counts = new int[10];

        for (int num : numbers){
            counts[num]++;
        }

        /* for (int i = 0; i < numbers.length; i++){
            int num = numbers[i];
            counts[num]++;
        } 
            */
        return counts;
    }
    // 숫자별 출현 횟수를 출력
    public static void print(int[] counts) {
        for (int i = 0; i < counts.length; i++) {
        System.out.println(i + "번 숫자 : " + counts[i] + "개");        
        }
    }

    public static void main(String[] args) {
        Random random = new Random(); // 랜덤 객체 생성
        int[] numbers = new int[50]; // 랜덤 숫자를 저장할 배열

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10);
        }
        // 생성된 숫자를 카운트하는 함수 호출
        int[] counts = count(numbers);

        System.out.println("결과");
        print(counts);
    }
}


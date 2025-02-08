// 문제
// 0~9 사이 임의 숫자 2개를 생성한 후 10개의 덧셈 문제 출제
// 답을 입력 받고, 사용자가 맞힌 개수와 틀린 개수를 최종적으로 출력

package six_week;

import java.util.Random;
import java.util.Scanner;

public class sumgame {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("다음 열 문제를 푸시오.");
        
        int rightCount = 0; // 정답 카운트를 세야하니까 변수 생성 및 초기화
        int wrongCount = 0; // 틀린 갯수도 세야하니까 틀렸을 때 변수 생성 및 초기화화
        
        // 문제를 10개 반복하기 위해 for문을 사용
        for (int i = 0; i < 10; i++){
            int x = rand.nextInt(10);
            int y = rand.nextInt(10);

            //System.out.println(i + "번째 문제 : " + x + '+' + y + '='); 
            // i의 초기값을 0으로 했기 때문에 +1을 함

            System.out.print((i+1) + "번째 문제 : " + x + '+' + y + '='); 
            int my= scanner.nextInt();

            // if문을 사용해서 정답과 같으면 정답 카운트에 1을 추가하고 그렇지 않으면 틀린 카운트에 1을 추가함

            if (answer(x, y, my)){
                rightCount++;
            }
            else {
                wrongCount++;
            }
        }

        System.out.println("맞힌 개수는 " + rightCount);
        System.out.println("틀린 개수는 " + wrongCount);
           
    }
    
    public static boolean answer(int a, int b, int u){
        return (a + b) == u;
    }
}

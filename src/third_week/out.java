// 3주차 2번
// 임의의 영어 문자열을 입력 받은 후 모음만 제거하고 출력하는 프로그램

package third_week;
import java.util.Scanner;

public class out {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("영어 문자열을 입력하시오. : ");
        
        String x = scanner.nextLine();

        String y ="";

        for (int i = 0; i < x.length(); i++){
            char c = x.charAt(i);
            if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u' &&
                c != 'A' && c != 'E' && c != 'I' && c != 'O' && c != 'U') {
                y += c;
            }
        }

        /* for (int i = 0; i < x.length(); i++){
            if (i != 'a' && i != 'e' && i != 'i' && i != 'o' && i != 'u' &&
                i != 'A' && i != 'E' && i != 'I' && i != 'O' && i != 'U') {
                y += i; 
                ->&& (and 연산자)
            }
        } */
       // 처음에 이렇게만 했는데 답이 숫자로 나오길래 수정했음

        System.out.println("모음이 제거된 문자열 : " + y);
    }
}
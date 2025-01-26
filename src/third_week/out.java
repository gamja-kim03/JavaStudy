// 2번

package third_week;
import java.util.Scanner;

public class out {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("영어 문자열을 입력하시오. : ");
        
        String x = scanner.nextLine();

        String y ="";

        for (int i = 0; i < x.length(); i++){
            if (i != 'a' && i != 'e' && i != 'i' && i != 'o' && i != 'u' &&
                i != 'A' && i != 'E' && i != 'I' && i != 'O' && i != 'U') {
                y += i;
            }
        }

        System.out.println("모음이 제거된 문자열 : " + y);
    }
}
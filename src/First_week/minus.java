// 문제 1번
package First_week;
import java.util.Scanner;

public class minus {    
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("결과: ");
                
            System.out.print("num1 : ");
            int x = scanner.nextInt();
                
            System.out.print("num2 : ");
            int y = scanner.nextInt();
                
            System.out.print("두 수의 차 : ");
                
            if ( x - y > 0) {
                System.out.print(x-y);
            }
                
            else {
                System.out.print("0");
                }   
        }
    }
}
    


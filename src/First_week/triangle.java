//4번
package First_week;
import java.util.Scanner;

public class triangle {

public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
        System.out.print("input number :");
        int x = scanner.nextInt();
        
        for (int i=0; i<x; i++){
            for (int j = 0; j< (i+1);j++) {
                System.out.print('*');
                System.out.print(' ');
            }
            System.out.println();
        }
    }
}
}
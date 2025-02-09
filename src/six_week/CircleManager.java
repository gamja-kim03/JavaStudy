// 문제
/* 4장 5번
3개의 Cirle 객체 배열을 만들고 x, y, radius 값을 읽어 3개의 Circle 객체를 만들고 show()를 이용하여 이들을 모두 출력한다. */

package six_week;

import java.util.Scanner;

class Circle{
    private double x;
    private double y;
    private int radius;

    public Circle(double x, double y, int radius){ //매개변수 초기화
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void show(){
        System.out.println("(" + x + "," + y + ")" + radius); 
    }
}

public class CircleManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Circle c [] = new Circle[3];

        for (int i = 0; i < 3; i++) {
            System.out.print ("x, y, radius >>");
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();
            int radius = scanner.nextInt();

            c[i] = new Circle(x, y, radius);
        }
        for (int i = 0; i < c.length; i++)
            c[i].show();
        
        scanner.close();
    }
    
}

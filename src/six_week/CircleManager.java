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

        Circle c [] = new Circle[3]; //3개의 Circle 배열 선언
        //c []=> 레퍼런스 변수 , new Citcle[3]은 객체의 배열이지 객체 자체는 아님

        for (int i = 0; i < 3; i++) {
            System.out.print ("x, y, radius >>");
            double x = scanner.nextDouble(); // x값 입력받기
            double y = scanner.nextDouble(); // y값 입력받기
            int radius = scanner.nextInt(); // 반지름

            c[i] = new Circle(x, y, radius); 
            //Circle의 객체의 값을 위에 만들어짐, 이건 c[]를 통해 c[0]을 통해 출력됨 
            // 
        }
        for (int i = 0; i < c.length; i++) // 모든 Circle 객체 출력
            c[i].show();
        
        scanner.close();
    }
    
}

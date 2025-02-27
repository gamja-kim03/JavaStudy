// 5장 12번
/* 동적 바인딩에 관한 문제이다. 다음 코드가 있을 떄 질문에 답하라.
   1) Shape s = new Circle(); s.draw()가 호출되면 출력되는 내용은?
   2) s.print()가 호출되면 "Circle"이 출력되도록 빈 칸에 적절한 코드를 삽입하라.
   3) s.print()가 호출되면 "Shape"이 출력되도록 빈 칸에 적절한 코드를 삽입하라.
 */
package seven_week;

class Shape {
    public void draw() {
        System.out.println("Shape");
    }

    // 3. s.print()가 호출될 때 "Shape"이 출력되도록 Shape에 print() 추가
    public void print() {
        System.out.println("Shape");
    }
}

// 자식 클래스 Circle 정의 (Shape을 상속)
class Circle extends Shape {
    // 2. s.print()가 호출될 때 "Circle"이 출력되도록 구현
    @Override
    public void print(){
        System.out.println("Circle");
    }

     // draw() 메서드 오버라이딩: "Circle"을 출력
    @Override
    public void draw(){
        System.out.println("Circle");
    }
}

public class Shapeprint {
    public static void main(String[] args) {
         // 1. 동적 바인딩 적용
        // 부모 타입(Shape) 변수 s가 자식 객체(Circle)를 참조
        Shape s = new Circle(); // 업캐스팅
        
        s.draw();// "Circle" 출력 (동적 바인딩으로 Circle의 draw()가 호출됨)

        // 2. s.print()가 "Circle"을 출력하도록 구현됨
        s.print();  // "Circle" 출력 (Circle에서 print()를 오버라이딩했기 때문)

        // 3. 부모 클래스의 print()가 실행되도록 함
        Shape s1 = new Shape();
        s1.print(); // "Shape" 출력 (s1은 부모 객체이므로 부모의 print() 실행)

    }

}

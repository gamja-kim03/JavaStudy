// 5장 8번 문제
/* Point를 상속받아 양수의 공간에서만 점을 나타내는 PositivePoint 클래스를 작성하라.
   다음 main() 메소드를 포함하고 실행 결과와 같이 출력되게 하라.

   point 클래스의 move()를 PositivePoint 클래스에서 오버라이딩하여 재작성하고 적절히 super.move()를 호출해야 한다. 
   PositivePoint의 2개의 생성자에서도 적절히 super()생성자와 super.move()를 호출해야 한다.
 */
package seven_week;

class Pointxy {
    // 멤버 변수 x와 y를 선언하고 각각 초기값을 0으로 설정
    public  int x = 0;
    public  int y = 0;

    //move의 매개변수 x,y의 값을 멤버변수 x,y에 대입
    public void move (int x, int y){
        this.x = x;
        this.y = y;
    }

    // 기본 생성자 추가
    public Pointxy(){

    }
}

class PositivePoint extends Pointxy{

    // super를 써서 부모 클래스의 기본 생성자 호출
    public PositivePoint(){
        super();
    }


    public PositivePoint(int x, int y){
        super(); // 부모 클래스의 기본 생성자 호출
        // x,y의 값이 0보다 크다면
        if ( x >= 0 && y >= 0){ 
            // 부모 클래스의 move()를 호출하여 멤버 변수 x,y에 매개변수 x,y 값을 대입
            super.move(x,y);
        } 
        else { // 아니라면
            // 부모 클래스의 move()를 호출하여 멤버 변수 x,y를 0으로 초기화
            super.move(0,0);
        }
    }

    // 부모 클래스의 move()를 오버라이딩
    @Override
    public void move (int x, int y) {
        // x,y 값이 모두 0보다 크다면
        if ( x >= 0 && y >= 0){
            // 부모 클래스의 move()를 호출하여 PositivePoint에서 갱신된 x,y값에 다시 x,y로 갱신
            super.move(x, y);
        }
    }

    public String toString(){
        return "(" + x + "," + y + ")의 점";
    }
}
public class PointPrint {
    public static void main(String[] args) {
        PositivePoint p = new PositivePoint();

        p.move(10,10);
        System.out.println(p.toString() + "입니다.");

        p.move(-5, 5);
        // x의 값이 음수라 아무 수행을 안해서 그대로 10,10 출력
        System.out.println(p.toString() + "입니다.");

        PositivePoint p2 = new PositivePoint(-10, -10);
        System.out.println(p2.toString() + "입니다.");
        
    }

}

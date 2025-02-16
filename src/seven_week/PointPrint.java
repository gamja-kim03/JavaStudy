// 5장 8번 문제
/* Point를 상속받아 양수의 공간에서만 점을 나타내는 PositivePoint 클래스를 작성하라.
   다음 main() 메소드를 포함하고 실행 결과와 같이 출력되게 하라.

   point 클래스의 move()를 PositivePoint 클래스에서 오버라이딩하여 재작성하고 적절히 super.move()를 호출해야 한다. 
   PositivePoint의 2개의 생성자에서도 적절히 super()생성자와 super.move()를 호출해야 한다.
 */
package seven_week;

class Pointxy {
    public  int x = 0;
    public  int y = 0;

    public void move (int x, int y){
        this.x = x;
        this.y = y;
    }
}

class PositivePoint extends Pointxy{

    public PositivePoint(){
        super();
    }

    public PositivePoint(int x, int y){
        super();
        if ( x >= 0 && y >= 0){
            super.move(x,y);
        } 
        else {
            super.move(0,0);
        }
    }

    @Override
    public void move (int x, int y) {
        if ( x >= 0 && y >= 0){
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

        p.move(-5, 5); // 객체 p는 음수 공간으로 이동되지 않음
        System.out.println(p.toString() + "입니다.");

        PositivePoint p2 = new PositivePoint(-10, -10);
        System.out.println(p2.toString() + "입니다.");
        
    }

}

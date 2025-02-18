// 5장 5번
/* point를 상속받아 색을 가진 점을 나타내는 ColorPoint 클래스를 작성하라.
   다음 main() 메소드를 포함하고 실행결과와 같이 출력되게 하라.*/ 

package seven_week;

class Point {
    // 멤버 변수 x와 y를 선언하고 각각 초기값 0으로 설정
    public  int x = 0;
    public  int y = 0;
    public String color = "";

    // 멤버 변수의 값에 매개변수 값 대입
    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }
}

// point 클래스를 상속받는 ColorPoint 클래스 설정
class ColorPoint extends Point {
    // 색상 정보를 저장할 color 멤버 변수를 선언하고 초기값 설정
    //public String color = "";

    //ColorPoint 생성자를 만들었음
    public ColorPoint(int x, int y, String color) {
        this.setXY(x, y); // ColorPoint 객체의 setXy 메서드를 호출함 -> 상속받았기 떄문에 가능능
        this.color = color; // ColorPoint 클래스의 멤버 변수에 매개변수 color 대입입
    }

    //색깔을 바꾸기 위해 setColor 메소드를 만들었음
    public void setColor(String color){
        this.color = color; // 매개변수 color를 멤버 변수 color에 대입
    }

    //출력값이 (10,20)의 점이라고 나와야해서 
    // 색상과 좌표 정보를 조합하여 반환
    public String toString(){
        return color + "색의 (" + x + "," + y + ")의 점";
    }

}

// 출력하기 위한 colorpoint 클래스 생성
public class Colorprint {
    public static void main(String[] args) {
        // colorpoint 객채 cp를 생성하고 ColorPoint의 값에 5,5, YELLOW로 초기값 설정 
        ColorPoint cp = new ColorPoint(5, 5, "YELLOW");

        // setXY 메소드에 x,y 값을 10,20으로 변경
        cp.setXY(10, 20);

        // setColor 메소드에 값을 RED로 변경
        cp.setColor("RED");

        //toString 메소드를 str 변수에 저장
        String str = cp.toString();
        
        System.out.println(str + "입니다.");
    }
    
}

// 
// 
/* cp의 값 = x : 5 , y : 5 , color: YELLOW
   cp.setXY(10,20) = x : 10, y : 20, color : YELLOW
   cp.setcolor("RED") = x : 10, y : 20, color : RED
   str : RED색의 (10,20)의 점
 */

// 5장 5번
/* point를 상속받아 색을 가진 점을 나타내는 ColorPoint 클래스를 작성하라.
   다음 main() 메소드를 포함하고 실행결과와 같이 출력되게 하라.*/ 

package seven_week;

class Point {
    public  int x = 0;
    public  int y = 0;

    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }
}

class ColorPoint extends Point {
    public String color = "";

    public ColorPoint(int x, int y, String color) {
        this.setXY(x, y);
        this.color = color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String toString(){
        return color + "색의 (" + x + "," + y + ")의 점";
    }

}
public class Colorprint {
    public static void main(String[] args) {

        ColorPoint cp = new ColorPoint(5, 5, "YELLOW");

        cp.setXY(10, 20);
        cp.setColor("RED");

        String str = cp.toString();
        System.out.println(str + "입니다.");
    }
    
}


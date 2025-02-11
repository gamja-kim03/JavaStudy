// 문제
/* 4장 4번
 다음 멤버를 가지고 직사각형을 표현하는 Rectangle 클래스를 작성하라.
 - int 타입이 x,y width, height 필드 : 사각형을 구성하는 점과 크기 정보
 - x,y width, height 값을 매개변수로 받아 필드를 초기화하는 생성자
 - int square() : 사각형 넓이 리턴
 - void show : 사격형의 좌표와 넓이를 화면에 출력
 - boolean contains(Rectangle r): 매개변수로 받은 r이 현 사각형 안에 있으면 true 리턴
 */

package six_week;

class Rectangle {
    // 멤버변수 설정 및 초기화
    int x = 0;
    int y = 0;
    int width = 0;
    int height = 0;

    public Rectangle(int x, int y, int width, int height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    // 사각형의 넓이를 반환하는 메서드
    public int square(){
        return width * height;
    }

    //사각형의 좌표 및 넓이를 출력하는 메서드
    public void show(){
        System.out.println("("+ x + "," + y + ")" + "에서 크기가 " + width+'x'+height+"인 사각형");
    }

    //매개변수로 받은 사각형 r이 현재 사각형 내부에 포함되는지 확인하는 메서드

    // 포함된다는 말이 정확히 어떤건지 이해 못함
    
    /* public  boolean contains(){
        return 
    } */
}
public class box {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(2,2,8,7);
        Rectangle s = new Rectangle(5, 5,6,6);
        Rectangle t = new Rectangle(1,1,10,10);

        r.show();
        System.out.println("s의 면적은 " + s.square());
     /*   if(t.contains(r)){
        System.out.println("t는 r을 포함합니다");
       }
      
       if(t.contains(s)) {
        System.out.println("t는 s를 포함합니다");
       }    */
    }   
}

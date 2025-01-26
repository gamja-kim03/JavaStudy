// 3주차 5번

package third_week;
import java.util.Arrays;

public class pr {
    public static void main(String[] args) {
        System.out.println("문자열");

        String a = "aaa,ccc,bbb,111,222";

        System.out.println(a);
        System.out.println();

        System.out.println("출력");
        String[] x = a.split(",");

        // System.out.println(x);
        System.out.println(Arrays.toString(x)); 
        // 처음에 그냥 x를 출력하니까 배열의 주소가 나옴
        // 찾아보니까 배열의 내용을 문자열로 바꿔주는 메서드가 있어서 사용함함

        System.out.println("");

        for (int i = 0; i < x.length; i++) {
            String y = x[i];
            System.out.println(y);       
        }
    }
}

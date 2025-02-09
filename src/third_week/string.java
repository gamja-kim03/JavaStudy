// 3주차 4번
/*
다음 코드를 실행할 떄 아래 결과를 출력하는 함수(myreplace)를 구현하시오
String str = "Hello World"
String result = myreplace(str1, "World", "Kim")
System.out.println(result)
 */

package third_week;

public class string {
    public static void main(String[] args) {
        String str = "Hello World";
        String result = myreplace(str, "World", "Kim");
        System.out.println("결과");
        System.out.print(result);
    }
    public static String myreplace(String str, String world, String Kim){
            return str.replace(world, Kim);      
    }
}

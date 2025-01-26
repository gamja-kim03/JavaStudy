// 4번

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

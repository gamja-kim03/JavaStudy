// 5번 문제 -> 함수로 수정해서 다시 수정하기

package First_week;
public class array2 {
    public static void main(String[] args) {
        System.out.println("결과 :");
    
        int[] Original = new int[]{ 5,6,3,7,8,9 };
        System.out.print("Original Array : ");
            for(int i = 0; i < Original.length; i++) {
            System.out.print(Original[i] + " , ");
            }
        System.out.println("");
    
        System.out.print("New Array : ");
        for(int i = Original.length-1; i >=0; i--) {
            System.out.print(Original[i] + " , ");
            }
    }
}

//1주차 문제 3번
package First_week;

public class array {
    public static void main(String[] args) {
    System.out.println("결과 :");

    int[] Original = new int[]{ 2,6,5,3,6,9 };
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

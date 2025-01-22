// 2주차 1번 문제

package Secound_week_real;

public class sum {
    public static void main(String[] args) {
        System.out.println("결과");

        System.out.print("arry 1 : ");
        
        int[] arr1 = new int[]{2,4,5,6,3};
        
        for (int i : arr1){
            System.out.print(i + ",");
        }
        /* for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + ",");
        } */

        System.out.println("");

        int[] arr2 = new int[]{1,3,4,5,6};

        System.out.print("arry 2 : ");

        for (int i : arr2) {
            System.out.print(i + ",");
        }

       /*  
       for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + ",");
        } */
        
        int[] sum = sum(arr1, arr2);

        System.out.println("");

        System.out.println("merge array : "); 

        for ( int i : sum)  {
            System.out.print(i + ",");
        }

        /*  for (int i = 0; i < sum.length; i++) {
            System.out.print(sum[i] + ",");
            } */
    
    }  

      /*  2차 시도..
        -> 함수를 사용해서 만들기 전에 만들어보려고 함
        -> 
         int[] sumArray = new int[arr1.length + arr2.length];
        -> sumArray 크기 지정

        for (int i = 0; i < arr1.length; i++) {
            sumArray[i]=arr1[i];
        } -> 먼저 arr1 인덱스를 sumArray 인덱스에 덮어씌움

        for (int i = 0; i < arr2.length; i++) {
            sumArray[i]=arr2[i];
        } -> 그 다음 arr2 인덱스를 sumArray 인덱스에 덮어씌움

        for (int i = 0; i < sumArray.length; i++) {
            System.out.print(sumArray[i] + ",");
        } -> 그리고 sumArray 배열 출력

         이때 문제점 
         1. 맨 마지막에 덮어씌운 arr2[i]값만 출력되고 나머지 공간은 0으로 채워짐*/


        /* 시도 1 -> 배열 크기만 설정되어 안에 넣어주는 코드를 추가해야할듯

        int[] sumArray =  new int[arr1.length+arr2.length];

        for (int i = 0; i < sumArray.length; i++) {
            System.out.print(sumArray[i] + ",");
        }  */
 
    public static int[] sum(int[] arr1,int[] arr2){
        int[] sum = new int[arr1.length+arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            sum[i] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            sum[arr1.length+i] = arr2[i];
        }
        /* 처음에 sum[i] = arr2[i]로 했는데 앞에서 sum[i] = arr1[i]를 해서 최종적으로는 arr2 값 밖에 안남게됨
            -> 1,3,4,5,6,0,0,0,0, 이래서 뭔가 이걸 옆으로 밀면 0의 값이 arr2값으로 채워질 것 같다는 생각이 들었음
        그래서 arr1의 길이 만큼 밀기위해 arr1.lenght를 앞에 더했음 */
        return sum;
    }
}
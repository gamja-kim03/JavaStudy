package Secound_week_real;

public class sum {
    public static void main(String[] args) {
        System.out.println("결과");

        System.out.print("arry 1 : ");
        
        int[] arr1 = new int[]{2,4,5,6,3};

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + ",");
        }
        System.out.println("");

        int[] arr2 = new int[]{1,3,4,5,6};

        System.out.print("arry 2 : ");

        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + ",");
        }
        
        System.out.println("");

        System.out.println("merge array : ");  

       /* 시도 1 -> 배열 공간은 나왔으나 숫자는 안나옴....

        int[] sumArray =  new int[arr1.length+arr2.length];

        for (int z = 0; z < sumArray.length; z++) {
            System.out.print(sumArray[z] + ",");
        }  */
    }    
}
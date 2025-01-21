package Secound_week_real;

public class sumtwo {
    public static void main(String[] args) {
        System.out.println("결과");

        System.out.print("arry 1 : ");
        
        int[] arr1 = new int[]{2,4,5,6,3};
        
        for (int i : arr1){
            System.out.print(i + ",");
        }

        System.out.println("");

        int[] arr2 = new int[]{1,3,4,5,6};

        System.out.print("arry 2 : ");

        for (int i : arr2) {
            System.out.print(i + ",");
        }
        
        int[] sum = sum(arr1, arr2);

        System.out.println("");

        System.out.println("merge array : "); 

        for ( int i : sum)  {
            System.out.print(i + ",");
        }    
    }  
    public static int[] sum(int[] arr1,int[] arr2){
        int[] sum = new int[arr1.length+arr2.length];

    for (int i = 0; i < arr1.length; i++) {
        sum[i] = arr1[i];       
    }

    for (int i = 0; i < arr2.length; i++) {
        sum[arr1.length+i] = arr2[i];
    }
    return sum;
    }
}   
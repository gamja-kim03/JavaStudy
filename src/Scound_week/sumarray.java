package Scound_week;

public class sumarray {

    public static void main(String[] args) {
        System.out.println("결과 :");

        int[] arr1 = new int[]{2, 4, 5, 6, 3};
        System.out.print("array 1 : ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + ",");
        }
        System.out.println();

        int[] arr2 = new int[]{1, 3, 4, 5, 6};
        System.out.print("array 2 : ");
        for (int y = 0; y < arr2.length; y++) {
            System.out.print(arr2[y] + ",");
        }
        System.out.println();

        int[] newArray = sum(arr1, arr2);
        System.out.print("merge array : ");
        for (int z = 0; z< newArray.length; z++){
            System.out.print(newArray[z]+",");
        }
    }

    public static int[] sum(int[] arr1, int[] arr2) {
        // 새로운 배열 생성
        int[] newArray = new int[arr1.length + arr2.length];

        // 첫 번째 배열 복사
        for (int i = 0; i < arr1.length; i++) {
            newArray[i] = arr1[i];
        }

        // 두 번째 배열 복사
        for (int i = 0; i < arr2.length; i++) {
            newArray[arr1.length + i] = arr2[i];
        }

        return newArray;

    }
}
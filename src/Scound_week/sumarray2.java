package Scound_week;

import java.util.HashSet;
import java.util.Set;

//https://adjh54.tistory.com/175 이 사이트 참고해서 코드르 만들었습니다!

public class sumarray2 {
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

        int[] newArray = sum(arr1, arr2);// 두 배열 중복 제거 후 배열 합치기
        System.out.print("merge array : ");
        for (int z = 0; z < newArray.length; z++) {
            System.out.print(newArray[z] + ",");
        }
    }

    public static int[] sum(int[] arr1, int[] arr2) {

        // set을 이용하여 중복 제거
        Set<Integer> set = new HashSet<>(); 
        //HashSet은 자동으로 중복을 제거해주는 코드드

        // 모든 요소에 set 추가
        for (int i = 0; i < arr1.length; i++) {
           set.add(arr1[i]); // 중복된 값은 자동으로 추가되지 않음
        }

        // 두 번째 배열 복사
        for (int i = 0; i < arr2.length; i++) {
            set.add(arr2[i]);
        }

        // Set의 크기를 기반으로 새로운 배열 생성
        int[] newArray = new int[set.size()];
        int index = 0;
        // Set에 있는 값을 새로운 배열에 추가가
        for (int num : set) {
            newArray[index++] = num; // set에서 각 값을 배열로 변환
        }

        return newArray;
    }

}

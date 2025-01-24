package third_week;

public class one {
    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25};

        
        System.out.println("array1 : ");

        /* 1차시도 -> 이건 단순히 순서대로 출력만 가능
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+"\t");

            if((i+1)%5==0){
                System.out.println();
            }
            
        } */

        // 문제를 보니까 홀수열은 원래 순서대로 출력하고 짝수열은 역순(?)으로 출력 되는 것 같아 이걸 이용하려고 함함
        
        for (int i = 0; i <5; i++) { // 5개의 행을 반복
            // i가 짝수인 행은 원래 순서대로 출력력
            if ( i % 2 ==0){
                for (int j = 0; j < 5; j++) { //각 행애서 5개의 열을 반복복
                    System.out.print(array[i*5+j]+ " ");                    
                }
            }
            //i가 홀수인 행은 역순으로 출력력
            else {
                for (int j =5-1; j>=0; j--) {
                    System.out.print(array[i*5+j]+ " ");        
                }
            }
            System.out.println("");           
        }
    }
}

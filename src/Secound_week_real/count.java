package Secound_week_real;

public class count {
    public static void main(String[] args) {
        int [] array1 = new int[]{4,3,6,7,8,3,4,5,3,4,1};
        for (int i = 0; i < array1.length; i++) {
            int count = 0;
            for (int j = 0; j < array1.length; j++){
                if ( array1[i]==array1[j]){
                    count++;
                }   
            }
            System.out.println(array1[i] + "는(은) " + count + "번");
        }
    }
}

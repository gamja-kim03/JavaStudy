import java.util.Random;

public class random2 {
     public static void main(String[] args) {
        
        // 50개의 랜덤 숫자를 생성하는 메서드를 호출
        int[] nums = make(); // make() 메서드로 nums 배열을 생성함

        // nums 배열에서 2의 배수, 3의 배수, 5의 배수 개수를 계산하고 출력함
        count(nums, 2); // 2의 배수 개수 출력
        count(nums, 3); // 3의 배수 개수 출력
        count(nums, 5); // 5의 배수 개수 출력

        // nums 배열의 숫자를 5개씩 끊어서 출력하는 메서드 호출
        print(nums); // print() 메서드로 배열을 5개씩 출력함
    }

    // 랜덤 숫자 생성 메서드
    public static int[] make() { // 랜덤 숫자를 생성하는 메서드
        Random rand = new Random(); // 랜덤 숫자를 생성하기 위한 객체 생성
        
        int[] nums = new int[50]; // 크기가 50인 정수 배열 생성

        // 50번 반복하면서 랜덤 숫자(0~9)를 nums 배열에 넣음
        for (int i = 0; i < 50; i++) {
            nums[i] = rand.nextInt(10); // 0부터 9 사이의 랜덤 숫자 생성
        }
        return nums; // 랜덤 숫자들이 들어있는 배열을 반환
    }

    // 배수 개수 계산 및 출력 메서드
    public static void count(int[] nums, int div) {
        int cnt = 0; // 배수의 개수를 셀 변수 선언

        // nums 배열에 있는 각 숫자를 확인
        for (int num : nums) {
            // num이 div로 나누어 떨어지면 (즉, 배수일 때)
            if (num % div == 0) {
                cnt++; // 배수 개수 증가
            }
        }
        // 배수의 개수를 출력
        System.out.printf("%d의 배수: %d개\n", div, cnt);
    }

    // 숫자 출력 메서드
    public static void print(int[] nums) {
        System.out.println("\n생성된 숫자:");

        // nums 배열의 각 숫자를 하나씩 출력
        for (int i = 0; i < nums.length; i++) {
            System.out.printf("%d ", nums[i]); // 배열의 숫자를 출력

            // group 값마다 줄바꿈을 함
            if ((i + 1) % 5 == 0) { 
                System.out.println();
            }
        }
    }
    
}
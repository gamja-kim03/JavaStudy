import java.util.Random;

public class random {
    public static void main(String[] args) {
		
		Random rand = new Random (); //랜덤이라는 클래스 생성 , 객체 rand를 생성
		
		int [] num = new int [50]; // 배열 크기를 50으로 지정 -> 50개의 숫자를 만들어야하니까 
		
		for(int i = 0; i<50; i++)
			num[i] = rand.nextInt(10); //숫자를 50개를 반복해야하니까 i < 50으로 해야함 -> 0부터 시작이기 때문에 i<=50으로 하게 되면 배열의 크기인 50을 넘어가기 때문임
									   //nextInt라는 매서드는 0이상의 ()값 미만의 정수 중에서 임의의 값을 반환하는 메서드 -> (10) 으로 한 이유는 숫자가 0이상 10미만의 숫자가 있어야하기 때문
		
		System.out.println("생성된 숫자 (5개씩 출력) : ");
		for (int i = 0; i <50; i++) {
			System.out.printf("%d ",num[i]);
			if ((i+1) % 5 == 0) {
				System.out.println();
				}
				
		}
		
		int count = 0;
		for (int i = 0; i <50; i++) {
			if ( num[i] % 2 == 0) {
				count ++;		
				}
				else if (num[i] == 0) {
				count -=1;
			}

		}
		System.out.println("\n2의 배수 " + count + "개");
		
		int count3 = 0;
		for (int i = 0; i <50; i++) {
			if (num[i] % 3 == 0) {
				count3 ++;		
				}
				else if (num[i] == 0) {
				count3 -=1;
			}
	
		}
		System.out.println("\n3의 배수 " + count3 + "개");
		
		
		int count5 = 0;
		for (int i = 0; i <50; i++) {
			if ( num[i] % 5 == 0) {
				count5 ++;		
				}
				else if (num[i] == 0) {
				count5 -=1;
			}
	
		}
		System.out.println("\n5의 배수 " + count5 + "개");

		
	}
}
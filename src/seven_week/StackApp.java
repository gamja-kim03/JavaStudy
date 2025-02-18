//5장 9번
/*  다음 Stack 인터페이스를 상속받아 실수를 저장하는 StringStack 클래스를 구현하라.
    그리고 다음 실행 사례와 같이 작동하도록 StackApp 클래스에 main() 메소드를 작성하라.

    실행 결과
    총 스택 저장 공간의 크기 입력 >> 3
    문자열 입력 >> hello
    문자열 입력 >> sunny
    문자열 입력 >> smile
    문자열 입력 >> happy
    스택이 꽉 차서 푸시 불가!
    문자열 입력 >> 그만 -> "그만"을 입력하면 프로그램 종료
    스택에 저장된 모둔 문자열 팝 : smile sunny hello
 */

package seven_week;

interface Stack {
    public int length(); //스택에 저장된 요소의 개수를 반환
    public int capacity(); // 스택의 총 용량을 반환
    public String pop(); // 스택에서 가장 마지막에 저장된 요소
    public boolean push(String val); // 스택에 값을 추가
}

// Stack 인터페이스 상속받아 StringStack 클래스 구현
class StringStack implements Stack {
    private String[] stack; // 스택을 저장할 배열
    private int top; // 현재 스택의 위치
    private int capacity; // 스택의 총 용량

    // 생성자 StringStack를 사용해서 사용자가 입력한 용량만큼 배열 초기화
    public StringStack(int capacity) {
        this.capacity = capacity; // 멤버변수 capacity에 매개변수 capacity의 값 대입
        this.stack = new String[capacity]; // 입력한 용량의 크기만큼 배열 생성
        this.top = 0; // 초기에는 비어 있음
    }

    @Override
    public int length() {
        return top; // 현재 스택에 저장된 요소 수 반환
    }

    @Override
    public int capacity() {
        return capacity; // 스택의 총 용량 반환
    }

    @Override
    public String pop() {
        if (top == 0) {
            return null; // 스택이 비어 있는 경우 null 반환
        }
        top--; // top을 감소시켜 스택의 마지막 값을 꺼냄
        return stack[top]; // 제거된 값을 반환, 꺼낸 요소를 반환
    }

    @Override
    public boolean push(String val) {
        if (top >= capacity) {
            return false; // 스택이 가득 찬 경우
        }
        stack[top] = val; // 값을 스택에 저장
        top++; // top 증가
        return true;
    }
}

// 실행을 위한 StackApp 클래스
public class StackApp {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("총 스택 저장 공간의 크기 입력 >> ");
        int capacity = scanner.nextInt(); // 스택 용량 입력
        StringStack stack = new StringStack(capacity);

        scanner.nextLine(); // 버퍼 비우기
        while (true) {
            System.out.print("문자열 입력 >> ");
            String input = scanner.nextLine();

            if (input.equals("stop")) {
                break; // "그만" 입력 시 종료
            }

            if (!stack.push(input)) {
                System.out.println("스택이 꽉 차서 푸시 불가!");
            }
        }

        System.out.print("스택에 저장된 모든 문자열 팝 : ");
        String str;
        while ((str = stack.pop()) != null) {
            System.out.print(str + " ");
        }

        scanner.close();
    }
}



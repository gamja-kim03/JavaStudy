package ex;

/* 캡슐화 예시
- 캡슐화를 구현하기 위한 방법 -> 접근 제어자 화용 
- private : 동일 클래스내에서만 접근 가능

- defauit : 동일 패키지 내에서만 접근 가능

- protected : 동일 패키지 + 다른 패키지의 하위 클래스 내에서만 접근 가능

- public : 접근 제한 없음

-> b의 접근 지정자는 private로 지정 되어있어서 Sample 클래스에서만 사용 가능 그래서 오류 발생 */

class Sample{
    public int a;
    private  int b;
    int c; 
}

public class capEx {
    public static void main(String[] args) {
        Sample sample = new Sample();
        sample.a = 10;
        /* sample.b = 10; */
        sample.c=10;
    }

}



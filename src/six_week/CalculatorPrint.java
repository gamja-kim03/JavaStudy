// 4장 11번

/* 
다수의 클래스를 만들고 활용하는 연습을 해보자. 
더하기, 빼기, 곱하기, 나누기를 수행하는 각 클래스 Add, Sub, Mul, Div를 만들어라.
이들은 모두 다음 필드와 메소드를 가진다.

- int 타입의 a,b 필드: 2개의 피연산자
- void setValue(int a, int b): 피연산자 값을 객체 내에 저장한다.
- int calculate(): 클래스의 목적에 맞는 연산을 실행하고 결과를 리턴한다. */

package six_week;

import java.util.Scanner;

class Calculator { // 상속을 사용하라고 해서 일단 부모클래스를 만들었음
    // 멤버변수 설정
    public int a;
    public int b;
    
    //메개변수
    public void setValue(int a, int b){
        this.a = a;
        this.b = b;
    }

    int calculate(){
        return 0;  
    }
}

//덧셈 연산 클래스
class Add extends Calculator { //extends를 사용하여 상속함
    @Override
    int calculate(){
        return a + b;
    }   
}

// 뺄셈 연산 클래스
class Sub extends Calculator {
    @Override
    int calculate(){
        return a - b;
    }   
}

// 곱셈 연산 클래스
class Mul extends Calculator {
    @Override
    int calculate(){
        return a * b;
    }   
}

// 나눗셈 연산 클래스
class Div extends Calculator {
    @Override
    int calculate(){
        if(b == 0){
            System.out.println("0으로 나눌 수 없습니다.");
        }
        return a /b;
    }

    // 0으로 나누면 오류가 있어서 b가 0이면 나눌 수 없다는 말을 추가하고 싶어서
    // 추가했는데 적용이 안됨..
    
}

// 계산기 실행 클래스
public class CalculatorPrint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("두 정수와 연산자를 입력하시오 >> ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        String c = scanner.next(); // 부호를 입력받아야 하니까 부호를 입력받은 c를 추가함

        /*  이렇게 하니까 오류가 나서 생각해보니 
        calc가 if문 안에서만 선언되어 코드가 오류가 난 것 같다고 판단하여 수정함
        
        if(c.equals("+")){
           Calculator calc = new Add();
        }
        else if(c.equals("-")){
            Calculator calc = new Sub();   
        }
        else if(c.equals("*")){
            Calculator calc = new Mul();
        }
        else if(c.equals("/")){
            Calculator calc = new Div();
        }

        calc.setValue(a,b);
        System.out.println(calc.calculate()); */

        Calculator calc = null; // calc 변수를 만들고 초기값 적용

        if(c.equals("+")){
            calc = new Add();
        } //입력받은 부호가 +면 add 클래스의 객체를 만들어서 calc에 적용

        else if(c.equals("-")){
            calc = new Sub();   
        }
        else if(c.equals("*")){
            calc = new Mul();
        }
        else if(c.equals("/")){
            calc = new Div();
        }
 
        calc.setValue(a,b); //입력받은 두 숫자 설정
        System.out.println(calc.calculate()); //결과 출력

        scanner.close();
    }
    

}

package ex;

public class StaticEx {

     /* 
    1.  public void print() {
        System.out.println("hello");
    }

    public static void main(String[] args) {
        {
            print();
        }
    } -> 객체가 없으므로 실행이안됨 만약에 실행하려면 객체를 생성해야 함*/ 

    
    
    /* 2.
         public void print() {
        System.out.println("hello");
    }

    public static void main(String[] args) {
        {   
            StaticEx main = new StaticEx();
            main.print();   
        }
    } //-> 이런식으로 객체를 생성해야 실행 될 수 있음  */

    public static void print(){
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        {
            print();
        }
    }

    // 이런식으로 static을 활용하면 객체를 생성안하고도 사용할 수 있음
}

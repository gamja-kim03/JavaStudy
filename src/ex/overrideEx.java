package ex;


class Animal {
    void sound(){
        System.out.println("동물이 소리를 냅니다다");
    }
}

class Dog extends Animal {
    @Override
    void sound(){
        System.out.println("멍멍멍");
    }
}

class cat extends Animal {
    @Override
    void sound(){
        System.out.println("야옹");
    }
}
public class overrideEx {
    public static void main(String[] args) {
        Animal myAnimal = new Dog();
        myAnimal.sound();

        myAnimal = new cat();
        myAnimal.sound();
    }
    
}

package five_week;

class Tv { // 접근 지정자를 꼭 지정되어야함
    // 멤버 변수를 입력할때는 초기값을 입력해야함함
    public String maker = "";
    public int year = 2000;
    public int size = 0;

    public Tv(String maker, int year, int size){
        this.maker = maker; 
        this.year = year; 
        this.size = size;
    }

    public void show(){
        System.out.println(maker + "에서 만든 " + year + "년 형 `" + size + "인치 TV");
    }
}


public class Tvshow {
    public static void main(String[] args) {
        Tv myTv = new Tv("LG",2017,32);
        myTv.show();
    }
}
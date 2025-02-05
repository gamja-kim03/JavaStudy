package five_week;

class Tv {
    String x;
    int y, z;

    public Tv(String a, int b, int c){
        x = a; y = b; z = c;
    }

    public void show(){
        System.out.println(x + "에서 만든 " + y + "년 형 `" + z + "인치 TV");
    }
}


public class Tvshow {
    public static void main(String[] args) {
        Tv myTv = new Tv("LG",2017,32);
        myTv.show();
    }
}

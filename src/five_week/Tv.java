package five_week;

class Tvshow {
    String x;
    int y;
    int z;

    public Tvshow(String a, int b, int c){
        x = a;
        y = b;
        z = c;
    }

    public void show(){
        System.out.println(x + "에서 만든 " + y + "년 형 " + z + "인치 TV");
    }
}


public class Tv {
    public static void main(String[] args) {
        Tvshow myTv = new Tvshow("LG",2017,32);
        myTv.show();
    }
}

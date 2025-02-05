package five_week;

class Song {
    String title, artist, country;
    int year;

    public Song(String a,String b, int c, String d){
        title = a; artist = b; year = c; country = d;
    }
        
    public void show(){
        System.out.println(year +"년 " + country+"국적의 " + artist+"가 부른 " + title);
    }
}
    
public class Sing {
    public static void main(String[] args) {
         Song x = new Song("Dancing Queen", "ABBA",1978, "스웨덴");
        x.show();
    }   
}

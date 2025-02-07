package five_week;

class Song {
    String title = "";
    String artist = "";
    String country = "";
    int year = 0;
    
    //기본 생성자

    // 메소드 오버로딩 
    public Song(){
    }

    public Song(String title ,String artist, int year, String country){
        this.title = title; 
        this.artist = artist; 
        this.year = year; 
        this.country = country;
    }
        
    public void show(){
        System.out.println(year +"년 " + country + "국적의 " + artist + "가 부른 " + title);
    }
}
    
public class Sing {
    public static void main(String[] args) {
         Song x = new Song("Dancing Queen", "ABBA",1978, "스웨덴");
        x.show();
    }   
}

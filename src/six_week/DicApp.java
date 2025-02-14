// 문제 4장 10번
/* 한글 단어를 입력받은 후 입력받은 단어가 있으면 영어로 출력 
  만약에 없으면 사전에 없다고 출력 그만 이라고 입력하면 빠져나오기
 */

package six_week;

import java.util.Scanner;

class Dictionary {
  private static String [] kor = { "사랑", "아기", "돈", "미래", "희망"};
  private static String [] eng = { "love", "baby", "money", "future", "hope"};
  
  /*public static String kor2Eng(String word) {
    for (int i = 0; i < kor.length; i++) { 배열을 비교해야하니까 반복문 사용
      if(kor[i].equals(word)){word의 값이 kor[i]의 값과 같으면
        return eng[i]; 이제 영어의 단어로 리턴시킴
      }
    }
      return null; 없으면 null 값으로 반환
   }*/

   public static String kor2Eng(String word) {
    for (int i = 0; i < eng.length; i++) {
      if(eng[i].equals(word)){
        return kor[i];
      }
    }
      return null;
   }
   // 처음에는 책의 문제처럼 한글을 입력받고 영어 단어를 출력하는 코드를 작성했는데 코드가 적용이 안되고 계속 사전에 없다는 말만 반복해서
   // 바꿔서 했는데 이건 또 출력이 됨.. 이유를 모르겠음
  
   
}

public class DicApp {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("한영 검색 프로그램입니다.");

    // 그만이라는 입력하기 전까지는 반복을 해야하므로 while문으로 작성함

    while (true) { 
      System.out.print("한글 단어? ");
      String input = scanner.nextLine();

      // 입력한 글자가 그만이면 멈춰야하니까 if와 break 사용

      /*if("그만".equals(input)){
        break;
      }*/

      if("stop".equals(input)){
        break;
      } // 이것도 한글은 적용이 안되어서 stop으로 바꿈
// 문자열 상수는 객체라서 사용할 수 있음

      /* if (input == "그만"){
       break;
      } 처음에는 이렇게 작성하였는데 문자열을 비교할때는 ==보다 equals를 사용하는 것이 좋다고 하여 변경함 
        비교연산자가 문자열에서는 적용을 안해서 equals를 쓸 수 밖에없음*/

      String result = Dictionary.kor2Eng(input); //이해하기
      if (result!= null) {
      System.out.println(input + "은(는) " + result);
      } // 이제 값을 비교해야하니까 if를 써서 result가 null값이 아니면 바꾼 단어를 출력
      else { // 아니면 없다고 출력함
        System.out.println("사전에 없습니다.");
      }
    }
    scanner.close();
  }
}

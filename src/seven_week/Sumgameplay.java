/* 계산기 문제 수정
1. 10문제 출제 후, 5개가 틀리면 똑같은 문제를 다시 풀고 또 2개가 오답이면 동일한 문제 또 출제 후 다 맞으면 끝

2. 문제 출제를 클래스로 만들기 */

package seven_week;

import java.util.Random;
import java.util.Scanner;

// 문제 출제
class Problem {
    private Random rand; // 문제 출제 시 랜덤 숫자를 생성하기 위해 멤버 변수 선언
    private int totalProblems;// 생성할 문제의 개수 

    public Problem(Random rand, int totalProblems) {
        this.rand = rand;
        this.totalProblems = totalProblems;
    }

    // 문제를 생성하는 메서드
    public int[][] generateProblems() {
        // 각 문제에 대해 두 개의 숫자를 묶어서 저장해야하기 떄문에 2차원 배열을 사용하여 각 문제마다 두 개의 숫자를 저장함
        int[][] problems = new int[totalProblems][2]; // 문제를 저장할 2차원 배열 생성
        for (int i = 0; i < totalProblems; i++) {
            problems[i][0] = rand.nextInt(10); // 첫 번째 숫자 (0~9 사이의 랜덤 숫자)
            problems[i][1] = rand.nextInt(10); // 두 번째 숫자 (0~9 사이의 랜덤 숫자)
        }
        return problems; // 생성된 문제 배열 반환
    }
}

public class Sumgameplay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random(); 

        // 문제 생성
        int totalProblems = 10; // 문제의 개수를 10으로 설정
        Problem problem = new Problem(rand, totalProblems); // Problem 객체 생성
        int[][] problems = problem.generateProblems(); // 문제 생성 메서드 호출하여 문제 배열 생성
        boolean[] wrongAnswers = new boolean[totalProblems]; // 오답 문제를 기록하기 위한 배열 생성
        int attempt = 1; // 시도 횟수 초기화

        // 처음에는 모든 문제를 다시 풀도록 true로 설정
        for (int i = 0; i < wrongAnswers.length; i++) {
            wrongAnswers[i] = true; // 모든 문제는 처음에 오답으로 설정
        }

        while (true) { // 게임 진행 시작
            // 문제 출제 및 오답 개수 체크
            int wrongCount = runGame(problems, scanner, wrongAnswers); // 게임 진행 후 틀린 문제 개수 반환

            if (wrongCount == 0) { // 모든 문제를 맞히면 게임 종료
                System.out.println("모든 문제를 맞혔습니다! 게임을 종료합니다.");
                break;
            } else { // 틀린 문제만 다시 풀도록 안내
                System.out.println("틀린 문제를 다시 풀어봅니다. 다시 도전하세요!");
            }

            // 틀린 문제만 다시 출제하기 위해 배열 초기화
            // 틀린 문제만 'true'로 남기고 맞힌 문제는 'false'로 초기화
            resetWrongAnswers(wrongAnswers);

            // 다시 시도할 기회
            attempt++;
        }

        scanner.close(); // Scanner 객체 종료
    }

    // 게임을 실행하고 오답 개수를 반환하는 메서드
    // 틀린 문제만 출제하고, 각 문제의 정답을 확인한 후 틀린 문제 개수를 반환
    public static int runGame(int[][] problems, Scanner scanner, boolean[] wrongAnswers) {
        int wrongCount = 0; // 틀린 문제의 개수 초기화

        // 문제를 10번 출제
        for (int i = 0; i < problems.length; i++) {
            // 틀린 문제만 출제
            if (wrongAnswers[i]) { // 해당 문제에 대해 아직 틀렸다면
                int num1 = problems[i][0]; // 첫 번째 숫자
                int num2 = problems[i][1]; // 두 번째 숫자
                System.out.print((i + 1) + "번째 문제 : " + num1 + " + " + num2 + " = ");
                int userAnswer = scanner.nextInt(); // 사용자 입력 받기

                // 오답일 경우 wrongAnswers 배열에 기록
                if (!checkAnswer(num1, num2, userAnswer)) { // 정답을 확인하고 틀린 경우
                    wrongCount++; // 틀린 문제 수 증가
                    wrongAnswers[i] = true; // 해당 문제를 오답으로 기록
                } else {
                    wrongAnswers[i] = false; // 정답이면 해당 문제를 맞힌 것으로 기록
                }
            }
        }

        return wrongCount; // 최종적으로 틀린 문제의 개수를 반환
    }

    // 정답을 확인하는 메서드
    // 두 숫자의 합과 사용자가 입력한 답을 비교하여 일치하는지 확인
    public static boolean checkAnswer(int num1, int num2, int userAnswer) {
        return (num1 + num2) == userAnswer; // 두 숫자의 합과 사용자가 입력한 답이 같으면 true 반환
    }

    // 틀린 문제를 초기화하는 메서드
    // 틀린 문제는 'true'로 설정, 맞힌 문제는 'false'로 설정하여 틀린 문제만 다시 출제하도록 준비
    public static void resetWrongAnswers(boolean[] wrongAnswers) {
        // 틀린 문제는 'true'로 설정, 맞힌 문제는 'false'로 설정
        for (int i = 0; i < wrongAnswers.length; i++) {
            if (wrongAnswers[i]) { // 틀린 문제만 다시 풀도록 'true'로 설정
                wrongAnswers[i] = true; // 틀린 문제만 재설정
            } 
        }
    }
}

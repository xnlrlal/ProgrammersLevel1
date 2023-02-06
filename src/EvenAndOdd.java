/*
    -- 짝수와 홀수 --
    문제 설명
        정수 num이 짝수일 경우 "Even"을 반환하고 홀수인 경우 "Odd"를 반환하는 함수, solution을 완성해주세요.

    제한 조건
        - num은 int 범위의 정수입니다.
        - 짝수입니다.
 */
public class EvenAndOdd {
    public String solution(int num) {
        String answer;
        if (num % 2 == 0){
            answer = "Even";
        } else answer = "Odd";
        return answer;
    }

    public static void main(String[] args) {
        EvenAndOdd evenAndOdd = new EvenAndOdd();

        String answer1 = evenAndOdd.solution(3);
        System.out.println(answer1);

        String answer2 = evenAndOdd.solution(4);
        System.out.println(answer2);
    }
}

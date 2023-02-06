/*
    -- 자릿수 더하기 --
    문제 설명
        자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
        예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.

    제한사항
        - N의 범위 : 100,000,000 이하의 자연수
 */
public class AddDigits {
    // 내 풀이
    public int solution(int n) {
        int answer = 0;

        for (int i = 8; i >= 0; i--){
            double square1 = Math.pow(10, i+1);
            double square2 = Math.pow(10, i);
            double remainder = n % square1;
            answer += remainder / square2;
        }
        return answer;
    }

    // 다른 사람 풀이
    public int solution2(int n) {
        int answer = 0;

        while (n != 0) {
            answer += n % 10;
            n /= 10;
        }

        return answer;
    }

    public static void main(String[] args) {
        AddDigits addDigits = new AddDigits();
        int N = 123;
        int answer = addDigits.solution(N);
        System.out.println(answer);

        N = 123456789;
        answer = addDigits.solution(N);
        System.out.println(answer);
    }
}

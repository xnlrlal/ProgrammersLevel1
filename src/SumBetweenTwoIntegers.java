/*
    -- 두 정수 사이의 합 --
    문제 설명
        두 정수 a, b가 주어졌을 때 a와 b 사이에 속한 모든 정수의 합을 리턴하는 함수, solution을 완성하세요.
        예를 들어 a = 3, b = 5인 경우, 3 + 4 + 5 = 12이므로 12를 리턴합니다.

    제한 조건
        - a와 b가 같은 경우는 둘 중 아무 수나 리턴하세요.
        - a와 b는 -10,000,000 이상 10,000,000 이하인 정수입니다.
        - a와 b의 대소관계는 정해져있지 않습니다.
 */
public class SumBetweenTwoIntegers {
    public long solution(int a, int b) {
        long answer = 0;

        if (a > b) { // a가 b보다 크면 a와 b의 값 교환
            int tmp = a;
            a = b;
            b = tmp;
        }

        for (int i = a; i <= b; i++) {
            answer += i;
        }

        return answer;
    }

    public long solution2(int a, int b) {
        return sumAtoB(Math.min(a, b), Math.max(b, a));
    }

    private long sumAtoB(long a, long b) {
        return (b - a + 1) * (a + b) / 2; // 등차 수열 공식
    }

    public static void main(String[] args) {
        SumBetweenTwoIntegers twoIntegers = new SumBetweenTwoIntegers();
        long result = twoIntegers.solution(3, 5);
        System.out.println(result);
        result = twoIntegers.solution(3, 3);
        System.out.println(result);
        result = twoIntegers.solution(5, 3);
        System.out.println(result);
    }
}

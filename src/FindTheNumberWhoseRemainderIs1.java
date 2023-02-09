import java.util.stream.IntStream;

/*
    -- 나머지가 1이 되는 수 찾기 --
    문제 설명
        자연수 n이 매개변수로 주어집니다.
        n을 x로 나눈 나머지가 1이 되도록 하는 가장 작은 자연수 x를 return 하도록 solution 함수를 완성해주세요.
        답이 항상 존재함은 증명될 수 있습니다.

    제한사항
        - 3 ≤ n ≤ 1,000,000
 */
public class FindTheNumberWhoseRemainderIs1 {

    // 내 풀이
    public int solution(int n) {
        int answer = 0;
        for (int x = 1; x < n; x++) {
            if (n % x == 1) {
                answer = x;
                break;
            }
        }

        return answer;
    }

    // 다른 사람 풀이
    public int solution2(int n) {
        return IntStream.range(2, n).filter(i -> n % i == 1).findFirst().orElse(0);
    }

    public static void main(String[] args) {
        FindTheNumberWhoseRemainderIs1 remainderIs1 = new FindTheNumberWhoseRemainderIs1();
        int result = remainderIs1.solution(10);
        System.out.println(result);
        result = remainderIs1.solution(12);
        System.out.println(result);
    }
}

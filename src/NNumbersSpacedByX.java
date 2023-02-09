import java.util.stream.LongStream;

/*
    -- x만큼 간격이 있는 n개의 숫자 --
    문제 설명
        함수 solution은 정수 x와 자연수 n을 입력 받아, x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴해야 합니다.
        다음 제한 조건을 보고, 조건을 만족하는 함수, solution을 완성해주세요.

    제한 조건
        - x는 -10000000 이상, 10000000 이하인 정수입니다.
        - n은 1000 이하인 자연수입니다.
 */
public class NNumbersSpacedByX {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        for (int i = 0; i < n; i++) {
            if (n > 1000 || x < -10000000 || x > 10000000) {break;}
            answer[i] = (long)x * (i+1);
            System.out.print(answer[i]);
        }
        return answer;
    }

    public long[] solution2(int x, int n) {
        System.out.println(LongStream.iterate(x, i->i+x).limit(n).toArray());
        return LongStream.iterate(x, i->i+x).limit(n).toArray();
    }

    public static void main(String[] args) {
        NNumbersSpacedByX spacedByX = new NNumbersSpacedByX();
        long[] result = spacedByX.solution2(2, 5);
        System.out.println(result);
        result = spacedByX.solution(4, 3);
        System.out.println(result);
        result = spacedByX.solution(10000000, 1000);
        System.out.println(result);
    }
}
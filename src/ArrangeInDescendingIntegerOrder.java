/*
    -- 정수 내림차순으로 배치하기 --
    문제 설명
        함수 solution은 정수 n을 매개변수로 입력받습니다.
        n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요.
        예를들어 n이 118372면 873211을 리턴하면 됩니다.

    제한 조건
        - n은 1이상 8000000000 이하인 자연수입니다.
 */
public class ArrangeInDescendingIntegerOrder {
    // 내 풀이
    public long solution(long n) {
        long answer = 0;
        String num = Long.toString(n);
        char[] cnum = new char[num.length()];
        String snum = "";

        for (int x = 0; x < num.length(); x++) {
            cnum[x] = (char) Integer.parseInt(String.valueOf(num.charAt(x)));
        }

        for (int i = 0; i < cnum.length; i++) {
            for (int j = i+1; j < cnum.length; j++) {
                if(cnum[i] < cnum[j]) {
                    char tmp = cnum[i];
                    cnum[i] = cnum[j];
                    cnum[j] = tmp;
                }
            }
        }

        for (int i:cnum) {
            snum += i;
        }
        answer = Long.parseLong(snum);

        return answer;
    }

    // 다른 사람 풀이
    String res = "";
    public int solution2(int n){
        res = "";
        Integer.toString(n).chars().sorted().forEach(c -> res = (char) c + res);
        return Integer.parseInt(res);
    }

    public static void main(String[] args) {
        ArrangeInDescendingIntegerOrder order = new ArrangeInDescendingIntegerOrder();
        long result = order.solution2(118372);
        System.out.println(result);
    }
}

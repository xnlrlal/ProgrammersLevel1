/*
    -- 하샤드 수 --
    문제 설명
        양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다.
        예를 들어 18의 자릿수 합은 1+8=9이고, 18은 9로 나누어 떨어지므로 18은 하샤드 수입니다.
        자연수 x를 입력받아 x가 하샤드 수인지 아닌지 검사하는 함수, solution을 완성해주세요.

    제한 조건
        - x는 1 이상, 10000 이하인 정수입니다.
 */
public class HarshadNumber {

    // 내 풀이
    public boolean solution(int x) {
        boolean answer = true;
        String num = Integer.toString(x);
        int sum = 0;
        for (int i = 0; i < num.length(); i++) {
            sum += Integer.parseInt(String.valueOf(num.charAt(i)));
        }

        if (x % sum != 0) {
            answer = false;
        }

        return answer;
    }

    // 다른 사람 풀이
    private int sum = 0;
    public boolean isHarshad(int num){
        sum = 0;
        Integer.toString(num).chars().forEach(c -> sum += c - '0');
        return num % sum == 0;
    }

    public static void main(String[] args) {
        HarshadNumber harshadNumber = new HarshadNumber();
        boolean result = harshadNumber.solution(10);
        System.out.println(result); // true
        result = harshadNumber.solution(12);
        System.out.println(result); // true
        result = harshadNumber.solution(11);
        System.out.println(result); // false
        result = harshadNumber.solution(13);
        System.out.println(result); // false
    }
}

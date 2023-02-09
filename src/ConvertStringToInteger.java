/*
    -- 문자열을 정수로 바꾸기 --
    문제 설명
        문자열 s를 숫자로 변환한 결과를 반환하는 함수, solution을 완성하세요.

    제한 조건
        - s의 길이는 1 이상 5이하입니다.
        - s의 맨앞에는 부호(+, -)가 올 수 있습니다.
        - s는 부호와 숫자로만 이루어져있습니다.
        - s는 "0"으로 시작하지 않습니다.
 */
public class ConvertStringToInteger {
    public int solution(String s) {
        return Integer.parseInt(s);
    }

    public int solution2(String s) {
        int answer = 0;
        int num = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(0) == '-') {
                if (i == 0){
                    continue;
                }
                num = (int) (Character.getNumericValue(s.charAt(i)) * Math.pow(10 ,s.length() - 1 - i));
                answer -= num;
            } else if (s.charAt(0) == '+'){
                if (i == 0){
                    continue;
                }
                num = (int) (Character.getNumericValue(s.charAt(i)) * Math.pow(10 ,s.length() - 1 - i));
                answer += num;
            } else {
                num = (int) (Character.getNumericValue(s.charAt(i)) * Math.pow(10 ,s.length() - 1 - i));
                answer += num;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        ConvertStringToInteger toInteger = new ConvertStringToInteger();
        int result = toInteger.solution2("-1234");
        System.out.println(result);
        result = toInteger.solution("1234");
        System.out.println(result);
    }
}

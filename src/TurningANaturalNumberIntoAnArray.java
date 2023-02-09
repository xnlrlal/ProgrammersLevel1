/*
    -- 자릿수 더하기 --
    문제 설명
        자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
        예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.

    제한사항
        - N의 범위 : 100,000,000 이하의 자연수
 */
public class TurningANaturalNumberIntoAnArray {
    //내 풀이
    public int[] solution(long n) {
        int nLength = (int)Math.log10(n); // 숫자 길이는 nLength+1
        int[] answer = new int[nLength+1]; // 숫자의 길이만큼의 크기를 가진 배열 생성
        String num = Long.toString(n); // Long형의 숫자를 String형으로 변환 -> chatAt을 이용하기 위해

        for (int i=0; i < nLength+1; i++){ // 숫자 길이만큼 반복
            // charAt으로 구한 각각의 숫자들은 char형이므로 출력시 ASCII방식으로 보여짐, 예) 0 -> 48, 1 -> 49, ...
            // 그래서 정수형으로 변환해주기 위해 Character의 getNumericValue 메소드를 사용
            answer[i] = Character.getNumericValue(num.charAt(nLength - i));
            System.out.print(answer[i]);
        }

        return answer;
    }

    // 다른 사람 풀이..
    public int[] solution2(long n) {
        System.out.println(new StringBuilder().append(n).reverse().chars().map(Character::getNumericValue).toArray());
        return new StringBuilder().append(n).reverse().chars().map(Character::getNumericValue).toArray();
    }

    public static void main(String[] args) {
        TurningANaturalNumberIntoAnArray array = new TurningANaturalNumberIntoAnArray();
        int[] result = array.solution(12345);
        System.out.println(result);
        result = array.solution(2837497);
        System.out.println(result);
        result = array.solution(100000000);
        System.out.println(result);
    }
}

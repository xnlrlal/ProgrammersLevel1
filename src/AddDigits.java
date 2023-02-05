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

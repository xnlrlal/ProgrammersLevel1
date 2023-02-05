public class SumOfDivisors {
    public int solution(int n) {
        int answer = 0;

        for (int i=1; i <= n; i++){
            if (n % i == 0){
                answer += i;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        SumOfDivisors sumOfDivisors = new SumOfDivisors();
        int result = sumOfDivisors.solution(12);
        System.out.println(result);
        result = sumOfDivisors.solution(5);
        System.out.println(result);
    }
}

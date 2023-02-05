public class EvenAndOdd {
    public String solution(int num) {
        String answer;
        if (num % 2 == 0){
            answer = "Even";
        } else answer = "Odd";
        return answer;
    }

    public static void main(String[] args) {
        EvenAndOdd evenAndOdd = new EvenAndOdd();

        String answer1 = evenAndOdd.solution(3);
        System.out.println(answer1);

        String answer2 = evenAndOdd.solution(4);
        System.out.println(answer2);
    }
}

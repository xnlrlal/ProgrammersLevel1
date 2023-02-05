public class Average {
    public double solution(int[] arr) {
        double answer;
        double sum = 0;
        for (int i : arr){
            sum += i;
        }
        answer = sum / arr.length;

        return answer;
    }

    public static void main(String[] args) {
        Average average = new Average();
        int[] arr1 = {1, 2, 3 ,4};
        double avg1 = average.solution(arr1);
        System.out.println(avg1);

        int[] arr2 = {5, 5};
        double avg2 = average.solution(arr2);
        System.out.println(avg2);
    }
}

import java.util.Scanner;

public class RectangularStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("가로 >>> ");
        int a = sc.nextInt();
        System.out.print("세로 >>> ");
        int b = sc.nextInt();

        for (int i=0; i < b; i++){
            for (int j=0; j < a; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

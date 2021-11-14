import java.util.Scanner;

public class ExNumber4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = scanner.nextInt();
        System.out.println("Enter the second number");
        int b = scanner.nextInt();
        System.out.println("Enter the third number");
        int c = scanner.nextInt();
        int b1 = b * b;
        int D = b1 - (4 * a * c);
        double sqrt = Math.sqrt(D);
        double answer1 = (-b - sqrt) / (2 * a);
        double answer2 = (-b + sqrt) / (2 * a);
        if (D > 0) {
            System.out.println("there are two answers" + answer1 + " and " + answer2);
        } else if (D == 0) {
            System.out.println("there is one answer" + answer1);
        } else {
            System.out.println("There is no answer");
        }
    }
}


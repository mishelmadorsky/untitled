import java.util.Scanner;

public class ExNumber6 {
    public static void printSeries (int firstNumber, int remainderBetweenNumbers, int numbersOfOrgans) {

        for (int i = 0; i < numbersOfOrgans; i++) {
            System.out.println(firstNumber + ",");
            firstNumber = firstNumber + remainderBetweenNumbers;

        }
        return;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int number1,reminder, numbersOfOrgans;
        System.out.println("Enter the first number");
        number1 = scanner.nextInt();
        System.out.println("Enter the remainder");
        reminder = scanner.nextInt();
        System.out.println("Enter the number of organs");
        numbersOfOrgans = scanner.nextInt();

        printSeries(number1, reminder , numbersOfOrgans);

    }

}

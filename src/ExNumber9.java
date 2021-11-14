import java.util.Scanner;

public class ExNumber9 {
    public static void main (String [] arge) {
        int userChoice = userInput();
        for (int i = 2; i < userChoice; i++) {
            boolean isPrime = primeNumber(i);
            if (isPrime == true) {

                System.out.print(i + " , ");
            }
        }
    }
    public static boolean numberWithoutResidue(int number1, int number2) {
        boolean divisionRemainder = true;
        if (number1 % number2 == 0) {
            divisionRemainder = true;
        } else {
            divisionRemainder = false;
        }
        return divisionRemainder;
    }


    public static boolean primeNumber(int userInput){
        boolean isPrime = true;

        for (int i = 2; i< userInput; i++) {
            if (numberWithoutResidue(userInput, i) == true) {
                isPrime = false;
            }
        }
        return isPrime;
        }


    public static int userInput(){
        Scanner scanner = new Scanner(System.in);
        int userChoice;
        do {
            System.out.println("Enter a number 5-20 : ");
            userChoice = scanner.nextInt();
        }
        while (userChoice < 0 || userChoice >20);

        return userChoice;

    }

}

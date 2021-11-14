import java.util.Scanner;

public class ExNumber2 {
public static void main (String[] args ) {

    Scanner scanner = new Scanner(System.in);

    int num1 , num2 , sum ;
    System.out.println("Enter the first number: ");
    num1=scanner.nextInt();
    System.out.println("Enter the next number: ");
    num2=scanner.nextInt();

    sum = num1 + num2;
    if ( sum % 2 == 0){
        System.out.println("the sum is even");
    }
    else {
        System.out.println("the sum is odd");
    }
}
}

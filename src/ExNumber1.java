import java.util.Scanner;

public class ExNumber1 {
public static void main (String[] args ) {

    Scanner scanner = new Scanner(System.in);
    int integer = 0;
    System.out.println("Enter a number");
    integer = scanner.nextInt();
    if (integer > 0) {
        System.out.println("the number is: "+integer);
    }
    if (integer < 0) {
        System.out.println(  "the number is: "+ integer * (-1) );

    }


}

}


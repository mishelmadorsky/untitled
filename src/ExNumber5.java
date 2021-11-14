import java.util.Scanner;

public class ExNumber5 {
    public static double wageCalculation(int workingType, int hour, int dailyGoal) {
        int wageType0 = 50;
        int wageType1 = 200;
        double salary;
        int dailyGoal1 = 250;

        if (workingType == 0){
            salary = (hour + wageType0) + (dailyGoal + dailyGoal1);
        } else{
            salary = (hour + wageType1) + (dailyGoal + dailyGoal1);
        }
        return salary;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int workingType, hours, dailyGoal;
        int continuatonOfTheProgram = 1;
        while (continuatonOfTheProgram == 1){
            do {
                System.out.println("What kind of worker are you ? 1 or 0 ");
                workingType = scanner.nextInt();
            }
            while (workingType > 2 || workingType < 0);
            System.out.println("Enter how many hours did you work: ");
            hours = scanner.nextInt();
            System.out.println("Enter how many day you sucseeded in the daily goal :");
            dailyGoal = scanner.nextInt();
            System.out.println("Your salary is- " + wageCalculation(workingType, hours, dailyGoal));
            System.out.println("To calculate the next employee press 1 , to stop press any other number :");
            continuatonOfTheProgram = scanner.nextInt();
        }
    }
    }
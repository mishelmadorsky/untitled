import java.util.Scanner;

public class ExNumber7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days;
        int earlyHour;
        int latestHour;
        System.out.println("Enter the day you want to come: Sunday 1 , Monday 2, Tuesday 3, Wednesday 4, Thursday press 5 ");
        days = scanner.nextInt();
        if (days >= 8 || days < 1) {
            System.out.println("This is invaild option");
        }
        if (days == 6 || days == 7){
            System.out.println("We are closed on Friday and Saturday");

        }
         if (days<=5  && days>=1) {
             System.out.println("What is the early hour that you can come");
             earlyHour = scanner.nextInt();
             if (earlyHour > 23 || earlyHour <= 0) {
                 System.out.println("time not exist");
             }
             System.out.println("What is the latest hour you can come");
             latestHour = scanner.nextInt();

             if (latestHour > 23 || latestHour <= 0) {
                 System.out.println("time not exist");
             }
             arriveTime(days, earlyHour, latestHour);
         }
         }

        public static void arriveTime (int day, int earlyHour, int latesthour) {
            switch (day) {
                case 1:
                case 2:
                case 4:
                case 5:

                    if (earlyHour >= latesthour) {
                        System.out.println("The early hour you recorded is higher than the late hour");
                    } else if (earlyHour >= 9 && latesthour <= 17) {
                        System.out.println("You can come");
                    } else {
                        System.out.println("We are close - we are open between 9 am till 5 pm");
                    }
                    break;
            case 3:
                if (earlyHour >= latesthour){
                    System.out.println("The early hour you recorded is higher than the late hour");
                }
                else if (earlyHour >=8 && latesthour <=12) {
                System.out.println("You can come");
            }
             else{
                System.out.println("We are close - we are open between 8 am till 12 pm");
            }
                break;
            default:
                System.out.println("Invaild time");
                }


        }

    }


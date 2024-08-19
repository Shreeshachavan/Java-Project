import java.util.Scanner;

public class week {
    public static void main(String[] args) {
        int week = 0;
        
        Scanner s = new Scanner(System.in);

        System.out.println("Enter Week No(1-7) :");
        week = s.nextInt();
        
        switch(week)
        {
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");
                break;

            default:
            System.out.println("Invalid Week");
        }


    }
    
}

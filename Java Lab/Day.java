import java.util.*;
import java.lang.*;

public class Day {
    public static void main(String[] args) {
        int No = 0;

        System.out.println("Enter Day Number(1-7):");

        Scanner s = new Scanner(System.in);
        No = s.nextInt();

        if(No == 1)
        {
            System.out.println("Monday");
        }
        else if(No == 2){
            System.out.println("Tuesday");
        }
        else if(No == 3)
        {
            System.out.println("Wednsday");
        }
        else if(No == 4)
        {
            System.out.println("Thusday");
        }
        else if(No == 5)
        {
            System.out.println("Friday");
        }
        else if(No == 6)
        {
            System.out.println("Saturday");
        }
        else if(No == 7)
        {
            System.out.println("Sunday");
        }
        else
        {
            System.out.println("Invalid Day");
        }
    
    }
}

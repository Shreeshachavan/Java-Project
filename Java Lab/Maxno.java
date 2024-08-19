import java.util.*;
import java.lang.*;

public class Maxno {
    public static void main(String[] args) {
       
        int No1 = 0;
        int No2 = 0;
        int No3 = 0;

        Scanner s = new Scanner(System.in);

        System.out.println("Enter a 1st Number:");
        No1=s.nextInt();
        System.out.println("Enter a 2nd Number:");
        No2=s.nextInt();
        System.out.println("Enter a 3rd Number:");
        No3=s.nextInt();

        if(No1>No2 && No1>No3)
        {
            System.out.println("Number 1st is Maximum");
        }
        else if(No2>No3 && No2>No3)
            {
                System.out.println("Number 2nd is Maximum");
            }
            else
            {
                System.out.println("Number 3rd is maximum");

            }
        
     }
}

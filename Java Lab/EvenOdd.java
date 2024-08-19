import java.util.*;
import java.lang.*;

public class EvenOdd {
    public static void main(String[] args) {
        int No = 0;

        System.out.println("Enter a Number:");

        Scanner s = new Scanner(System.in);
        No = s.nextInt();
        
        if(No % 2 == 0)
        {
            System.out.println("Number is Even");
        }
        else
        {
            System.out.println("Number is Odd");
        }

    }
    
}

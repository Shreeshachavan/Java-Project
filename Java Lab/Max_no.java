import java.util.*;
import java.lang.*;

public class Max_no {
    
    public static void main(String[] args) {
        int No1 = 0;
        int No2 = 0;

        Scanner s = new Scanner(System.in);

        System.out.println("Enter a First Number:");
        No1 = s.nextInt();
        System.out.println("Enter a Second Number:");
        No2 = s.nextInt();

        if( No1 > No2)
        {
            System.out.println("Number First is Maximun ");
        }
        else
        {
            if(No2 > No1)
            System.err.println("Number Second is Maximum ");
        }

    }
}

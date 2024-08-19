import java.util.*;
import java.lang.*;

public class Addition
{
    public static void main(String[] args) {
        int No1 = 0;
        int No2 = 0;
        int add = 0;

        Scanner s = new Scanner(System.in);

        System.out.println("Enter a No1:");
        No1 = s.nextInt();
        System.out.println("Enter a No2:");
        No2 = s.nextInt();

        add = No1 + No2;

        System.out.print("Addition Of Two Number "+add);
        
    }
}
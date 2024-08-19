import java.util.*;
import java.lang.*;

public class Table {
    public static void main(String[] args) 
    {
        int Mult = 1;
        int i =0;

        System.out.println("Enter the number:");

        Scanner s = new Scanner(System.in);
        int num = s.nextInt();

        System.out.println("Table:");
        for(i=1;i<=10;i++)
        {
            Mult=i*num;
            System.out.println(Mult);
        }

    }
    
}
//("Mult "+" * " + i + " = " + "+ Mult * i +);");
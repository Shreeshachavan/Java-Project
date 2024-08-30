import java.util.*;
import java.util.jar.Attributes.Name;

public class Student_Info
{
    public static void main(String [] args)
    {
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter Student Name:");
        String Name = s.nextLine();

        System.out.print("Enter Roll Number:");
        int rollno = s.nextInt();

        System.out.print("Enter Course:");
        String Course = System.console().readLine();

        System.out.print("Enter City:");
        String City = System.console().readLine();
    }
    
}


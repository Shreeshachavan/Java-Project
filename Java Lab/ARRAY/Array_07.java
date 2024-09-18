import java.util.Scanner;

public class Array_07 
{
    public static void main(String[] args)
    {
        int i = 0;
        int number[]= new int[5];
        Scanner sc = new Scanner(System.in);

        //Displying null Array 

        for(i = 0; i < 5; i++)
        {
            System.out.println("\n values of Element "+(i+1)+"="+number[i]+".");
        }

        //Accepting Array Element From User
        for(i = 0;i <5; i++)
        {
            System.err.println("\n Enter Values of elemet :"+(i+101)+".");

            number[i] = sc.nextInt();
        }
        System.out.println("Entered valurs in Array Are =>\n");

        //Displaying Array With New Values
        for(i = 0; i < 5 ;i++)
        {
            System.out.println("\n values of Element :"+(i+1)+"="+number[i]+".");
        }
        System.out.println("\n\n Thanks");
    } 

}
    

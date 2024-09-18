import java.lang.classfile.instruction.StoreInstruction;

public class Array_06 
{
    public static void main(String[] args) 
    {
        int number[] = new int[5];

        System.out.println("\n value of Element 1 =" +number[0]+ ".");
        System.out.println("\n value of Element 2 =" +number[1]+ ".");
        System.out.println("\n value of Element 3 =" +number[2]+ ".");
        System.out.println("\n value of Element 4 =" +number[3]+ ".");
        System.out.println("\n value of Element 5 =" +number[4]+ ".");

        // Intializing Array Elements
        number[0] = 10;
        number[1] = 20;
        number[2] = 77;
        number[3] = 21;
        System.out.println("Change value in Array are => \n");

        // Displying Array with new values
        System.out.println("\n value of Element 1 =" +number[0]+ ".");
        System.out.println("\n value of Element 2 =" +number[1]+ ".");
        System.out.println("\n value of Element 3 =" +number[2]+ ".");
        System.out.println("\n value of Element 4 =" +number[3]+ ".");
        System.out.println("\n value of Element 5 =" +number[4]+ ".");

        System.out.println("\n\n Thanks");
    }
        
}

    

import java.util.Scanner;

public class Positive_Negative {
    public static void main(String[] args) {
        
        int Num = 0;

        System.out.print("Enter Number :");
        Scanner s = new Scanner(System.in);
        Num = s .nextInt();

        if(Num >=0)
        {
            System.out.println(+Num+ "is Positive Number :");
        }
        else
        {
            System.out.println(+Num+ "is Negetive Number :");
        }
    }
}

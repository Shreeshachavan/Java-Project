import java.util.Scanner;

public class Print_Star {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        System.out.print("Enter A Number :");
        int Num = s.nextInt();

        for(int i = 1; i <= Num; i++)
        {
            System.out.println(" * ");
        }
    }
}

import java.nio.channels.Pipe;
import java.util.Scanner;

public class Radius_Of_Circle {
    public static void main(String[] args) {
        
        double pi = 3.14;
        double area = 0 ;
        double r =0;

        Scanner s = new Scanner(System.in);

        System.out.print("Enter Radius :");
        r = s.nextDouble();

        area =pi*r*r;
        System.out.print("Radius Of Circle :"+area);
    }
}

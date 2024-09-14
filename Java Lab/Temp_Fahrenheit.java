import java.util.Scanner;

public class Temp_Fahrenheit {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Temperature :");
        double Fahrenheit = s.nextDouble();

        System.out.println("Temperature in celsius :" + (Fahrenheit - 32) * (5 / 9) + "OC");
    }

}

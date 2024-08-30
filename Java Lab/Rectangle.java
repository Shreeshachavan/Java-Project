import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        
        double Width =0;
        double area ;  
        double Height = 0;
          

        

        Scanner s = new Scanner(System.in);

        System.out.print("Enter width of Rectangle :");
         double width= s.nextDouble();

        System.out.print("Enter Height of Rectangle :");
        double height = s.nextDouble();

         area = width*height;

        System.out.println("The area of the Rectangle is : " +  area);

    }
    
}

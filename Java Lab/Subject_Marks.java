import java.util.Scanner;

public class Subject_Marks {
    public static void main(String[] args) {
        
        double marks=0;
        double sum ;
        double percent;
        //calculatepercentage(marks1,marks2,marks3);
    

        Scanner s= new Scanner(System.in);
        
        System.out.print("Marks in Subject :");
        double Marks1 = s.nextDouble();

        System.out.print("Marks in Subject :");
        double Marks2 = s.nextDouble();

        System.out.print("Marks in Subject :");
        double Marks3 = s. nextDouble();

        sum = Marks1 + Marks2 + Marks3;
        percent = (sum / 3) *100;

        System.out.println("Total Marks : "+sum);
        System.out.print("Percentage : "+percent+"%");





    }
}



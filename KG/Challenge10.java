import java.sql.SQLOutput;
import java.util.Scanner;

public class Challenge10 {
    public static void main(String[] args) {
        System.out.println("Perimeter of Rectangle");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first side of the rectangle :");
        int A = sc.nextInt();
        System.out.println("Enter the second side of the rectangle:");
        int B = sc.nextInt();
        System.out.println("Enter the third side of the rectangle :");
        int C = sc.nextInt();
        System.out.println("Enter the fourth side of the rectangle :");
        int D = sc.nextInt();
        int Perimeter = A+B+C+D ;
        System.out.println("This is your perimeter of the rectangle :" + Perimeter);

    }
}

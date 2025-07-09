import java.util.Scanner;

public class Challenge11 {
    public static void main(String[] args) {
        System.out.println("Area of Triangle");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter side of triangle in cms:");
        System.out.println("Enter the Base of the triangle:");
        Double B = sc.nextDouble();
        System.out.println("Enter the Height of triangle :");
        Double H = sc.nextDouble();
        Double Area = (B*H)/2;
        System.out.println("This is your area of the triangle  :"+ Area);
    }
}

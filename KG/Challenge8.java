import java.util.Scanner;

public class Challenge8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("WELCOME TO YOUR CALCULATOR");
        System.out.print("Enter your first number :");
        Double a = sc.nextDouble();
        System.out.print("Enter your second number :");
        Double b = sc.nextDouble();
        System.out.println("This is your sum of two number : "+ (a+b));
        System.out.println("This is your subtraction of two number"+ (a-b));
        System.out.println("This is your multiple of two number :"+ a*b);
        System.out.println("THis is your divide of these number :" + a/b);
        System.out.println(" This is your reminder of these numbers :"+ a%b);

    }
}

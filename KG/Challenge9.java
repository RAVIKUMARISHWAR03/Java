import java.util.Scanner;

public class Challenge9 {
    public static void main(String[] args) {
        System.out.println("Welcome to product of two number :");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your first number :");
        Double A = sc.nextDouble();
        System.out.println("Now  please enter your second number :");
        Double B = sc.nextDouble();
       double Product =A*B;
        System.out.println("This is your product of two number :"+ Product);

    }
}

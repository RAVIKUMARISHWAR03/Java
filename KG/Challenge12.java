import java.util.Scanner;

public class Challenge12 {
    public static void main(String[] args) {
        System.out.println("CALCULATE THE SIMPLE INTEREST ");
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE PRINCIPLE AMOUNT:");
        float P = sc.nextFloat();
        System.out.println(" ENTER THE TIME (IN YEARS) :");
        float T = sc.nextFloat();
        System.out.println(" ENTER THE RATE :");
        float R = sc.nextFloat();
        float simpleInterest = (P*R*T)/100 ;
        System.out.println("THIS IS YOUR SIMPLE INTEREST :"+ simpleInterest);
    }
}

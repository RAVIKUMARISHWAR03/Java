import java.util.Scanner;

public class Challenge13 {
    public static void main(String[] args) {
        System.out.println("CALCULATE THE COMPOUND INTEREST :");
        Scanner sc =new Scanner(System.in);
        System.out.println("ENTER THE PRINCIPLE AMOUNT :");
        float P = sc.nextFloat();
        System.out.println("ENTER THE TIME PERIOD (IN YEARS) :");
        float T = sc.nextFloat();
        System.out.println("ENTER THE RATE :");
        float R = sc.nextFloat();
        float compoundInterest = P*(1+R/100)*T;
        System.out.println("THIS IS YOUR COMPOUND INTEREST :" + compoundInterest);


    }
}

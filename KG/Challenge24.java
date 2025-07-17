import java.util.Scanner;

public class Challenge24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Showcasing the Bitwise NOT/complement operator ");
        System.out.println(" Enter the first number :");
        int first = sc.nextInt();

        int result = ~first;
        System.out.println("Result is " + result);

    }
}

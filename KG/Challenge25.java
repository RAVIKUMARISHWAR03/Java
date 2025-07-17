import java.util.Scanner;

public class Challenge25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Showcasing the Bitwise left shift operator ");
        System.out.println(" Enter the  number :");
        int num = sc.nextInt();

        int result = num << 4;
        System.out.println("Result is " + result);

    }
}
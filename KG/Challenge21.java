import java.util.Scanner;

public class Challenge21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Showcasing Bitwise And operator ");
        System.out.println(" Enter the First number: ");
        int First = sc.nextInt();
        System.out.println(" Enter the Second number :");
        int Second = sc.nextInt();
        int result = First&Second;
        System.out.println("Result is " + result);
    }
}

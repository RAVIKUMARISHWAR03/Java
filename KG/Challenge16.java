import java.util.Scanner;

public class Challenge16 {
    public static void main(String[] args) {
        System.out.println("Number checker :");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your number ");
        float number = sc.nextFloat();
        if (number%2==0){
            System.out.println("GIVEN NUMBER IS EVEN");
        } else {
            System.out.println("GIVEN NUMBER IS ODD ");

        }
    }
}

import java.util.Scanner;

public class Challenge27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to even odd calculator with the help of bitwise operator");
        System.out.println("Enter the number ");
        int Num = sc.nextInt();
        if ((Num & 1)== 1){
            System.out.println("Then your number is Odd");
        }else {
            System.out.println("Then your number is Even");
        }

    }
}

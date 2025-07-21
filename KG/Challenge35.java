import java.util.Scanner;

public class Challenge35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Welcome to the reverse of digits ");
        System.out.println(" Enter your number brother ");
        int num = sc.nextInt();
        int Reverse = reverse(num);
        System.out.println(" this your reverse of your number " + Reverse);

    }
    public static int reverse(int n){
         int newNum = 0;
         while( n> 0){
             int digits = n % 10;
             newNum = newNum * 10 + digits;
             n /= 10;
         }
        return newNum;
    }
}
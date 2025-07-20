import java.util.Scanner;

public class Challenge34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Welcome to Prime number ");
        System.out.println(" Enter your number ");
        int Number = sc.nextInt();
        boolean Result = primeNumber(Number);
        if (Result){
            System.out.println(" YOUR NUMBER IS PRIME ");
        }
        else {
            System.out.println(" YOUR NUMBER IS NOT A PRIME NUMBER ");
        }
    }
    public static boolean primeNumber(int num){
        int i = 2;
         while (i<num){
             if( num%i ==0){
                 return false;
             }
             i++;
         }
         return true;
    }
}

import java.util.Scanner;

public class Challenge38 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println(" Welcome to the palindrome number program ");
        System.out.println(" Please enter your number ");
        int num = sc.nextInt();
        boolean IsPalindrome = isPalindrome(num);
        if (IsPalindrome){
            System.out.println("Your given number is palindrome ");
        }else{
            System.out.println(" Your given number is not a palindrome ");
        }

    }
    public static boolean isPalindrome(int num ){
        return num == reverse(num);
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

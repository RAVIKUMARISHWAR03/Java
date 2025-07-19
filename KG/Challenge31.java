import java.util.Scanner;

public class Challenge31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello friend here is sum of digits program");
        System.out.println("Please enter the number ");
        int num = sc.nextInt();
        int Sum =SumOfDigits(num);
        System.out.println("THis is your sum of digits "+ Sum);
    }
    public static int SumOfDigits(int num){
        int sum= 0;
        int REM =0;
        while (num>0){
            REM=num%10;
            sum+=REM;
            num /=10;
        }
        return sum;
    }
}

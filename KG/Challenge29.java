import java.util.Scanner;

public class Challenge29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("welcome to oddSum");
        System.out.println("Please enter the number");
        int num = sc.nextInt();
        int sum = oddSum(num);
        System.out.println("oddSum of "+num+" is "+sum);
    }
    public static int oddSum(int num){
        int sum =0;
        int i=1;
        while( i <= num){
        sum+=i;
        i+=2;
        }
        return sum;
    }
}

import java.util.Scanner;

public class Challenge33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Welcome to the GCD program ");
        System.out.println(" Please enter your first number ");
        int first = sc.nextInt();
        System.out.println(" Please enter your second number ");
        int second = sc.nextInt();
        int gcd = GCD(first,second);
        System.out.println(" This your GCD of two number "+gcd);
    }
    public static int GCD(int num1,int num2){
        int gcd =1;
        int i=2;
        int least = least(num1,num2);
        while (i<=least){
            if( num1 % i==0 && num2 % i ==0){
                gcd=i;
            }
            i++;
        }
        return gcd;
    }
    public static int least(int num1 ,int num2){
        if (num1<num2){
            return num1;
        }
        else{
            return num2;
        }
    }
}

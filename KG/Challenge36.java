import java.util.Scanner;

public class Challenge36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Welcome to the fibonacci series ");
        System.out.println(" Please enter the number up to you want print fibonacci series ");
        int num = sc.nextInt();
        System.out.println(" This your fibonacci series ");
        FibonacciSeries(num);
    }
    public static void FibonacciSeries(int num){
        int first = 0;
        int second = 1;
        if(num<0)return;
        System.out.print("0 ");
        if (num==0) return;
        System.out.print("1 ");
        while(first + second <= num){
            int third = first + second ;
            System.out.print(third+" ");
            first = second;
            second = third;

        }

    }
}
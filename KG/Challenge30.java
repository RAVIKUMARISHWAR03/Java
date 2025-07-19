import java.util.Scanner;

public class Challenge30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the factorial program");
        System.out.println("Please enter your number please");
        int Num = sc.nextInt();
        double Fact = factorial(Num);
        System.out.println("This is Your Factorial " +Fact);
    }
    public static double factorial(int Num){

            double Fact =1;
            int i= 1;
            while (i<=Num){
                Fact *=i;
           i++;
            }
            if(Num==0){
                return 1;
            } else if (Num<0) {
                System.out.println("Factorial is undefined");

            }

        return Fact;
    }
}

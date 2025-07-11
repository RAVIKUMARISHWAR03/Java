import java.util.Scanner;

public class Challenge18 {
    public static void main(String[] args) {
        System.out.println(" Welcome to leap year calculator :");
        Scanner sc = new Scanner(System.in);
        int Year = sc.nextInt();
        if ( Year%400 ==0){
            System.out.println(Year+ " This year is the leap year ");
        } else if ( Year%100==0) {
            System.out.println(Year+ " This year is not leap year ");

        } else if ( Year%4==0 ) {
            System.out.println(Year+ " This year is a leap year ");

        }else{
            System.out.println(Year+" This is not a leap year ");
        }


    }
}

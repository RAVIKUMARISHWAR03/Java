
import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class Challenge19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Welcome to Grade Maker :");
        System.out.println(" Enter the number of students :");
        int Number = sc.nextInt();
        if ( Number >= 90){
            System.out.println( Number + "% This are grade A Student");
        } else if ( Number >= 75) {
            System.out.println(Number + "% This are grade B Student ");
            
        } else if (Number >= 60) {
            System.out.println(Number+"% This are the grade C Student ");

        } else if ( Number >= 30) {
            System.out.println(Number+ "% This are the grade D student ");

        }else {
            System.out.println(Number+"% This are the grade E student ");
        }
    }
}

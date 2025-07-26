package ALL;

import java.util.Scanner;

public class sumOfEvenOdd {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int number ;
        int ODD = 0;
        int EVEN = 0;
        int choice ;
        do{
            System.out.println("ENTER YOUR NUMBER");
            number = sc.nextInt();
            if (number%2==0) {
                EVEN += number ;
            }else{
                ODD += number;
            }
            System.out.println("DO YOU WANT TO CONTINUE IT THEN PRESS 1 / THEN YOU DON'T WANT TO CONTINUE THEN PRESS 0 ");
           choice  = sc.nextInt();
        }while(choice==1);
        System.out.println("THIS IS SUM OF EVEN " + EVEN);
        System.out.println("THIS IS THE SUM OF THE ODD NUMBER "+ ODD);

    }

}
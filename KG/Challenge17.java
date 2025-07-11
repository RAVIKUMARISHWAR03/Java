import java.util.Scanner;

public class Challenge17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the the First number :");
        int First = sc.nextInt();
        System.out.println("Enter the Second number :");
        int Second = sc.nextInt();
        System.out.println(" Enter the Third number :");
        int Third = sc.nextInt();
        if ( First >= Second && First >= Third){
            System.out.println("First number Greater then others two  ");
        } else if ( Second >= Third) {
            System.out.println("Second number is Greater then others two ");

        }else {
            System.out.println(" Third number is greater then others two");
        }
    }
}

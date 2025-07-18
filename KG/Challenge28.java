import java.util.Scanner;

import static javax.swing.text.html.HTML.Attribute.N;

public class Challenge28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to multiplication world");
        System.out.println("Enter your number please then i generate the table of this number ");
        int N = sc.nextInt();
        printMultiplication(N);

    }
    public static void printMultiplication(int N){
           int i=1;
           while ( i<=10){
               System.out.println(N +" X "+i+" = "+(N * i));
               i++;
        }
    }
}

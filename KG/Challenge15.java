import java.util.Scanner;

public class Challenge15 {
    public static void main(String[] args) {
        System.out.println("THERE IS EVEN ,ODD OR ZERO PROGRAM :");
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER YOUR NUMBER :");
        int number = sc.nextInt();
        if (number>0){
            System.out.println("POSITIVE INTEGER ");
        } else if (number==0) {
            System.out.println("ZERO");

        }
        else {
            System.out.println("NEGATIVE INTEGER ");
        }

    }
}

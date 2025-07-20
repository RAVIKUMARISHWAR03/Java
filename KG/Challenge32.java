import java.util.Scanner;

public class Challenge32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Welcome to the LCM program ");
        System.out.println("Please enter your first number ");
        int first = sc.nextInt();
        System.out.println(" Please enter your second number ");
        int second = sc.nextInt();
        int lcm = LCM(first,second);
        System.out.println("This is your LCM "+ lcm);

    }
    public static int LCM (int first ,int second){
        int i=1;
        while(i<=second){
            int factor = first * i;
            if(factor%second==0){
                return factor;

            }
         i++;
        }
        return 0;
    }
}

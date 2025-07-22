import java.util.Scanner;
public class Challenge37 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println(" Welcome to Armstrong Program  ");
        System.out.println(" Enter your number ");
        int num = sc.nextInt();
        boolean isArmStrong =IsArmStrong(num) ;
        if(isArmStrong){
            System.out.println(" YOUR NUMBER IS ARMSTRONG NUMBER ");
        }else {
            System.out.println(" YOUR NUMBER IS NOT A ARMSTRONG NUMBER ");
        }
    }
    public static boolean IsArmStrong(int num ){
        int NoOfDigits = NoOfDigits(num);
        int finalResult = 0;
        int numCopy = num;
        while(num>0){
        int lastDigit = num % 10;
        num /= 10;
        finalResult += pow(lastDigit,NoOfDigits);
        }
        return finalResult == numCopy;
    }
    public static int pow(int num1,int num2){
        int result = 1;
        int i = 0;
        while (i<num2){
            result *= num1;
            i++;
        }
        return result;
    }
    public static int NoOfDigits(int num){
        int noOfDigits = 0;
        while (num>0){
            noOfDigits++;
            num /=10;

        }
        return noOfDigits;
    }
}
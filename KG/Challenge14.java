import java.util.Scanner;

public class Challenge14 {
    public static void main(String[] args) {
        System.out.println("FAHRENHEIT TO CELSIUS CONVERTER :");
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE TEMPERATURE IN FAHRENHEIT :");
        float F = sc.nextFloat();
        float C = (F-32)*5/9;
        System.out.println("TEMPERATURE IN CELSIUS :" + C);

    }
}

import java.util.Scanner;
public class Chapter4Q3 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int Day = sc.nextInt();
    switch(Day){
        case 1:
            System.out.println("Monday");
            break;
        case 2:
             System.out.println("Tuesday");
             break;
        case 3: 
         System.out.println("Wednesday");
         break;
        case 4:
             System.out.println("Thrusday");
             break;
        case 5:
            System.out.println("Friday");
            break;
        case 6:
             System.out.println("Sataurday");
             break;
        case 7:
             System.out.println("Sunday")
        default:
             System.out.println(" THIS IS NOT ON THE LIST");
        }
    }
}

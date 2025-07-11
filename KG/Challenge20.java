import java.util.Scanner;

public class Challenge20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" ");
        System.out.println(" Enter the age of the Human :");
        int Age = sc.nextInt();
        if( Age < 13 ){
            System.out.println(Age + " This human is Child ");
        } else if (Age  < 20) {
            System.out.println(Age +" This human is the Teen  ");

        } else if ( Age < 60 ) {
            System.out.println(Age +" This human is the Adult ");

        }else{
            System.out.println(Age + " This human is the Senior");
        }
    }
}

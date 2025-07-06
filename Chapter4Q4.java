import java.util.Scanner;

public class Chapter4Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your income in lakhs per year");
        float income = sc.nextFloat();
        float tak = 0;
        
        if(income<=2.5f){
            tak = tak + 0;
        }
        else if(income>2.5f && income<=5.0f){
            tak = tak + 0.05f*(income-2.5f);
        }
        else if(income>5.0f && income<=10f){
            tak = tak + 0.05f *(income-2.5f);
            tak = tak + 0.20f *(5.0f-2.5f);

        }
        else if(income>10.0f){
            tak = tak + 0.05f *(5.0f-2.5f);
            tak = tak + 0.20f *(10.0f-5.0f);
            tak = tak + 0.30f *(income-10.0f);

        }
        System.out.println(" The total tak paid by the Employe  " + tak);
        
        

        
    }
    
}

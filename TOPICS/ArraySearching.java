package ARRAY;

import java.util.Scanner;

public class ArraySearching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] Myarr ={1,3,7,8,10,17,18,33,45,63,93};
        System.out.println("WELCOME TO ARRAY SEARCHING ");
        System.out.println("PLEASE ENTER THE NUMBER WHICH NUMBER YOU WANT TO SEARCH ");
        int num = sc.nextInt();
        boolean IsFound = IsFound(Myarr,num);
        if(IsFound){
            System.out.println("YOUR NUMBER IS FOUND IN THE ARRAY");
        }else {
            System.out.println("YOUR NUMBER IS NOT FOUND IN THE ARRAY");
        }
    }
    public static boolean IsFound(int[] Myarr,int num){
       int index = 0;
       while (index < Myarr.length){
           if (Myarr[index]==num){
            return true;
           }
           index++;
       }
       return false;
    }
}

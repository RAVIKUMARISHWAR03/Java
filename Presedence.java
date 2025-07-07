public class Presedence {
    public static void main(String[] args) {
        int a = 4/2-6*4;
        /* Presedence & Assocaitivty
               = 2-6*4
                = 2-24
                 =-22

        */
        int b = 4*2-6/3;
        /*
              = 8-6/3;
              = 8-2
              =6
         */
        System.out.println(a);
        System.out.println(b);

    }
    
}

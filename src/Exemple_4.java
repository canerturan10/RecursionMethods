public class Exemple_4 {
    public static int pow(int a , int b ){
        if (b == 0){ // base case
            return 1 ;
        }
        return a *  pow(a ,b-1);

    }

    public static void main(String [] args ){
        // üs almak
       int x = pow(2,3);
        System.out.println(x);
        // System.out.println(pow(2,3));
    }
}

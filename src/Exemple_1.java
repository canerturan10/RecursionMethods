public class Exemple_1 {
   public static int factorial(int a){
       if (a ==0 || a == 1 ){
           return 1 ;
       }
       return  a * factorial(a - 1);
   }

    public static void main(String[] args ){
        System.out.println(factorial(5));
    }
}

public class Exemple_2 {
    public static int sum (int a){
        if (a == 0 ){   //base case
            return 0 ;
        }
        // recursive case
        return a + sum(a - 1) ;
    }

    public static void main(String [] args){
      int toplam = sum(4);
        System.out.println(toplam);

        //  System.out.println(sum(4));
    }
}

public class Exemple_5 {

    public static int evenNumberSum(int a){
        if (a == 0){
            return a ;
        }
        //recursive case
        if (a % 2 == 0){
            return a + evenNumberSum(a-1); // n'i toplama daihl et ve ilgili fonk döndür
        }
        else {
            return evenNumberSum(a-1);  // ilggili fonk döndür
        }

    }

    public static void main(String [] args ){
        //birden n'e kadar olan çift sayıların toplamı   (sınavlık düzey)
        int x = evenNumberSum(6);
        System.out.println(x);
    }
}

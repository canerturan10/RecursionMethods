public class Exemple_6 {
    public static int fibo(int n){

        if (n == 0 || n == 1){  //base case
            return n ;
        }
        return fibo(n-1) + fibo(n-2);  // recursive case
    }

    public static void main(String [] args){
        //fibonnachi     // bütün elemanları ekrana yazdır
        int x = fibo(7);
        System.out.println(x);
        //System.out.println(fibo(7));
        for (int i = 0 ; i<=7 ; i++){
            int f1= fibo(i);
            System.out.print(f1 + " ");
        }
    }

}

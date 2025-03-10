public class Exemple_8 {

    public static int multipleOfThree(int n ){
        if (n == 1 ){
            return 3 ;
        }
        return 5 * multipleOfThree(n-1);
    }

    public static void main(String[] args) {
       // System.out.println(multipleOfThree(3));

        for (int i = 1 ; i <= 3 ; i++){

            System.out.print(multipleOfThree(i) + " ");
        }
    }
}

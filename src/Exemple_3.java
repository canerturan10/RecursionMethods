public class Exemple_3 {
    public static int sirala(int n ){
        System.out.println(n + " ");
        if (n == 1 ){
            return n ;
        }
        return sirala(n-1);
    }
    public static void sirala2(int a ){
        System.out.println(a + " ");
        if (a == 1 ){
            return ;  // not : void fonksiyonda notmal şartlarda return kullanılmaz.
            // Bu şekilde kullanım programi durdurmak içindir
        }
        sirala2(a-1);


    }


    public static void main(String[] args){
        // birden n'e kadar sayıları yazdır
        System.out.println(sirala(4));
        System.out.println("***********");
        sirala2(3);
    }
}

public class Exemple_7 {

    public static int array_min(int []arr, int index) {
        if (index == arr.length-1){  // base case
            return arr[index];
        }
        int minRest = array_min(arr,index + 1);  // recursive case

        if (arr[index] < minRest){
            return arr[index];
        }else {
            return minRest ;
        }

   }



    public static void main(String [] args){
        int [] array3 = {2,5,6,7,8,1};
        System.out.println(array_min(array3,2));


    }
}

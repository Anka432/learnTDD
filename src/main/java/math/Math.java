package math;


public class Math {

   public static int findMax(int []numbers){
       int max = Integer.MIN_VALUE;
       for (int each:numbers
            ) {
           if(each>max){
               max=each;
           }
       }

       return max;
   }

   public static int calculateSum(int []numbers){

       int sum = 0;
       for (int each:numbers
            ) {
           sum+=each;
       }
       return sum;
   }

   public static float calculateAverage(int []numbers){

       float average=0;
       int sum=0;
       for (int each:numbers
            ) {
           sum+=each;
       }
       average =sum/numbers.length;

       return average;
   }

   public static int calculateSilnia(int number){
       int silnia=1;
       for (int i=2; i<=number; i++){
           silnia=silnia*i;
       }

       return silnia;
   }

   public static int multiply(int[]numbers){
       int resoult = 1;
       for (int each:numbers){
           resoult*=each;
       }
       return resoult;
   }

   public static int findMin(int []numbers){
       int min=Integer.MAX_VALUE;
       for (int each:numbers){
           if(each<min){
               min=each;
           }
       }
       return min;
   }

}


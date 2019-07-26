package math;


public class Math {


    public static int findMax(int []numbers){
        int max=Integer.MIN_VALUE;
        for (int each:numbers
             ) {
            if (max<each){
                max=each;
            }
        }

        return max;
    }


    public static int calculateSum(int []values){
        int sum=0;
        for (int item:values) {
            sum += item;
        }
        return sum;
    }

    public static float calculateAverage(int []values){
        float average = 0;
        int sum = 0;

        for (int each: values){
            sum+=each;
        }
        average=sum/values.length;

        return average;
    }

    public static int calculateSilnia(int value){

        int silnia = 1;
        for (int i=1;i<=value;i++){
            silnia*=i;
        }

        return silnia;
    }

    public static int multiply(int []value){
        int result=1;
        for (int each:value
             ) {
            result*=each;
        }
        return result;
    }

    public static int findMin(int []values){

        int min = Integer.MAX_VALUE;
        for (int each:values)
        if(each<min){
            min=each;
        }
        return min;
    }

}


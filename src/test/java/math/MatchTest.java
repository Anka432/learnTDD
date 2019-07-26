package math;

import org.junit.Assert;
import org.junit.Test;

public class MatchTest {

    @Test
    public void findMaxTest(){
        //is
        int[]numbers={2,5,19,76,102,1,15,84};

        //then
        int max = Math.findMax(numbers);

        //expected
        Assert.assertEquals(max,102);
    }

    @Test
    public void calculateSumTest(){

        //is
        int []numbers= {1,2,3};

        //then
        int sum = Math.calculateSum(numbers);

        //expected
        Assert.assertEquals(sum,6);
    }

    @Test
    public void calculateAverageTest(){
        //is
        int[]numbers={1,2,3};

        //then
        float average = Math.calculateAverage(numbers);

        //expected
        Assert.assertEquals(average,2,0.1);
    }

    @Test
    public void calculateSilnia(){
        //is
        int number=5;

        //then
        int silnia = Math.calculateSilnia(number);

        //expected
        Assert.assertEquals(silnia,120);
    }

    @Test
    public void multiply(){
        //is
        int []numbers={3,6,2};

        //then
        int multiply = Math.multiply(numbers);

        //expected
        Assert.assertEquals(multiply,36);
    }

    @Test
    public  void findMin(){
        //is
        int []numbers={-7,8,147,-12,46,99};

        //then
        int min = Math.fintMin(numbers);

        //expected
        Assert.assertEquals(min,-12);
    }
}

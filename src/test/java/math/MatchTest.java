package math;

import org.junit.Assert;
import org.junit.Test;

public class MatchTest {

    @Test
    public void testFindMax(){
        //is
        int []numbers={4,8,6,44,62,-17,43,0,8};

        //then
        int max = Math.findMax(numbers);

        //expected
        Assert.assertEquals(max,62);
    }

    @Test
    public void testCalculateSun(){

        //is
        int []numbers = {4,3,7};

        //then
        int sum = Math.calculateSum(numbers);

        //expected
        Assert.assertEquals(sum,14);
    }

    @Test
    public void testCalculateAverage(){

        //is
        int []values = {1,3,5};

        //then
        float average = Math.calculateAverage(values);

        //expected
        Assert.assertEquals(average,3,0.01);
    }
    @Test
    public void testCalculateSilnia(){
        //is
        int value = 5;

        //then
        int silnia = Math.calculateSilnia(value);

        //expected
        Assert.assertEquals(silnia,120);
    }

    @Test
    public void testMultiply(){
        //is
        int[]values={2,3,4};

        //then
        int multiply = Math.multiply(values);

        //expected
        Assert.assertEquals(multiply,24);
    }

    @Test
    public void testfindMin() {
        //is
        int[] numbers = {5, 9, -16, 12, 8,  55};

        //then
        int min = Math.findMin(numbers);

        //expected
        Assert.assertEquals(min, -16);
    }
}

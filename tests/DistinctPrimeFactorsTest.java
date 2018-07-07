import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class DistinctPrimeFactorsTest {

    @Test
    public void IsNumber3Prime() {
        boolean isPrime = DistinctPrimeFactors.isThisNumberPrime(3);
        Assert.assertEquals(true, isPrime);
    }

    @Test
    public void IsNumber4Prime() {
        boolean isPrime = DistinctPrimeFactors.isThisNumberPrime(4);
        Assert.assertEquals(false, isPrime);
    }

    @Test
    public void NextPrimeAfter3() {
        int nextPrime = DistinctPrimeFactors.NextPrimeAfterThisNumber(3);
        Assert.assertEquals(5, nextPrime);
    }

    @Test
    public void NextPrimeAfter5() {
        int nextPrime = DistinctPrimeFactors.NextPrimeAfterThisNumber(5);
        Assert.assertEquals(7, nextPrime);
    }

    @Test
    public void PrimeFactorsof2() {
        ArrayList<Integer> primeFactors = DistinctPrimeFactors.PrimeFactorsOfANumber(2);
        ArrayList<Integer> expectedResult = new ArrayList<>();
        expectedResult.add(2);
        Assert.assertEquals(expectedResult, primeFactors);
    }

    @Test
    public void PrimeFactorsof14() {
        ArrayList<Integer> primeFactors = DistinctPrimeFactors.PrimeFactorsOfANumber(14);
        ArrayList<Integer> expectedResult = new ArrayList<>();
        expectedResult.add(2);
        expectedResult.add(7);
        Assert.assertEquals(expectedResult, primeFactors);
    }

    @Test
    public void PrimeFactorsof664() {
        ArrayList<Integer> primeFactors = DistinctPrimeFactors.PrimeFactorsOfANumber(644);
        ArrayList<Integer> expectedResult = new ArrayList<>();
        expectedResult.add(2);
        expectedResult.add(7);
        expectedResult.add(23);
        Assert.assertEquals(expectedResult, primeFactors);
    }

    @Test
    public void Is6TheFirstNumberToHaveTwoDifferentPrimeFactorsAfter2() {
        int numberWithTwoDifferentPrimeFactors = DistinctPrimeFactors.FirstNumberToHaveNDistinctPrimeFactorsAfter(2, 2);
        Assert.assertEquals(6, numberWithTwoDifferentPrimeFactors);
    }

    @Test
    public void FirstNumberOf2ConsecutiveNumbersToHave2DistinctPrimeFactors() {
        int firstNumber = DistinctPrimeFactors.FindFirstNConsecutiveNumbersToHaveNDistinctPrimeFactors(2, 2);
        Assert.assertEquals(14, firstNumber);
    }

    @Test
    public void FirstNumberOf3ConsecutiveNumbersToHave3DistinctPrimeFactors() {
        int firstNumber = DistinctPrimeFactors.FindFirstNConsecutiveNumbersToHaveNDistinctPrimeFactors(3, 3);
        Assert.assertEquals(644, firstNumber);
    }

}
import java.util.ArrayList;

public class DistinctPrimeFactors {

    public static int FindFirstNConsecutiveNumbersToHaveNDistinctPrimeFactors(int consecutiveNumbers, int primeFactors) {
        int firstNumber = FirstNumberToHaveNDistinctPrimeFactorsAfter(2, primeFactors);
        int consecutiveAccumulator = 1;

        // Consecutive numbers reached?
        while (consecutiveAccumulator < consecutiveNumbers) {
            // Number has n distinct prime factors?
            if (FirstNumberToHaveNDistinctPrimeFactorsAfter(firstNumber + 1, primeFactors) == firstNumber + 1) {
                consecutiveAccumulator += 1;
                firstNumber += 1;
            } else {
                // No, then we start all again
                consecutiveAccumulator = 1;
                firstNumber = FirstNumberToHaveNDistinctPrimeFactorsAfter(firstNumber + 1, primeFactors);
            }
        }
        return firstNumber - consecutiveAccumulator + 1;
    }

    public static int FirstNumberToHaveNDistinctPrimeFactorsAfter(int newAccumulator, int primeFactors) {
        int accumulator = newAccumulator;
        while (true) {
            if (PrimeFactorsOfANumber(accumulator).size() == primeFactors) {
                return accumulator;
            } else
                accumulator += 1;
        }
    }

    public static boolean isThisNumberPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }

    public static int NextPrimeAfterThisNumber(int number) {
        int nextPrime = number + 1;
        while (true) {
            if (isThisNumberPrime(nextPrime))
                return nextPrime;
            else
                nextPrime += 1;
        }
    }

    public static ArrayList<Integer> PrimeFactorsOfANumber(int number) {
        ArrayList<Integer> primeFactors = new ArrayList<>();
        int prime = 2;
        int factoredNumber = number;
        while (prime <= number) {
            if (factoredNumber % prime == 0) {
                if (!primeFactors.contains(prime))
                    primeFactors.add(prime);
                factoredNumber = factoredNumber / prime;
            } else
                prime = NextPrimeAfterThisNumber(prime);
        }
        return primeFactors;
    }
}

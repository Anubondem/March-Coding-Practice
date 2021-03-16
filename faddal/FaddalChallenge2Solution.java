package faddal;

/**
 * Alice has n candies, where the ith candy is of type candyType[i]. Alice
 * noticed that she started to gain weight, so she visited a doctor.
 * 
 * The doctor advised Alice to only eat n / 2 of the candies she has (n is
 * always even). Alice likes her candies very much, and she wants to eat the
 * maximum number of different types of candies while still following the
 * doctor's advice.
 * 
 * Given the integer array candyType of length n, return the maximum number of
 * different types of candies she can eat if she only eats n / 2 of them.
 */

import java.util.HashSet;

class FaddalChallenge2Solution {

    public int distributeCandies(int[] candyType) {
        HashSet<Integer> uniqueCandies = new HashSet<Integer>();
        int numCandyTypeCanEat = candyType.length / 2;

        for (int candy : candyType)
            uniqueCandies.add(candy);
        int numUniqueCandies = uniqueCandies.size();

        if (numUniqueCandies > numCandyTypeCanEat)
            return numCandyTypeCanEat;
        else
            return numUniqueCandies;

    }

    public static void main(String[] args) {
        FaddalChallenge2Solution sol = new FaddalChallenge2Solution();

        int[] candyType = { 1, 1, 2, 3 };

        System.out.println(sol.distributeCandies(candyType));
    }
}

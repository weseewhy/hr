/*
https://www.hackerrank.com/challenges/mini-max-sum/problem

Given five positive integers, find the minimum and maximum values that can 
be calculated by summing exactly four of the five integers. 
Then print the respective minimum and maximum values as a single line of two space-separated long integers.
*/

public class Solution {
    void miniMaxSum(int[] arr) {
        long sum = 0;
        long min = Integer.MIN_VALUE;
        long max = 1;

        for (int i : arr) {
            sum += i;
            if (i < min)
                min = i;
            if (i > max)
                max = i;
        }

        long minSum = sum - max;
        long maxSum = sum - min;

        System.out.println(minSum + " " + maxSum);
    }
}

/*
https://www.hackerrank.com/challenges/compare-the-triplets/problem

Write a function that compares two triplets
*/

import java.util.ArrayList;
import java.util.List;

class Solution {
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> out = new ArrayList<>(2);
        out.add(0);
        out.add(0);

        for (int i = 0; i < 3; i++) {
            if (a.get(i) > b.get(i)) {
                out.set(0, out.get(0) + 1);
            } else if (b.get(i) > a.get(i)) {
                out.set(1, out.get(1) + 1);
            }
        }

        return out;
    }
}

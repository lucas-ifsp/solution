package com.br;

import java.util.Arrays;

public class Solution {

    public int solution(int[] a, int[] b){
        if(a.length != b.length) return 0;
        if(a.length == 1) return 0;

        final int sumA = Arrays.stream(a).sum();
        final int sumB = Arrays.stream(b).sum();

        int result = 0;
        int leftA = 0; int leftB = 0;
        int rightA = sumA; int rightB = sumB;

        for (int i = 0; i < a.length - 1; i++) {
            leftA += a[i]; leftB += b[i];
            rightA -= a[i]; rightB -= b[i];
            if(isFair(leftA, rightA, leftB, rightB)) result++;
        }
        return result;
    }

    private boolean isFair(int leftA, int rightA, int leftB, int rightB) {
        return leftA == rightA && leftB == rightB && leftA == leftB;
    }
}

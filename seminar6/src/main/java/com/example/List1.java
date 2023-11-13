package com.example;

public class List1 {
    public double FindList(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        return sum / arr.length;
    }
}

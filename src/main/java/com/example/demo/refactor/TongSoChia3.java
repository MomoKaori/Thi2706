package com.example.demo.refactor;

public class TongSoChia3 {
        public static int tongChia3(int n) {
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                if (i % 3 == 0) {
                    sum += i;
                }
            }
            return sum;
    }

}

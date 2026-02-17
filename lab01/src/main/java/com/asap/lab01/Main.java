package com.asap.lab01;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");

        { // 1
            int a1 = 1, a2 = 2, a3 = 3, a4 = 4, a5 = 5, a6 = 6, a7 = 7, a8 = 8, a9 = 9, a0 = 10;
            int[] as = {a1, a2, a3, a4, a5, a6, a7, a8, a9, a0};
            int sum = as[0], sub = as[0], prod = as[0];
            double div = as[0];
            for (int i = 1; i < as.length; i++) {
                sum += as[i];
                sub -= as[i];
                prod *= as[i];
                div /= (double) (as[i]);
            }
            System.out.printf("1) Sum: %d; Sub: %d; Mul: %d; Div: %e\n", sum, sub, prod, div);
        }
        { // 2
            String s1 = "We", s2 = "study", s3 = "variables", s4 = "for", s5 = "the", s6 = "fourth", s7 = "time";
            String[] ss = {s1, s2, s3, s4, s5, s6, s7};
            int cap = 0;
            for (String s : ss) {
                cap += s.length() + 1;
            }
            if (cap != 0) {
                cap -= 1;
            }
            var sb = new StringBuilder(cap);
            for (String s : ss) {
                sb.append(s).append(' ');
            }
            sb.setLength(Math.max(sb.length(), 1) - 1);
            System.out.printf("2) %s", sb.toString());
        }
    }
}

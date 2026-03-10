package com.asap.lab01;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

import com.asap.lab01.task3.Task3;

public class Main {

    public static void main(String[] args) {
        System.out.println("\nHello world!\n");

        { // 1
            var random = new Random();
            var valArr = IntStream.generate(() -> random.nextInt(100)).limit(10).toArray();
            System.out.println("1)\nValues: ");
            var sb = new StringBuilder();
            Arrays.stream(valArr).forEach(x -> {
                sb.append(x);
                sb.append(", ");
            });

            if (valArr.length > 0) {
                sb.setLength(sb.length() - 2);
            }
            System.out.printf("\t%s\n", sb);

            int sum = Arrays.stream(valArr).reduce((acc, r) -> acc + r).getAsInt();
            int sub = Arrays.stream(valArr).reduce((acc, r) -> acc - r).getAsInt();
            int prod = Arrays.stream(valArr).reduce((acc, r) -> acc * r).getAsInt();
            double div = Arrays.stream(valArr).mapToDouble(x -> x).reduce((acc, r) -> acc / r).getAsDouble();

            System.out.printf("\tSum: %d; Sub: %d; Mul: %d; Div: %e\n", sum, sub, prod, div);
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
            sb.setLength(Math.max(sb.length() - 1, 0));
            System.out.printf("2) %s\n", sb.toString());
        }

        { // 3
            var task3 = new Task3();
            task3.run();
        }
    }
}

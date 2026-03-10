package com.asap.utils;

import java.util.Objects;
import java.util.stream.Collector;
import java.util.stream.Stream;

public class Utils {

    public static <T> String toCommaSeparated(Stream<T> objs) {
        return objs.collect(
                Collector.of(
                        StringBuilder::new,
                        (sb, s) -> sb.append(Objects.toString(s)).append(", "),
                        (sb1, sb2) -> {
                            if (sb1.length() > 0 && sb2.length() > 0) {
                                sb1.append(", ");
                            }
                            return sb1.append(sb2);
                        }
                )).toString();
    }
}

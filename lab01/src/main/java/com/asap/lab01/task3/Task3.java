package com.asap.lab01.task3;

import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

import com.asap.utils.Utils;

public final class Task3 {

    private final List<User> users;

    public Task3() {
        var random = new Random();
        var names = List.of("Alpha", "Bravo", "Charlie", "Delta", "Echo");
        var surnames = List.of("Miller", "Tanaka", "Schmidt", "Dubois");

        users = IntStream.range(1, 11)
                .mapToObj(id -> new User(id,
                random.nextInt(18, 121),
                names.get(random.nextInt(0, names.size())),
                surnames.get(random.nextInt(0, surnames.size())),
                random.nextDouble(200.0),
                random.nextDouble(50, 210)
        ))
                .toList();
    }

    public void run() {
        record Stats(int ageSum, double weightSum, double heightSum) {

        }

        System.out.printf("3)\n\tAges: %s\n\tWeights: %s\n\tHeights: %s\n",
                Utils.toCommaSeparated(users.stream().map(u -> u.age())),
                Utils.toCommaSeparated(users.stream().map(u -> u.weight())),
                Utils.toCommaSeparated(users.stream().map(u -> u.height()))
        );

        var sums = users.stream().reduce(
                new Stats(0, 0.0, 0.0),
                (acc, u) -> new Stats(acc.ageSum + u.age(), acc.weightSum + u.weight(), acc.heightSum + u.height()),
                (a, b) -> new Stats(a.ageSum + b.ageSum, a.weightSum + b.weightSum, a.heightSum + b.weightSum));

        System.out.printf("\tAge sum: %d; Weight sum: %f; Height sum: %f\n", sums.ageSum, sums.weightSum, sums.heightSum);
    }
}

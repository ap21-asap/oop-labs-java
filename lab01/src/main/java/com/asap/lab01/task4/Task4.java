package com.asap.lab01.task4;

import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

import com.asap.utils.Utils;

public class Task4 {

    public void run() {
        System.out.println("4)\n");
        var random = new Random();
        var brands = List.of("Mazda", "Honda", "Toyota", "Ford");
        var models = List.of("CR5", "KX", "GT", "RPK");
        var colors = List.of("red", "green", "blue");

        var carsStream = IntStream.rangeClosed(1, 10).mapToObj(v -> new Car(
                random.nextInt(65, 350),
                random.nextDouble(0.9, 8.6),
                Utils.getRandomElement(brands),
                Utils.getRandomElement(models),
                random.nextInt(1975, 2026),
                Utils.getRandomElement(colors),
                random.nextBoolean()
        ));

        record Sums(int horsePower, double volume) {

        }

        var sums = carsStream.reduce(new Sums(0, 0.0),
                (acc, c) -> new Sums(acc.horsePower + c.getHorsepower(), acc.volume + c.getEngineVolume()),
                (a, b) -> new Sums(a.horsePower + b.horsePower, a.volume + b.volume)
        );

        System.out.printf("\tVolumes sum: %f; Powers sum: %d\n", sums.volume, sums.horsePower);
    }
}

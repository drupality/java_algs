package pl.drupality;

import java.time.Duration;
import java.time.Instant;

/**
 * Created by marek.kisiel on 28/11/16.
 */
public class BubbleSorterMain {

    public static void main(String[] args) {
        int max = 100000;
        HighArray array = new HighArray(max);

        for (int j = 0; j < max; j++) {
            int n = (int) (Math.random() * (max - 1));
            array.insert(n);
        }

        BubbleSorter sorter = new BubbleSorter();


        Instant start = Instant.now();
        sorter.sort(array);
        Instant end = Instant.now();
        System.out.println(Duration.between(start, end)); // p

        System.out.println(array);
    }

}

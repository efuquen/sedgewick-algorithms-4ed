import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

import java.util.Optional;

public class RandomWord {
    public static void main(String[] args) {
        Optional<String> champion = Optional.empty();
        int i = 1;
        while (!StdIn.isEmpty()) {
            String currentWord = StdIn.readString();
            if (!champion.isPresent() || StdRandom.bernoulli(1.0/i)) {
                champion = Optional.of(currentWord);
            }
            i += 1;
        }
        System.out.println(champion.get());
    }
}

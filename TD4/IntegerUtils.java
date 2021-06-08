import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class IntegerUtils {
    public static List<Integer> allMatches(List<Integer> candidates, Predicate<Integer> matchFunction) {
        return candidates.stream().filter(matchFunction).collect(Collectors.toList());
    }

    public static List<Integer> transformedList(List<Integer> originals, Function<Integer, Integer> transformer) {
        return originals.stream().map(transformer).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 100, 1000, 10000, 100000);
        allMatches(list, (i) -> i > 500).forEach(System.out::println);
        transformedList(list, (i) -> i / 5).forEach(System.out::println);
    }
}

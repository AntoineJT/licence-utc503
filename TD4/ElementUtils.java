import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ElementUtils {
    public static <T> List<T> allMatches(List<T> candidates, Predicate<T> matchFunction) {
        return candidates.stream().filter(matchFunction).collect(Collectors.toList());
    }

    public static <T, U> List<U> transformedList(List<T> originals, Function<T, U> transformer) {
        return originals.stream().map(transformer).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Jordan", "Incredible", "Wow", "Lol", "Scala", "Michel");
        allMatches(list, (str) -> str.length() <= 4).forEach(System.out::println);
        allMatches(list, (str) -> str.contains("b")).forEach(System.out::println);
        allMatches(list, (str) -> str.length() % 2 == 0).forEach(System.out::println);
    }
}

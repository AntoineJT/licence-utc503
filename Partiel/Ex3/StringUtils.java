import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

// Question 1
public class StringUtils {
    public static List<String> allMatches(List<String> candidates, Predicate<String> matchFunction) {
        return candidates.stream().filter(matchFunction).collect(Collectors.toList());
    }

    public static List<String> transformedList(List<String> originals, Function<String, String> transformer) {
        return originals.stream().map(transformer).collect(Collectors.toList());
    }
}

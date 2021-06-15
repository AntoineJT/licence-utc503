import java.util.Arrays;
import java.util.List;

// Question 2
public class Application {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Salut", "Bonjour", "Hello", "au revoir", "ciao");
        StringUtils.allMatches(list, str -> str.length() >= 6).forEach(System.out::println);
        StringUtils.allMatches(list, str -> str.length() % 2 == 1).forEach(System.out::println);
        StringUtils.transformedList(list, String::toUpperCase).forEach(System.out::println);
    }
}

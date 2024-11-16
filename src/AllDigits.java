import java.util.regex.*;

public class AllDigits {
    public static void main(String[] args) {
        numberFinder("The new TV show is airing at 18:40");
    }

    public static void numberFinder(String text) {
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}

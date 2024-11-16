import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        numberFinder("The new TV show is airing at 18:40");
        numberFinder("");

        validatePassword("Password123");
        validatePassword("superpass");

        System.out.println(upperAfterLower("asdfasdfsadfA askjDDadD"));

        validateIpAddress("123.123.123.123");
        validateIpAddress("256.156.256.1000");

        startsWith('F',"Flame Fist Fight Dog Mad Fire");
    }


    public static void numberFinder(String text) {
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(text);
        try {
            while (matcher.find()) {
                System.out.println(matcher.group());
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }

    public static void validatePassword(String text) {
        Pattern pattern = Pattern.compile("(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])[0-9a-zA-Z]{8,16}");
        Matcher matcher = pattern.matcher(text);
        try {
            if (matcher.matches()){
                System.out.println("Valid Password");
            } else {
                System.out.println("Invalid Password");
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public static String upperAfterLower(String text){
        Pattern pattern = Pattern.compile("[a-z][A-Z]");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            String match = matcher.group();
            text = text.replaceAll(match,"!"+match+"!");
        }
        return text;
    }

    public static void validateIpAddress(String text) {
        Pattern pattern = Pattern.compile("^((25[0-5]|(2[0-4]|1\\d|[1-9]|)\\d)\\.?\\b){4}$");
        Matcher matcher = pattern.matcher(text);
        try {
            if (matcher.matches()){
                System.out.println("Valid IP address");
            } else {
                System.out.println("Invalid IP address");
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void startsWith(char letter, String text){
        Pattern pattern = Pattern.compile(letter+"[aA-zZ]+");
        Matcher matcher = pattern.matcher(text);
        try {
            while (matcher.find()) {
                System.out.println(matcher.group());
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
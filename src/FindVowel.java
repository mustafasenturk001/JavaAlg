public class FindVowel {
    public static void main(String[] args) {
        System.out.println(stringContainsVowels("Hello")); // true
        System.out.println(stringContainsVowels("TV")); // false
    }

    public static boolean stringContainsVowels(String input) {
        if (input.toLowerCase().contains("a"))
            return true;
        else if (input.toLowerCase().contains("e"))
            return true;
        else if (input.toLowerCase().contains("i"))
            return true;
        else if (input.toLowerCase().contains("o"))
            return true;
        else return input.toLowerCase().contains("u");
    }
}

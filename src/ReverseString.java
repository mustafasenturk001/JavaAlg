public class ReverseString {
    public static void main(String[] args) {
        String str = "hbsdaskdnkjbjk";
        System.out.println(reverseStr(str));
    }

    public static String reverseStr(String in) {
        if (in == null) {
            throw new IllegalArgumentException("Null is not a valid input");
        }

        StringBuilder out = new StringBuilder();

        char[] chars = in.toCharArray();

        for (int i = chars.length - 1; i >= 0; i--) {
            out.append(chars[i]);
        }
        return out.toString();
    }

}

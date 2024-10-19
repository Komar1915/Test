package main.java.pl.oko;

public class StringUtilities {


    public static String Reverse(String str) {
        if (str == null) return null;
        String result = new StringBuilder(str).reverse().toString();
        log("Reverse", str, result);
        return result;
    }


    public static String trimWhitespace(String str) {
        if (str == null) return null;
        String result = str.replaceAll("\\s+", "");
        log("trimWhitespace", str, result);
        return result;
    }


    public static boolean isPalindrome(String str) {
        if (str == null) return false;
        String cleaned = str.replaceAll("\\s+", "").toLowerCase();
        String palindrome = new StringBuilder(cleaned).reverse().toString();
        boolean result = cleaned.equals(palindrome);
        log("isPalindrome", str, String.valueOf(result));
        return result;
    }


    public static String toCamelCase(String str) {
        if (str == null) return null;
        String[] words = str.trim().split("\\s+");
        StringBuilder camelCaseString = new StringBuilder();
        for (String word : words) {
            if (!word.isEmpty()) {
                camelCaseString.append(Character.toUpperCase(word.charAt(0)))
                        .append(word.substring(1).toLowerCase());
            }
        }
        log("CamelCase", str,  camelCaseString.toString());
        return camelCaseString.toString();
    }


    public static boolean containsOnlyDigits(String str) {
        if (str == null) return false;
        boolean result = str.matches("\\d+");
        log("containsOnlyDigits", str, String.valueOf(result));
        return result;
    }


    public static int countCharacterOccurrences(String str, char ch) {
        if (str == null) return 0;
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == ch) count++;
        }
        log("countCharacterOccurrences", str + " (char: " + ch + ")", String.valueOf(count));
        return count;
    }

    private static void log(String methodName, String input, String result) {
        System.out.println("Method: " + methodName + ", Input: '" + input + "', Result: '" + result + "'");
    }


}

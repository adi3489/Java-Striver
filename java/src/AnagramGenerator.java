import java.util.*;


public class AnagramGenerator {
    public static Set<String> getAnagrams(String str) {
        Set<String> result = new HashSet<>();
        if (str == null || str.length() == 0) {
            result.add("");
            return result;
        }

        // Start with the first character
        result.add(String.valueOf(str.charAt(0)));

        // Process each next character
        for (int i = 1; i < str.length(); i++) {
            char ch = str.charAt(i);
            Set<String> newSet = new HashSet<>();

            // For each string already in the set, insert the current char at all positions
            for (String s : result) {
                for (int pos = 0; pos <= s.length(); pos++) {
                    String newStr = s.substring(0, pos) + ch + s.substring(pos);
                    newSet.add(newStr);
                }
            }

            result = newSet;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        Set<String> anagrams = getAnagrams(input);

        System.out.println("All anagrams:");
        for (String s : anagrams) {
            System.out.println(s);
        }
    }
}


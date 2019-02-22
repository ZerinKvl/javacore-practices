
import java.util.ArrayList;

public class SubstringOperations {
    public static void main(String[] args) {

        // System.out.println(isPalindrome(" ama kasak"));
        String example = "badab peeep";
        ArrayList<String> substrings = longestPalindrome(example);
        for (String s : substrings) {
            System.out.println(s);
        }

    }

    public static ArrayList<String> longestPalindrome(String str) {
        ArrayList<String> longestSubStrings = new ArrayList<String>();
        ArrayList<String> substrings = new ArrayList<String>();
        if (str != null && !str.isEmpty() && str.length() <= 1000) {

            String[] splitted = str.split("\\s");

            for (int c = 0; c < splitted.length; c++) {
                splitted[c] = splitted[c].toLowerCase();
                int leng = splitted[c].length();
                for (int i = 0; i < leng; i++) {
                    for (int j = i + 1; j <= leng; j++) {
                        if (leng == 1) {
                            substrings.add(splitted[c]);
                        } else {
                            // if substring is palindrome
                            if (isPalindromeWithRecursive(splitted[c].substring(i, j))) {

                                // if palindrome
                                if (!substrings.contains(splitted[c].substring(i, j))) {
                                    // all substrings that are palindrome are added to list
                                    substrings.add(splitted[c].substring(i, j));
                                }
                            }
                        }
                    }
                }
            }

            longestSubStrings = findLargestLength(substrings);

        } else
            return null;

        return longestSubStrings;
    }

    public static ArrayList<String> findLargestLength(ArrayList<String> list) {
        // ArrayList is used to keep
        // substrings that have longest and same lenght
        ArrayList<String> longestSubstringList = new ArrayList<String>();

        if (list != null) {
            String longestSubstring = null;

            // if there is one substring in the list
            if (list.size() == 1) {
                longestSubstring = list.get(0);
                longestSubstringList.add(list.get(0));
                return longestSubstringList;
            }

            // Initialize longest element
            int longestSubstringSize = list.get(0).length();
            longestSubstring = list.get(0);

            // find longest substring
            for (int i = 1; i < list.size(); i++) {
                if (list.get(i).length() > longestSubstringSize) {
                    longestSubstringSize = list.get(i).length();
                    longestSubstring = list.get(i);
                }
            }
            longestSubstringList.add(longestSubstring);

            list.remove(longestSubstring);
            for (String substring : list) {
                // if there are more than one substring
                // that has same length like 'aba' and 'bab'

                if (substring.length() == longestSubstring.length()) {
                    longestSubstringList.add(substring);
                }
            }
            // return list of longest substring or substrings
            return longestSubstringList;
        }
        return null;
    }

    public static boolean isPalindromeWithRecursive(String str) {
        int sizeOfstr = str.length();
        // An empty string is
        // considered as palindrome
        if (sizeOfstr == 0)
            return true;
        return isPalindromeHelperRec(str, 0, sizeOfstr - 1);
    }

    public static boolean isPalindromeHelperRec(String str, int start, int end) {
        // only one character
        // return true
        if (start == end) {
            return true;
        }

        // If first and last
        // characters do not match it is not palindrome
        if ((str.charAt(start)) != (str.charAt(end))) {
            return false;
        }
        // If there are more than
        // two characters, check if
        // middle substring is also
        // palindrome or not.
        if (start < end + 1) {
            return isPalindromeHelperRec(str, start + 1, end - 1);
        }
        return true;
    }

}

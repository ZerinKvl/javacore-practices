import java.util.Arrays;

public class Anagram {
  final String anagramStr = "ANAGRAM";
  final String notAnagramStr = "NOTANAGRAM";

  public String isAnagram(String firstStr, String secondStr) {
    // to remove whitespaces from strings like "si lent"--> "silent"
    firstStr = firstStr.replaceAll("\\s", "");
    secondStr = secondStr.replaceAll("\\s", "");

    char[] str1ToArray = firstStr.toLowerCase().toCharArray(); //
    char[] str2ToArray = secondStr.toLowerCase().toCharArray();

    sortArray(str1ToArray); // to sort each char array
    sortArray(str2ToArray);

    if (!Arrays.equals(str1ToArray, str2ToArray)) {
      return notAnagramStr;
    }
    return anagramStr;
  }

  public void sortArray(char[] arr) {
    int size = arr.length;
    char temp;
    for (int i = 0; i < size; i++) {
      for (int j = i + 1; j < size; j++) {
        if (arr[i] > arr[j]) {
          temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
    }
  }
}

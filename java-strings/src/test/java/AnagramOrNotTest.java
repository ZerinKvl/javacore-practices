import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class AnagramOrNotTest {
    private AnagramOrNot anagramTestClass;

    @Before
    public void setUp() throws Exception {
        anagramTestClass = new AnagramOrNot();

    }

    @Test
    public void testIsAnagram() {
        String stringFirst0 = "peek";
        String stringSecond0 = "keep";
        assertEquals("ANAGRAM", anagramTestClass.isAnagram(stringFirst0, stringSecond0));
        assertEquals("ANAGRAM", anagramTestClass.isAnagram("pe e k", "keep"));// with whitespace
        assertEquals("ANAGRAM", anagramTestClass.isAnagram("pe e k", "ke ep"));
        assertEquals("ANAGRAM", anagramTestClass.isAnagram("peek", "ke e p"));
        assertEquals("ANAGRAM", anagramTestClass.isAnagram("PEEK", "KEEP"));
        assertEquals("ANAGRAM", anagramTestClass.isAnagram("PE eK", "KE EP"));
        assertEquals("ANAGRAM", anagramTestClass.isAnagram("peek", "KEEP"));
        assertEquals("ANAGRAM", anagramTestClass.isAnagram("pe4k", "KE4P"));

        assertEquals("NOTANAGRAM", anagramTestClass.isAnagram("peekk", "keep"));

    }

    @Test
    public void testSortArray() {
        char[] charArray = { 'k', 'g', 'u', 'i', 'e' };
        char[] sortedArray = { 'e', 'g', 'i', 'k', 'u' };
        anagramTestClass.sortArray(charArray);
        assertArrayEquals(sortedArray, charArray);
    }

}

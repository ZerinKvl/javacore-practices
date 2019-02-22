import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class SubstringOperationsTest {
    private SubstringOperations substringOpTestClass;

    @Before
    public void setUp() throws Exception {
        substringOpTestClass = new SubstringOperations();
    }

    @Test
    public void testLongestPalindrome() {
        ArrayList<String> list = new ArrayList<String>();
        list.add("aba");
        list.add("bab qaqaqaqq");
        assertTrue(substringOpTestClass.longestPalindrome("babad").contains("aba"));
        assertTrue(substringOpTestClass.longestPalindrome("babad").contains("bab"));
        assertTrue(substringOpTestClass.longestPalindrome("b").contains("b"));
        assertTrue(substringOpTestClass.longestPalindrome("bab qaqaqaq").contains("qaqaqaq"));

    }

    @Test
    public void testFindLargest() {
        ArrayList<String> list = new ArrayList<String>();
        ArrayList<String> LongestList = new ArrayList<String>();
        list.add("badab");
        list.add("peek");
        LongestList.add("badab");
        assertEquals(LongestList, substringOpTestClass.findLargestLength(list));

    }

    @Test
    public void testIsPalindromeWithRecursive() {
        assertTrue(substringOpTestClass.isPalindromeWithRecursive("alalala"));
        assertTrue(substringOpTestClass.isPalindromeWithRecursive("a"));
        assertTrue(substringOpTestClass.isPalindromeWithRecursive(""));
        assertTrue(substringOpTestClass.isPalindromeWithRecursive(" "));
        assertTrue(substringOpTestClass.isPalindromeWithRecursive("bb"));
    }

    @Test
    public void testIsPalindromeRec() {
        fail("Not yet implemented");
    }

}
